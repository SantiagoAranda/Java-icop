import java.util.Scanner;

public class Ejercicio2 {
    public void ejecutar() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        }
        else {
            System.out.println("El numero es impar");
        }
        scanner.close();
    }
    
}
