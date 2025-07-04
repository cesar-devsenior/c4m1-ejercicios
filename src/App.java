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
                    9. Venta de camisas

                    0. Salir

                    Elija una opcion: """);
            var opcion = input.nextInt();
            input.nextLine();
            switch (opcion) {
                case 1:
                    verificarNumero01(input);
                    break;
                case 9:
                    ventaCamisas09(input);
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta!");
                    break;
            }

            System.out.println("\nPresione ENTER para continuar");
            input.nextLine();
            limpiarPantalla();

        } while (!salir);
        System.out.println("Hasta pronto!");
        input.close();
    }

    private static void ventaCamisas09(Scanner input) {
        /*
         * Un vendedor al por mayor de camisas ofrece diferentes precios de acuerdo a la
         * cantidad de unidades que le compren. La siguiente tabla muestra la
         * información:
         * 
         * Unidades Precio por unidad
         * [1 - 50] $50.000
         * (50 - 100] $45.000
         * (100 - 150] $40.000
         * (150 - 200] $35.000
         * > 200 $25.000 => (200, oo)
         * Escriba un programa que dado un número de camisas retorne el precio por
         * unidad.
         */

        limpiarPantalla();
        // Leer del teclado el numero de camisas hasta que ingrese un numero "positivo
        // mayor a 0"
        var camisas = 0;
        do {
            System.out.print("Por favor ingresa la cantidad de camisas: ");
            camisas = input.nextInt();
            input.nextLine();

            if (camisas > 0) {
                break;
            }
            System.out.println("El numero de camisas debe ser mayor a cero.");
        } while (true);

        //
        // while (true) {
        //     System.out.print("Por favor ingresa la cantidad de camisas: ");
        //     camisas = input.nextInt();
        //     input.nextLine();
        //
        //     if (camisas > 0) {
        //         break;
        //     }
        //     System.out.println("El numero de camisas debe ser mayor a cero.");
        // }

        // Calcule el precio de la camisa
        var precio = 0;
        if (camisas >= 1 && camisas <= 50) {
            precio = 50_000;
        } else if (camisas > 50 && camisas <= 100) {
            precio = 45_000;
        } else if (camisas > 100 && camisas <= 150) {
            precio = 40_000;
        } else if (camisas > 150 && camisas <= 200) {
            precio = 35_000;
        } else if (camisas > 200) {
            precio = 25_000;
        }
        System.out.printf("El precio por unidad es %,d%n", precio);

        // Opcion 2 - If simplificados
        if (camisas <= 50) {
            precio = 50_000;
        } else if (camisas <= 100) {
            precio = 45_000;
        } else if (camisas <= 150) {
            precio = 40_000;
        } else if (camisas <= 200) {
            precio = 35_000;
        } else {
            precio = 25_000;
        }

        // opcion 3 - Operador ternario
        precio = camisas <= 50 ? 50000
                : camisas <= 100 ? 45000
                        : camisas <= 150 ? 40000
                                : camisas <= 200 ? 35000
                                        : 25000;

        System.out.printf("El precio por unidad es %,d%n", precio);
    }

    private static void limpiarPantalla() {
        // for (int i = 0; i < 50; i++) {
        System.out.println();
        // }
    }

    private static void verificarNumero01(Scanner input) {
        /*
         * Escriba un programa que permita ingresar un número real e identifique si el
         * número es negativo, positivo o cero.
         */
        limpiarPantalla();
        System.out.print("Por favor, ingrese el numero real a evaluar: ");
        var real = input.nextDouble();
        input.nextLine();

        // if (real == 0) {
        // System.out.println("El numero es cero.");
        // } else if (real < 0) {
        // System.out.println("El numero es negativo.");
        // } else {
        // System.out.println("El numero es positivo.");
        // }

        // condicion ? valor true : valor false
        System.out.println(
                real == 0 ? "El numero es cero." : real < 0 ? "El numero es negativo." : "El numero es positivo.");

        var texto = real < 0 ? "error"
                : real < 10 ? "niño"
                        : real < 18 ? "joven" : real < 29 ? "adulto joven" : real < 35 ? "adulto" : "viejo";

    }

}
