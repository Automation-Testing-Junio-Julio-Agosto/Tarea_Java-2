import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in); //inicializamos el scanner

        System.out.print("Ingresar numero 1: ");
        var numero1 = scanner.nextLine();
        System.out.print("Ingresar numero 2: ");
        var numero2 = scanner.nextLine();
        System.out.print("Ingresar numero 3: ");
        var numero3 = scanner.nextLine();
        System.out.print("Ingresar numero 4: ");
        var numero4 = scanner.nextLine();

        scanner.close(); //cerrando el scanner

        var sumarIntegers=sumarIntegersString(numero1,numero2);
        System.out.println("La suma de enteros es: " + sumarIntegers);

        var sumarDoubles=sumarDoublesString(numero3,numero4);
        System.out.println("La suma de decimales es: " + sumarDoubles);
    }

    public static int sumarIntegersString(String numero1,String numero2){
       return Integer.parseInt(numero1) + Integer.parseInt(numero2);
    }

    public static double sumarDoublesString(String numero3,String numero4){
        return Double.parseDouble(numero3) + Double.parseDouble(numero4);
    }
}
