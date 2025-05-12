import java.util.Scanner;

public class Ejercicio5 {
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();

        int cantidadVocales = contarVocales(palabra);
        System.out.println("La cantidad de vocales en la palabra es: " + cantidadVocales);

        scanner.close();

    }
    public static int contarVocales(String palabra) {
        palabra = palabra.toLowerCase();
        int contador = 0;

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }
        return contador;
    }
    
}
