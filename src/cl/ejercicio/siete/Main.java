package cl.ejercicio.siete;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		ArrayList<Vehiculos> vehiculosList = new ArrayList<Vehiculos>();

		Scanner scn = new Scanner(System.in);

		int opcion;

		do {
			System.out.println("Sistema de vehiculos, seleccione una opción");
			System.out.println("[1] - Agregar vehiculo");
			System.out.println("[2] - Ver vehiculos");
			opcion = scn.nextInt();
	
			if(opcion==1) {
				int nruedas;
				int npuertas;
				int nventanas;
				System.out.println("Indique el número de ruedas:");
				nruedas = scn.nextInt();
				System.out.println("Indique el número de puertas");
				npuertas = scn.nextInt();
				System.out.println("Indique el número de ventanas");
				nventanas = scn.nextInt();
		
				vehiculosList.add(new Vehiculos(nruedas, npuertas, nventanas));
		
	
			} else if(opcion==2) {
				int totalRuedas=0;
				int totalPuertas=0;
				int totalVentanas=0;
				for(int i=0; i<vehiculosList.size();i++) {
					totalRuedas+= vehiculosList.get(i).getRuedas();
					totalPuertas+= vehiculosList.get(i).getPuertas();
					totalVentanas+= vehiculosList.get(i).getVentanas();
					System.out.println(vehiculosList.get(i).toString());
				}
				System.out.println("Cantidad total de ruedas: "+totalRuedas);
				System.out.println("Cantidad total de puertas: "+totalPuertas);
				System.out.println("Cantidad total de ventanas: "+totalVentanas);
			}else {
				System.out.println("La opción ingresada no es válida");
			}


		}while(opcion!=0);
		
		scn.close();
		
		
	}
}
