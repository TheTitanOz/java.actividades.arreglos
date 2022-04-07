package cl.ejercicio.siete;

public class Vehiculos {

	private int ruedas;
	private int ventanas;
	private int puertas;


	public Vehiculos(int ruedas, int puertas, int ventanas) {
	super();
	this.ruedas = ruedas;
	this.ventanas = ventanas;
	this.puertas = puertas;
	}


	public int getRuedas() {
	return ruedas;
	}


	public void setRuedas(int ruedas) {
	this.ruedas = ruedas;
	}


	public int getVentanas() {
	return ventanas;
	}


	public void setVentanas(int ventanas) {
	this.ventanas = ventanas;
	}


	public int getPuertas() {
	return puertas;
	}


	public void setPuertas(int puertas) {
	this.puertas = puertas;
	}


	@Override
	public String toString() {
	return "Vehiculos [ruedas=" + ruedas + ", ventanas=" + ventanas + ", puertas=" + puertas + "]";
	}
	
	
}
