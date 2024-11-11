package Gestor;

public class Desarrollador extends Empleado {
    // Atributos adicionales
    private String lenguajePrincipal;
    private int horasExtras;
    private static final double PAGO_POR_HORA_EXTRA = 50.0; // Pago fijo por hora extra

    // Constructor
    public Desarrollador(String nombre, String dni, double salarioBase, String lenguajePrincipal, int horasExtras) {
        super(nombre, dni, salarioBase);
        this.lenguajePrincipal = lenguajePrincipal;
        this.horasExtras = horasExtras;
    }

    // Sobrescribir método para calcular el salario
    @Override
    public double calcularSalario() {
        return salarioBase + (horasExtras * PAGO_POR_HORA_EXTRA);
    }

    // Sobrescribir método para mostrar detalles
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Lenguaje Principal: " + lenguajePrincipal);
        System.out.println("Horas Extras: " + horasExtras);
        System.out.println();
    }
}