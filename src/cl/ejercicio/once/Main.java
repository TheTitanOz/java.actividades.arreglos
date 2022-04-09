package cl.ejercicio.once;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static Scanner teclado = new Scanner(System.in);
	
	static ArrayList<Articulo> articulos = new ArrayList<>();
	static int montoTotal =0;
	static int cantidadArticulos=0;
	
	static ArrayList<Factura> facturas = new ArrayList<>();
	
	public static void main(String[] args) {
		int articulo= 0;
		while (articulo!=6) {
			articulo = mostrarMenuArticulos();
	
			if(articulo!=6) {
				cantidadArticulos = menu_cantidad_articulos();
				ListaCompra(articulo, cantidadArticulos);
			} else if (articulo == 6) {
				// terminó
			} else {				
				System.out.println("Opción no válida");
			}
			
		} // endwhile
		
		// creamos factura
		crearFactura();
		
		// limpiamos la información para una siguiente factura
		articulos = null;
		articulos = new ArrayList<>();
		montoTotal =0;
		cantidadArticulos=0;
		
	}

	public static int mostrarMenuArticulos( ) {
		System.out.println("Bienvenido!! Ingrese el id del articulo que desea comprar");
		System.out.println("idArticulo[1]cepillo");
		System.out.println("idArticulo[2]televisores");
		System.out.println("idArticulo[3]bicicletas");
		System.out.println("idArticulo[4]autos");
		System.out.println("idArticulo[5]pc");
		System.out.println("presione [6] para salir");

		int menuArticulo = teclado.nextInt(); ;

		return menuArticulo;


		}// aqui termina el metodo mostrar menu articulos

		public static int menu_cantidad_articulos() {
			System.out.println("Cuantos articulos va ha comprar ");
			int menuCantidadArticulos =teclado.nextInt();
	
			return menuCantidadArticulos;
		}//aqui termina metodo menu_cantidad_articulos

		public static void ListaCompra(int articulo, int Cantidad) {

			switch(articulo) {
				case 1:
				{
					Articulo cepillo= new Articulo(1, 1000, "cepillo", Cantidad);
					articulos.add(cepillo);
		
					montoTotal += (cepillo.getPrecio() *  cepillo.getCantidad());
				}
				break;
				
				case 2: // televisor
					Articulo televisor = new Articulo(2,100000,"Televisor",Cantidad);
					articulos.add(televisor);
					montoTotal += (televisor.getPrecio() *  televisor.getCantidad());
					break;
					
				case 3: // bicicleta
					Articulo bici = new Articulo(3,150000,"Bicicleta",Cantidad);
					articulos.add(bici);
					montoTotal += (bici.getPrecio() *  bici.getCantidad());
					break;
					
				case 4: //auto
					Articulo auto = new Articulo(4, 2000,"Auto",Cantidad);
					articulos.add(auto);
					montoTotal += (auto.getPrecio() *  auto.getCantidad());
					break;
					
				case 5: // pc
					Articulo pc = new Articulo(5, 30000000,"Pc",Cantidad);
					articulos.add(pc);
					montoTotal += (pc.getPrecio() *  pc.getCantidad());
					break;
					
				default:
					
					// new throw ....
					System.out.println("No existe el articulo");
			}



		}
		
		static void crearFactura() {
			Factura factura = new Factura(1,montoTotal,articulos);
			
			System.out.println("Factura");
			System.out.println(factura.getFolio());
			
			
			for(int i=0; i<factura.getFacturaArticulos().size(); i++) {
				Articulo articulo = factura.getFacturaArticulos().get(i); 
				System.out.println(articulo.toString());
			}
			
			System.out.println(factura.getValor());
			
			facturas.add(factura);
			
		}
	
	
}
