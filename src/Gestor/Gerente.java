package Gestor;

public class Gerente extends Empleado {
    // Atributos adicionales
    private int antiguedad; // en años
    private double bonusGestion;

    // Constructor
    public Gerente(String nombre, String dni, double salarioBase, int antiguedad, double bonusGestion) {
        super(nombre, dni, salarioBase);
        this.antiguedad = antiguedad;
        this.bonusGestion = bonusGestion;
    }

    // Sobrescribir método para calcular el salario
    @Override
    public double calcularSalario() {
        return salarioBase + (antiguedad * 100) + bonusGestion;
    }

    // Sobrescribir método para mostrar detalles
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Antiguedad: " + antiguedad + " anios");
        System.out.println("Bonus Gestion: " + bonusGestion);
        System.out.println();
    }
}