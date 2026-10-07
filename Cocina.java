import java.util.ArrayList;
import java.util.List;

public class Cocina {
    private static Orden[] ordAct = new Orden[5]; 
    private List<Orden> ordenes; 
    private int tiempoPrep;

    public Cocina() {
        this.ordenes = new ArrayList<>();
    }

    public int hornear(double temp, int tiempoPrep) {
        this.tiempoPrep = tiempoPrep;
        System.out.println("Horneando a " + temp + "oC durante " + tiempoPrep + " minutos.");
        return this.tiempoPrep;
    }

    public void empacar() {
        System.out.println("La orden ha sido empacada de forma segura.");
    }

    public void enviar() {
        System.out.println("La orden va en camino (Delivery iniciado).");
    }

    public void recibirOrden(Orden orden) {
        ordenes.add(orden);
        System.out.println("Cocina recibió la orden de: " + orden);
    }
}