import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        ex();
        //hasmap();
    }

    static void ex() {

        var scanner = new Scanner(System.in); //inicializamos el scanner

        System.out.print("Ingresar nombre 1: ");
        var nombre1 = scanner.nextLine();
        System.out.print("Ingresar nombre 2: ");
        var nombre2 = scanner.nextLine();
        System.out.print("Ingresar nombre 3: ");
        var nombre3 = scanner.nextLine();
        System.out.print("Ingresar nombre 4: ");
        var nombre4 = scanner.nextLine();
        System.out.print("Ingresar nombre 5: ");
        var nombre5 = scanner.nextLine();
        System.out.print("Ingresar nombre 6: ");
        var nombre6 = scanner.nextLine();
        System.out.print("Ingresar nombre 7: ");
        var nombre7 = scanner.nextLine();

        var listaNombre = new ArrayList<String>();
        listaNombre.add(nombre1);
        listaNombre.add(nombre2);
        listaNombre.add(nombre3);
        listaNombre.add(nombre4);
        listaNombre.add(nombre5);
        listaNombre.add(nombre6);
        listaNombre.add(nombre7);

        var map = new HashMap<Integer, String>();
        for (var i = 1; i <= 7; i++) {
            map.put(i, listaNombre.get(i - 1));
        }

        System.out.print("Ingresar un numero entre 1 y 7: : ");
        var numero = scanner.nextInt();

        scanner.close();

        System.out.println(" El nombre es: " + map.get(numero));
    }
}