import java.util.Scanner;

public class Ejercicio9 {

    public int ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String texto = scanner.nextLine();

        if (texto == null || texto.trim().isEmpty()) {
            return 0;
        }

        String[] palabras = texto.trim().split("[\\s,.;:!?¡¿()\"']+");

        

        return palabras.length;
        
    }
    
    public static void main(String[] args) {
        Ejercicio9 ejercicio = new Ejercicio9();
        int cantidadPalabras = ejercicio.ejecutar();
        System.out.println("La cantidad de palabras en la frase es: " + cantidadPalabras);
    }
   
}