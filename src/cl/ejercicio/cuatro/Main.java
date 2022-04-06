package cl.ejercicio.cuatro;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// Llene un arreglo de objetos de manera aleatoria para una librería y luego calcule la inversión inicial de los productos.

		ArrayList<Producto> productos = new ArrayList<Producto>();
		int inversion = 0;

		String [] nombres = {"Lápiz", "Goma", "Regla", "Cuaderno", "Papel lustre", "Cartulina", "Block"};
		int [] valores = {500, 600, 850, 1500, 600, 1500, 2000};

		for(int i = 0; i < nombres.length; i++) {
			productos.add(new Producto(nombres[i], valores[i]));
		}

		for(int i = 0; i < productos.size(); i++) {
			System.out.println(productos.get(i).toString());
			inversion += productos.get(i).getValor();
		}

		System.out.println("Inversión inicial: " + inversion);
		
	}

}
