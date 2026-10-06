public class Pizza {
    private Masa masa;
    private Salsa salsa;
    private String[] ingredientes;
    private int contadorIngredientes;

    public Pizza(Masa masa, Salsa salsa) {
        this.masa = masa;
        this.salsa = salsa;
        this.ingredientes = new String[10];
        this.contadorIngredientes = 0;
    }

    public void ingresar(String ingrediente) {
        if (contadorIngredientes < ingredientes.length) {
            this.ingredientes[contadorIngredientes] = ingrediente;
            contadorIngredientes++;
        }
    }

    public void armarPizza() {
        System.out.println("Armando pizza con masa " + masa + " y salsa " + salsa);
    }
}