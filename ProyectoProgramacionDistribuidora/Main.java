package ProyectoProgramacionDistribuidora;

import model.Planilla;
import model.Empleado;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Planilla planilla = new Planilla();

        System.out.println("Ingrese el ID del empleado:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        System.out.println("Ingrese el nombre del empleado:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el puesto del empleado:");
        String puesto = scanner.nextLine();

        // Ajusta el constructor según tu clase Empleado
        Empleado empleado = new Empleado(id, nombre, puesto);

        planilla.agregarEmpleado(empleado);

        System.out.println("Empleado agregado:");
        System.out.println(empleado);

        System.out.println("Planilla actual:");
        System.out.println(planilla);
    }
}