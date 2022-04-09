package cl.ejercicio.diez;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<Dia>diaslista= new ArrayList<Dia>();

		Scanner ingresoPantalla = new Scanner(System.in);

		boolean salir = false;
		int opcion;

		do {
			System.out.println("[1] agregue espacio");
			System.out.println("[2] tareas realizadas");
	
			try {
				System.out.println("Escribe una de las opciones");
				opcion = ingresoPantalla.nextInt();
				ingresoPantalla.nextLine();
				switch (opcion) {
					case 1:
						System.out.println("Agrega una tarea a realizar ");
						String txt =ingresoPantalla.nextLine();
						diaslista.add(new Dia(txt, "4-8-2020" ));
					break;
			
			
					case 2:
						for(int i=0; i<diaslista.size(); i++) {
							System.out.println(diaslista.get(i).toString());
						}
					break;
					
					case 0:
						salir = true;
						break;
						
					default:
						System.out.println("Solo números entre 1 y 2");
				}
		
			}catch (InputMismatchException e) {
				System.out.println("Debes insertar un número");
			}
		} while(!salir);
		
		ingresoPantalla.close();
		
	}
}
