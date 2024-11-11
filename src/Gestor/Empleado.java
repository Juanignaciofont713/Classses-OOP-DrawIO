package Gestor;

public class Empleado {
    // Atributos comunes
    private String nombre;
    private String dni;
    protected double salarioBase; // protected para permitir el acceso desde clases hijas

    // Constructor
    public Empleado(String nombre, String dni, double salarioBase) {
        this.nombre = nombre;
        this.dni = dni;
        this.salarioBase = salarioBase;
    }

    // Método para calcular el salario (se sobrescribirá en clases hijas)
    public double calcularSalario() {
        return salarioBase;
    }

    // Método para mostrar detalles del empleado
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Salario Base: " + salarioBase);
        System.out.println("Salario Total: " + calcularSalario());
    }
}