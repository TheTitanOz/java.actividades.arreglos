package cl.ejercicio.cuatro;

public class Producto {

	private String nombre;
	private int valor;
	
	
	public Producto(String nombre, int valor) {
		super();
		this.nombre = nombre;
		this.valor = valor;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public int getValor() {
		return valor;
	}
	
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", valor=" + valor + "]";
	}

}
