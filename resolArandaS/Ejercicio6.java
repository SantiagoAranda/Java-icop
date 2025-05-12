import java.util.Scanner;

public class Ejercicio6 {
    public void ejecutar() {
       int numerorandom = (int) (Math.random() * 100);
       System.out.println(numerorandom);
    
         Scanner scanner = new Scanner(System.in);
        System.out.print("adivina el numero entre 0 y 100: ");
        int numero = scanner.nextInt();

        while (numero != numerorandom) {
            if (numero < numerorandom) {
                System.out.println("mas alto");
            } else {
                System.out.println("mas bajo");
            }
            System.out.print("adivina el numero entre 0 y 100: ");
            numero = scanner.nextInt();
        }
       scanner.close();
        
    }
}
