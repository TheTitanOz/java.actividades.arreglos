package cl.ejercicio.once;

import java.util.ArrayList;

public class Factura {
	private int folio;
	private int valor;
	ArrayList<Articulo> FacturaArticulos = new ArrayList<>();

	public Factura() {

	}
	public Factura(int folio, int valor, ArrayList<Articulo> facturaArticulos) {
		super();
		this.folio = folio;
		this.valor = valor;
		FacturaArticulos = facturaArticulos;
	}
	public int getFolio() {
		return folio;
	}
	public void setFolio(int folio) {
		this.folio = folio;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public ArrayList<Articulo> getFacturaArticulos() {
		return FacturaArticulos;
	}
	public void setFacturaArticulos(ArrayList<Articulo> facturaArticulos) {
		FacturaArticulos = facturaArticulos;
	}
	

}
