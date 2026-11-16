package reto1;

import java.util.Scanner;

public class Reto1 {

    public static boolean esNumero(String texto) {
        int inicio = 0;
        if (texto.length() > 0 && texto.charAt(0) == '-') {
            inicio = 1;
        }
        if (texto.length() - inicio < 1 || texto.length() - inicio > 9) {
            return false;
        }
        for (int i = inicio; i < texto.length(); i++) {
            if (!Character.isDigit(texto.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int pedirNumero(Scanner sc, String mensaje) {
        String texto;
        do {
            System.out.print(mensaje);
            texto = sc.nextLine().trim();
            if (!esNumero(texto)) {
                System.out.println("Entrada no válida. Introduce un número entero.");
            }
        } while (!esNumero(texto));
        return Integer.parseInt(texto);
    }

    public static void mostrarMenu() {
        System.out.println("Elige la operación:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Par");
        System.out.println("6. Impar");
        System.out.println("7. Positivo");
        System.out.println("8. Negativo");
        System.out.println("0. Salir");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int a, b;
        boolean salir = false;

        do {
            mostrarMenu();
            String texto = sc.nextLine().trim();

            if (esNumero(texto)) {
                opcion = Integer.parseInt(texto);
            } else {
                opcion = -1;
            }

            switch (opcion) {
                case 1:
                    a = pedirNumero(sc, "Primer número: ");
                    b = pedirNumero(sc, "Segundo número: ");
                    System.out.println("Resultado: " + funciones1.sumar(a, b));
                    break;
                case 2:
                    a = pedirNumero(sc, "Primer número: ");
                    b = pedirNumero(sc, "Segundo número: ");
                    System.out.println("Resultado: " + funciones1.restar(a, b));
                    break;
                case 3:
                    a = pedirNumero(sc, "Primer número: ");
                    b = pedirNumero(sc, "Segundo número: ");
                    System.out.println("Resultado: " + funciones1.multiplicar(a, b));
                    break;
                case 4:
                    a = pedirNumero(sc, "Primer número: ");
                    b = pedirNumero(sc, "Segundo número: ");
                    if (b == 0) {
                        System.out.println("Error: no se puede dividir entre cero.");
                    } else {
                        System.out.println("Resultado: " + funciones1.dividir(a, b));
                    }
                    break;
                case 5:
                    a = pedirNumero(sc, "Número: ");
                    System.out.println(funciones2.esPar(a));
                    break;
                case 6:
                    a = pedirNumero(sc, "Número: ");
                    System.out.println(funciones2.esImpar(a));
                    break;
                case 7:
                    a = pedirNumero(sc, "Número: ");
                    System.out.println(funciones2.esPositivo(a));
                    break;
                case 8:
                    a = pedirNumero(sc, "Número: ");
                    System.out.println(funciones2.esNegativo(a));
                    break;
                case 0:
                    System.out.println("Fin del programa.");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción incorrecta.");
                    break;
            }
            System.out.println();
        } while (!salir);

        sc.close();
    }
}