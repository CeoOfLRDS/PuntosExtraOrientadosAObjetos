import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame ventana = new JFrame("Pizzeria");
        ventana.setSize(400, 500);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1));

        panel.add(new JLabel("Nombre:"));
        JTextField nombre = new JTextField();
        panel.add(nombre);

        panel.add(new JLabel("Masa:"));
        JComboBox<Masa> masa = new JComboBox<>(Masa.values());
        panel.add(masa);

        panel.add(new JLabel("Salsa:"));
        JComboBox<Salsa> salsa = new JComboBox<>(Salsa.values());
        panel.add(salsa);

        panel.add(new JLabel("Ingredientes:"));

        JCheckBox queso = new JCheckBox("Queso Extra");
        JCheckBox jamon = new JCheckBox("Jamon");
        JCheckBox pepperoni = new JCheckBox("Pepperoni");

        panel.add(queso);
        panel.add(jamon);
        panel.add(pepperoni);

        JCheckBox delivery = new JCheckBox("Delivery");
        panel.add(delivery);

        JButton crear = new JButton("Crear Orden");
        JButton revisar = new JButton("Revisar Orden");

        panel.add(crear);
        panel.add(revisar);

        final Orden[] ordenActual = new Orden[1];

        crear.addActionListener(e -> {

            Pizza pizza = new Pizza(
                    (Masa) masa.getSelectedItem(),
                    (Salsa) salsa.getSelectedItem()
            );

            if (queso.isSelected())
                pizza.ingresar("Queso Extra");

            if (jamon.isSelected())
                pizza.ingresar("Jamon");

            if (pepperoni.isSelected())
                pizza.ingresar("Pepperoni");

            ordenActual[0] = new Orden(1, pizza);

            ordenActual[0].nombrarPedido(nombre.getText());
            ordenActual[0].marcarDelivery(delivery.isSelected());

            JOptionPane.showMessageDialog(
                    ventana,
                    "Orden creada."
            );
        });

        revisar.addActionListener(e -> {

            if (ordenActual[0] == null) {
                JOptionPane.showMessageDialog(
                        ventana,
                        "Primero crea una orden."
                );
                return;
            }

            // Nueva ventana para revisar la orden
            JFrame ventanaOrden = new JFrame("Revisar Orden");
            ventanaOrden.setSize(400, 300);
            ventanaOrden.setLocationRelativeTo(ventana);

            JPanel ordenPanel = new JPanel();
            ordenPanel.setLayout(new BorderLayout());

            JTextArea textoOrden = new JTextArea();

            textoOrden.setEditable(false);

            textoOrden.append("ORDEN\n\n");
            textoOrden.append("Cliente: " + nombre.getText() + "\n");
            textoOrden.append("Masa: " + masa.getSelectedItem() + "\n");
            textoOrden.append("Salsa: " + salsa.getSelectedItem() + "\n");

            textoOrden.append("\nIngredientes:\n");

            if (queso.isSelected())
                textoOrden.append("- Queso Extra\n");

            if (jamon.isSelected())
                textoOrden.append("- Jamon\n");

            if (pepperoni.isSelected())
                textoOrden.append("- Pepperoni\n");

            textoOrden.append(
                    "\nDelivery: " +
                    (delivery.isSelected() ? "Si" : "No")
            );

            ordenPanel.add(
                    new JScrollPane(textoOrden),
                    BorderLayout.CENTER
            );

            ventanaOrden.add(ordenPanel);
            ventanaOrden.setVisible(true);
        });

        ventana.add(panel);
        ventana.setVisible(true);
    }
}