import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in); //inicializamos el scanner

        System.out.print("Ingresar numero de Patas1 : ");
        var numeroPatas1 = scanner.nextInt();
        System.out.print("Ingresar peso1: ");
        var peso1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Ingresar nombre del Animal1: ");
        var nombreAnimal1 = scanner.nextLine();

        System.out.print("Ingresar numero de Patas2 : ");
        var numeroPatas2 = scanner.nextInt();
        System.out.print("Ingresar peso2: ");
        var peso2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Ingresar nombre del Animal2: ");
        var nombreAnimal2 = scanner.nextLine();

        scanner.close(); //cerrando el scanner

        saludarAnimal(nombreAnimal1,numeroPatas1);
        saludarAnimal(nombreAnimal2,numeroPatas2);
        var sumaPesos=sumarPesos(peso1,peso2);
        mostrarPesoSumado(sumaPesos);
    }

    public static void saludarAnimal(String nombreAnimal, int patas) {
        var saludo = String.format("Hola soy un %s y tengo %d patas", nombreAnimal, patas);
        System.out.println(saludo);
    }

    public static double sumarPesos(double peso1, double peso2) {
        return peso1 + peso2;
    }

    public static void mostrarPesoSumado(double suma){
        System.out.println("El peso sumado de nosotros es: " + suma);
    }
}
