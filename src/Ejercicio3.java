import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in); //inicializamos el scanner

        System.out.print("Ingresar cadena 1: ");
        var cadena1 = scanner.nextLine();

        System.out.print("Ingresar cadena 2: ");
        var cadena2 = scanner.nextLine();

        System.out.print("Ingresar cadena 3: ");
        var cadena3 = scanner.nextLine();

        System.out.print("Ingresar cadena 4: ");
        var cadena4 = scanner.nextLine();

        System.out.print("Ingresar cadena 5: ");
        var cadena5 = scanner.nextLine();

        System.out.print("Ingresar cadena 6: ");
        var cadena6 = scanner.nextLine();

        scanner.close(); //cerrando el scanner

        var lista = new ArrayList<String>();
        lista.add(cadena1);
        lista.add(cadena2);
        lista.add(cadena3);
        lista.add(cadena4);
        lista.add(cadena5);
        lista.add(cadena6);

        var concatenar = "";
        for (var elemento : lista) {
            concatenar = concatenar + elemento;
        }
        System.out.println("Resultado final : " + concatenar);
        System.out.println("El tamaño de la lista es: " + lista.size());
    }
}
