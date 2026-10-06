public class Orden {
    private int prioridad;
    private String nombre;
    private boolean delivery;
    private Pizza pizza; 

    public Orden(int prioridad, Pizza pizza) {
        this.prioridad = prioridad;
        this.pizza = pizza;
    }

    public void nombrarPedido(String nombre) {
        this.nombre = nombre;
    }

    public void marcarDelivery(boolean delivery) {
        this.delivery = delivery;
    }

    public void mostrarOrden() {
        System.out.println("Orden de: " + nombre + " | Prioridad: " + prioridad + " | Delivery: " + delivery);
        pizza.armarPizza();
    }
}