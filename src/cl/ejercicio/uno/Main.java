package cl.ejercicio.uno;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		//Cree un arreglo de números aleatorios entre 0 y 100, sin repetir los números y que el tamaño máximo del arreglo sea aleatorio.
		
		Random rand = new Random();
		ArrayList<Integer> numerosList = new ArrayList<Integer>();
		
		int max = rand.nextInt(100);

		for (int n=0; n<max; n+=1) {
			
			boolean existe = false;
			int nuevoNumero = rand.nextInt(20);
			
			if (n == 0) {
				numerosList.add(nuevoNumero);
			} else {
				for (int i=0; i<numerosList.size(); i+=1 ) {
					if (numerosList.get(i) == nuevoNumero) {
						existe = true;
						break; // terminar el ciclo
					}
				}
				if (!existe) {
					numerosList.add(nuevoNumero);
				}
			}
		}
		
		for(int i=0; i<numerosList.size(); i+=1) {
			System.out.print(", " +numerosList.get(i));
		}
		
		
	}

}
