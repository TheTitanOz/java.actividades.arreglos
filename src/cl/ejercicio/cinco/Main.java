package cl.ejercicio.cinco;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		// Agregue frutas en un arreglo de objetos y en base a petición, cambie los elementos a verduras.

		ArrayList<String> vegetales = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		String respuesta;
		do {
			System.out.println("Ingrese una fruta: ");
			vegetales.add(scanner.nextLine().toUpperCase());
	
			System.out.println("¿Desea agregar otra fruta? SI o NO");
			respuesta = scanner.nextLine().toUpperCase();


		} while (respuesta.equals("SI"));



		do {
			boolean bandera = false;
			System.out.println("VEGETALES");
			for(int i = 0; i < vegetales.size(); i++) {
				System.out.print(vegetales.get(i) + " - ");
			}

			System.out.println("\nIngrese el nombre de la fruta que quiere cambiar: ");
			String frutaBuscada = scanner.nextLine().toUpperCase();
	
			System.out.println("Ingrese el nombre de la verdura: ");
			String verdura = scanner.nextLine().toUpperCase();

			for(int i = 0; i < vegetales.size(); i++) {
				if (vegetales.get(i).equals(frutaBuscada)) {
				vegetales.set(i, verdura);
				bandera = true;
		
				}
			}

			if(!bandera) {
				System.out.println("No se pudo hacer el reemplazo.");
			}
	
			System.out.println("¿Desea cambiar otra fruta por verdura? SI o NO");
			respuesta = scanner.nextLine().toUpperCase();
		} while (respuesta.equals("SI"));

		System.out.println("VEGETALES ACTUALIZADOS");
		for(int i = 0; i < vegetales.size(); i++) {
			System.out.print(vegetales.get(i) + " - ");
		}
		
		scanner.close();

	}

}
