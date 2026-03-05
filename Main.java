package introduccion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

                // aca estan las variables globales para que se  usen en todo elprograma
    static List<String> estudiantes = new ArrayList<>();
    static List<Double> calificaciones = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

                       System.out.println("Bienvenido al sistema de gestión de estudiantes.");

        int opcion;

        do {

            mostrarMenu();

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Debe ingresar un número.");
                opcion = -1;
            }

            switch (opcion) {

                case 1:
                    agregarEstudiante(scanner);
                    break;

                case 2:
                    mostrarEstudiantes();
                    break;

                case 3:
                    calcularPromedio();
                    break;

                case 4:
                    mostrarMayorCalificacion();
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida.");

            }

        } while (opcion != 5);

        scanner.close();}

                  // el menu :-)
    static void mostrarMenu() {
        System.out.println("\n1. Agregar estudiante");
        System.out.println("2. Mostrar lista de estudiantes");
        System.out.println("3. Calcular promedio de calificaciones");
        System.out.println("4. Mostrar estudiante con la calificación más alta");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");}

                                          // aqui agrego al estudiante y su calificacion a las listas que corresponde
    static void agregarEstudiante(Scanner scanner) {

        try {

            System.out.print("Ingrese el nombre del estudiante: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese la calificación: ");
            double calificacion = Double.parseDouble(scanner.nextLine());

            if (calificacion < 0 || calificacion > 100) {
                System.out.println("La calificación debe estar entre 0 y 100.");
                return; }

            estudiantes.add(nombre);
            calificaciones.add(calificacion);

            System.out.println("Estudiante agregado correctamente.");

        } catch (Exception e) {
            System.out.println("Error al ingresar datos.");
        }

    }
                                              // aqui me pide mostrar el estudiante
    static void mostrarEstudiantes() {

        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }

        System.out.println("\nLista de estudiantes:");

        for (int i = 0; i < estudiantes.size(); i++) {

            System.out.println(estudiantes.get(i) + 
            " - Calificación: " + calificaciones.get(i));}
    }

 // en este mefodo se calcula el promedio
    static void calcularPromedio() {

        if (calificaciones.isEmpty()) {
            System.out.println("No hay calificaciones registradas.");
            return;
        }

        double suma = 0;

        for (double nota : calificaciones) {
            suma += nota;
        }

        double promedio = suma / calificaciones.size();

        System.out.println("El promedio de calificaciones es: " + promedio);
    }

                                           // aqui puedo ver el alumno con la mejor nota
    static void mostrarMayorCalificacion() {

        if (calificaciones.isEmpty()) {
            System.out.println("No hay calificaciones registradas.");
            return;
        }

        double max = calificaciones.get(0);
        String estudiante = estudiantes.get(0);

        for (int i = 1; i < calificaciones.size(); i++) {

            if (calificaciones.get(i) > max) {

                max = calificaciones.get(i);
                estudiante = estudiantes.get(i);

            }

        }

        System.out.println("El estudiante con mayor calificación es: " +
                estudiante + " con " + max);

    }

}