package cl.ejercicio.nueve;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<Movimiento> movimientoList = new ArrayList <Movimiento>();
		Scanner scn = new Scanner(System.in);

		int opcion = 0;
		do {
			System.out.println("Seleccione una opcion");
			System.out.println("[1]. Agregar movimientos");
			System.out.println("[2]. Mostrar gastos totales");
			System.out.println("[0]. Salir");
			opcion = scn.nextInt();
			scn.nextLine();
	
			if(opcion == 1) {
				String ndetalle;
				int nvalor;
				boolean ningreso;
				int ingresoEgreso;
		
				System.out.println("Ingrese el detalle de la compra: ");
		
				ndetalle = scn.nextLine();
		
				System.out.println("Indique el valor de la compra: ");
				nvalor = scn.nextInt();
		
				System.out.println("Para un ingreso escriba [1], para un egreso escriba [2]: ");
				ingresoEgreso = scn.nextInt();
				if(ingresoEgreso == 1) {
					ningreso = true;
					movimientoList.add(new Movimiento(ndetalle, nvalor, ningreso));
				} else if (ingresoEgreso ==2) {
					ningreso = false;
					movimientoList.add(new Movimiento(ndetalle, nvalor, ningreso));
				} else {
					System.out.println("No se ingreso el movimiento");
				}
			} else if(opcion == 2) {
				int valorIngreso=0;
				int valorEgreso=0;
				for(int i=0; i<movimientoList.size(); i+=1) {
					if(movimientoList.get(i).isIngreso()) {
						valorIngreso+= movimientoList.get(i).getValor();
					}else {
						valorEgreso+= movimientoList.get(i).getValor();
					}
				}
				System.out.println("Ingresos totales: " +valorIngreso );
				System.out.println("Egreso totales: " +valorEgreso);
				System.out.println("Saldo restante: " +(valorIngreso - valorEgreso));
			} else {
				System.out.println("La opcion ingresada no es valida");
			}

		} while(!(opcion == 0));
		
		
		scn.close();
		
	}
}
