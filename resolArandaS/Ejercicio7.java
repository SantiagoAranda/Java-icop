import java.util.Scanner;

public class Ejercicio7 {
    public void ejecutar() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 = suma");
        System.out.println("2 = resta");
        System.out.println("3 = multiplicacion");
        System.out.println("4 = division");
        System.out.println("5 = salir");
        System.out.print("Ingrese un numero: ");
        

        switch (scanner.nextInt()) {
            case 1:
                System.out.print("ingrese el primer numero: ");
                int num1 = scanner.nextInt();
                System.out.print("ingrese el segundo numero: ");
                int num2 = scanner.nextInt();

                System.out.println("la suma es: " + (num1 + num2));
                
                break;
            case 2:
                System.out.print("ingrese el primer numero: ");
                int num3 = scanner.nextInt();
                System.out.print("ingrese el segundo numero: ");
                int num4 = scanner.nextInt();

                System.out.println("la resta es: " + (num3 - num4));
                
                break;
            
            case 3:
                System.out.print("Ingrese el primer numero: ");
                int num5 = scanner.nextInt();
                System.out.print("Ingrese el segundo numero: ");
                int num6 = scanner.nextInt();

                System.out.println("La multiplicacion es: " + (num5 * num6));
                
                break;

            case 4:
                System.out.print("ingrese el primer numero: ");
                int num7 = scanner.nextInt();
                System.out.print("ingrese el segundo numero: ");
                int num8 = scanner.nextInt();

                if (num8 != 0) {
                    System.out.println("la division es: " + (num7 / num8));
                } else {
                    System.out.println("no se puede dividir por cero");
                }
                break;   
                
                case 5:
                System.out.println("salir");
                scanner.close();
            default:
                break;

            
        }
        scanner.close();
        
    }
}
