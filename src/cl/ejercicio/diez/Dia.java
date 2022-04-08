package cl.ejercicio.diez;

public class Dia {
	String Tarea;
	String fecha;
	boolean realizado;

	public Dia(String tarea, String fecha) {
		super();
		Tarea = tarea;
		this.fecha = fecha;
		this.realizado= false;
	}
	
	public String getTarea() {
		return Tarea;
	}
	
	public void setTarea(String tarea) {
		Tarea = tarea;
	}
	
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "Dia [Tarea=" + Tarea + ", fecha=" + fecha + "]";
	}
	public void setRealizado(boolean realizado) {
		this.realizado = realizado;
	}
	public boolean getRealizado() {
		return realizado;
	}

}
