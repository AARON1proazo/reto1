package reto1;

import java.util.Scanner;

public class Reto1 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int opcion;

        do {
            mostrarMenu();
            opcion = leerEntero("");

            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + funciones1.sumar(pedir("primer"), pedir("segundo")));
                    break;
                case 2:
                    System.out.println("Resultado: " + funciones1.restar(pedir("primer"), pedir("segundo")));
                    break;
                case 3:
                    System.out.println("Resultado: " + funciones1.multiplicar(pedir("primer"), pedir("segundo")));
                    break;
                case 4:
                    int a = pedir("primer");
                    int b = pedir("segundo");
                    if (b == 0) {
                        System.out.println("Error: no se puede dividir entre cero.");
                    } else {
                        System.out.println("Resultado: " + funciones1.dividir(a, b));
                    }
                    break;
                case 5:
                    System.out.println(funciones2.esPar(pedir("")) ? "True" : "False");
                    break;
                case 6:
                    System.out.println(funciones2.esImpar(pedir("")) ? "True" : "False");
                    break;
                case 7:
                    System.out.println(funciones2.esPositivo(pedir("")) ? "True" : "False");
                    break;
                case 8:
                    System.out.println(funciones2.esNegativo(pedir("")) ? "True" : "False");
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }
            System.out.println();
        } while (opcion != 0);

        sc.close();
    }

    static void mostrarMenu() {
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

    // Pide un número entero hasta que el usuario introduce uno válido
    static int pedir(String cual) {
        String texto = cual.isEmpty() ? "Introduce un número: " : "Introduce el " + cual + " número: ";
        return leerEntero(texto);
    }

    static int leerEntero(String mensaje) {
        while (true) {
            if (!mensaje.isEmpty()) {
                System.out.print(mensaje);
            }
            String linea = sc.nextLine().trim();
            try {
                return Integer.parseInt(linea);
            } catch (NumberFormatException e) {
                // En el menú, una entrada no numérica se trata como opción incorrecta
                if (mensaje.isEmpty()) {
                    return -1;
                }
                System.out.println("Entrada no válida. Introduce un número entero.");
            }
        }
	}

}
