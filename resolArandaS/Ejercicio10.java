import java.util.Scanner;

public class Ejercicio10 {

    public boolean ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una contraseña: ");
        String contrasena = scanner.nextLine();

        if (esSegura(contrasena)) {
            System.out.println("La contraseña es segura.");
            return true;
        } else {
            System.out.println("La contraseña NO es segura.");
            return false;
        }

        // No cerramos el scanner aquí
    }

    private boolean esSegura(String contrasena) {
        if (contrasena.length() < 8) {
            return false;
        }

        int mayusculas = 0;
        int minusculas = 0;
        int digitos = 0;

        for (char c : contrasena.toCharArray()) {
            if (Character.isUpperCase(c)) {
                mayusculas++;
            } else if (Character.isLowerCase(c)) {
                minusculas++;
            } else if (Character.isDigit(c)) {
                digitos++;
            }
        }

        return mayusculas >= 2 && minusculas >= 3 && digitos >= 2;
    }
}
