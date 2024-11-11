package Gestor;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Desarrollador y Gerente
        Desarrollador dev1 = new Desarrollador("Juan Ignacio Font", "12345678A", 1500, "Java", 10);
        Gerente ger1 = new Gerente("Miguel Geronimo Font", "87654321B", 2000, 5, 500);

        // Mostrar detalles de cada empleado
        System.out.println("=== Detalles de los Empleados ===");
        dev1.mostrarDetalles();
        ger1.mostrarDetalles();
    }
}