
import java.util.Scanner;

public class Ejercicio1 {
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Hola " + nombre );

        scanner.close();
    }
}
