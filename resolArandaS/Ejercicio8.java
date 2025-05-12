import java.util.Scanner;

public class Ejercicio8 {

    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Conversor de Temperatura");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        System.out.print("Seleccione una opción (1 o 2): ");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            System.out.print("Ingrese grados Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println(celsius + " °C = " + fahrenheit + " °F");
        } else if (opcion == 2) {
            System.out.print("Ingrese grados Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println(fahrenheit + " °F = " + celsius + " °C");
        } else {
            System.out.println("Opción inválida.");
        }

        scanner.close();
    }
}