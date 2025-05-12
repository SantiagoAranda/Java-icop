import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        
        switch (scanner.nextInt()) {
            case 1:
                Ejercicio1 ejercicio1 = new Ejercicio1();
                ejercicio1.ejecutar();
                break;
            
            case 2:
                Ejercicio2 ejercicio2 = new Ejercicio2();
                ejercicio2.ejecutar();
                break;

            case 3:
                Ejercicio3 ejercicio3 = new Ejercicio3();
                ejercicio3.ejecutar();
                break;

            case 4:
                Ejercicio4 ejercicio4 = new Ejercicio4();
                ejercicio4.ejecutar();
                break;   
                
            case 5:
                Ejercicio5 ejercicio5 = new Ejercicio5();
                ejercicio5.ejecutar();
                break;    
            
            case 6:
                Ejercicio6 ejercicio6 = new Ejercicio6();
                ejercicio6.ejecutar();
                break;
                    
            case 7:
                Ejercicio7 ejercicio7 = new Ejercicio7();
                ejercicio7.ejecutar();
                break;

            case 8:
                Ejercicio8 ejercicio8 = new Ejercicio8();
                ejercicio8.ejecutar();
                break;    
            
            case 9:
                Ejercicio9 ejercicio9 = new Ejercicio9();
                ejercicio9.ejecutar();
                break;
            case 15:
                System.exit(0);
                break;


            default:
                System.out.println("Intentalo de nuevo");
                main(args);
                break;

        }
        scanner.close();
    }
}
