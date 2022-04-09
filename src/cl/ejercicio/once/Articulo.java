package cl.ejercicio.once;

public class Articulo {
	private int id;
	private int precio;
	String nombre;
	private int cantidad;

	// constructor por defecto, crea todos los attr, con sus valores "vacíos"
	public Articulo(){
	}

	public Articulo(int id, int precio, String nombre, int cantidad) {
		super();
		this.id = id;
		this.precio = precio;
		this.nombre = nombre;
		this.cantidad = cantidad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	// se obtiene el código HASH
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	// comparamos el objeto con otro
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	// en base al objeto, creamos uno "secundario"
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	// ejecutamos una acción de tipo "garbage collector" cuando liberamos espacio/memoria
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	// metodo tostring
	@Override
	public String toString() {
		return "Articulo [id=" + id + ", precio=" + precio + ", nombre=" + nombre + ", cantidad=" + cantidad + "]";
	}
	
	
}
