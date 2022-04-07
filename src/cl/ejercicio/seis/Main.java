package cl.ejercicio.seis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> verduras = new ArrayList<String>();

		Scanner scanner = new Scanner(System.in);
		String respuesta;
		do {
			System.out.println("Ingrese una verdura: ");
			verduras.add(scanner.nextLine().toUpperCase());
			
			System.out.println("¿Desea agregar otra verdura? SI o NO");
			respuesta = scanner.nextLine().toUpperCase();
			
		
		} while (respuesta.equals("SI"));
		
		System.out.println("antes");
		
		for( int i=0; i<verduras.size(); i++) {
		
			System.out.println( verduras.get(i));
		}
		Collections.sort(verduras);
		
		System.out.println("despues");
		
		for( int i=0; i<verduras.size(); i++) {
			System.out.println( verduras.get(i));
		
		}
		
		scanner.close();

	}

}
