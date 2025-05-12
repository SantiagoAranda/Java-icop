import java.util.Scanner;

public class Ejercicio4 {
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ingrese una palabra: ");
        String palabra = scanner.nextLine();

        if (Palindromo(palabra)) 
            System.out.println("La palabra es un palíndromo");
        else
            System.out.println("La palabra no es un palíndromo");{
            
        }
        scanner.close();
    }
    public static boolean Palindromo(String palabra) {
        palabra = palabra.toLowerCase();

        int izquierda = 0;
        int derecha = palabra.length() - 1;

        while (izquierda < derecha) {
            if (palabra.charAt(izquierda) != palabra.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
            
        }
        return true;

    }
}
