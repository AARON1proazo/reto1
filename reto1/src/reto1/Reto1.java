package reto1;

import java.util.Scanner;

public class Reto1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = -1;

		do {
			System.out.println("\nElige la operación:");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Par");
			System.out.println("6. Impar");
			System.out.println("7. Positivo");
			System.out.println("8. Negativo");
			System.out.println("0. Salir");
			System.out.print("Opción: ");

			opcion = Integer.parseInt(sc.nextLine());

			switch (opcion) {
			case 1 -> {
				System.out.print("Introduce el primer número: ");
				int a = Integer.parseInt(sc.nextLine());
				System.out.print("Introduce el segundo número: ");
				int b = Integer.parseInt(sc.nextLine());
				System.out.println("Resultado: " + funciones1.sumar(a, b));
			}
			case 2 -> {
				System.out.print("Introduce el primer número: ");
				int a = Integer.parseInt(sc.nextLine());
				System.out.print("Introduce el segundo número: ");
				int b = Integer.parseInt(sc.nextLine());
				System.out.println("Resultado: " + funciones1.restar(a, b));
			}
			case 3 -> {
				System.out.print("Introduce el primer número: ");
				int a = Integer.parseInt(sc.nextLine());
				System.out.print("Introduce el segundo número: ");
				int b = Integer.parseInt(sc.nextLine());
				System.out.println("Resultado: " + funciones2.multiplicar(a, b));
			}
			case 4 -> {
				System.out.print("Introduce el dividendo: ");
				int a = Integer.parseInt(sc.nextLine());
				int b;
				do {
					System.out.print("Introduce el divisor (distinto de 0): ");
					b = Integer.parseInt(sc.nextLine());
					if (b == 0) {
						System.out.println("Entrada no válida: el divisor no puede ser 0.");
					}
				} while (b == 0);
				System.out.println("Resultado: " + funciones2.dividir(a, b));
			}
			case 5 -> {
				System.out.print("Introduce un número: ");
				int n = Integer.parseInt(sc.nextLine());
				System.out.println("¿Es par?: " + funciones1.esPar(n));
			}
			case 6 -> {
				System.out.print("Introduce un número: ");
				int n = Integer.parseInt(sc.nextLine());
				System.out.println("¿Es impar?: " + funciones1.esImpar(n));
			}
			case 7 -> {
				System.out.print("Introduce un número: ");
				int n = Integer.parseInt(sc.nextLine());
				System.out.println("¿Es positivo?: " + funciones2.esPositivo(n));
			}
			case 8 -> {
				System.out.print("Introduce un número: ");
				int n = Integer.parseInt(sc.nextLine());
				System.out.println("¿Es negativo?: " + funciones2.esNegativo(n));
			}
			case 0 -> System.out.println("Saliendo de la calculadora...");
			default -> System.out.println("Opción incorrecta. Inténtalo de nuevo.");
			}

		} while (opcion != 0);

		sc.close();
	}
}