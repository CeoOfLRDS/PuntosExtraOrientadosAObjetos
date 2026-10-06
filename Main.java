public class Main {
    public static void main(String[] args) {
        Pizza miPizza = new Pizza(Masa.DELGADA, Salsa.NORMAL);
        miPizza.ingresar("Queso Extra");
        miPizza.ingresar("Jamón");

        Orden miOrden = new Orden(1, miPizza);
        miOrden.nombrarPedido("Ana");
        miOrden.marcarDelivery(true);
        miOrden.mostrarOrden();

        Cocina cocina = new Cocina();
        cocina.hornear(200.0, 20);
        cocina.empacar();
        cocina.enviar();
    }
}