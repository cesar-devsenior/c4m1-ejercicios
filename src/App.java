import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var input = new Scanner(System.in);
        var salir = false;

        do {
            System.out.print("""
                    .: Ejercicios del Modulo 1 :.
                    =============================
                    1. Verificar numero negativo

                    0. Salir

                    Elija una opcion: """);
            var opcion = input.nextInt();
            input.nextLine();
            switch (opcion) {
                case 1:
                    verificarNumero01(input);
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta!");
                    break;
            }

        } while (!salir);
        System.out.println("Hasta pronto!");
        input.close();
    }

    private static void verificarNumero01(Scanner input) {
        /*
         * Escriba un programa que permita ingresar un número real e identifique si el
         * número es negativo, positivo o cero.
         */
        System.out.print("Por favor, ingrese el numero real a evaluar: ");
        var real = input.nextDouble();

        if(real == 0) {
            System.out.println("El numero es cero.");
        } else if (real < 0) {
            System.out.println("El numero es negativo.");
        } else {
            System.out.println("El numero es positivo.");
        }

    }

}
