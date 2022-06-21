import java.util.Scanner;

public class Ejercicio5 {

    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        var numero = ingresarNumero();
        menu(numero);
        scanner.close();
    }

    static int ingresarNumero() {
        int numero;
        do {
            System.out.print("Ingresar un numero entre 0 y 100: ");
            numero = scanner.nextInt();
        } while (numero <= 0 || numero > 100);

        return numero;
    }

    static void menu(int numero) {
        scanner.nextLine();
        System.out.print("Ingresar letras del A a E: ");
        var menu = scanner.nextLine();

        switch (menu) {
            case "A":
                System.out.println("Numeros Pares:");
                numerosPares(numero);
                break;
            case "B":
                System.out.println("Numeros Impares:");
                numerosImpares(numero);
                break;
            case "C":
                System.out.println("Multiplos de 3:");
                numerosMultiplos3(numero);
                break;
            case "D":
                System.out.println("Multiplos de 5:");
                numerosMultiplos5(numero);
                break;
            case "E":
                terminarJuego();
                break;
            default:
                System.out.println("favor, no sea gracioso");
        }
    }

    static void numerosPares(int numero) {
        for (var i = 0; i <= numero; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }

    static void numerosImpares(int numero) {
        for (var i = 0; i <= numero; i++) {
            if (i % 2 != 0)
                System.out.println(i);
        }
    }

    static void numerosMultiplos3(int numero) {
        for (var i = 0; i <= numero; i++) {
            if (i % 3 == 0)
                System.out.println(i);
        }
    }

    static void numerosMultiplos5(int numero) {
        for (var i = 0; i <= numero; i++) {
            if (i % 5 == 0)
                System.out.println(i);
        }
    }

    static void terminarJuego() {
        System.out.println("Bye, gracias jugar");
    }
}
