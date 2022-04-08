package cl.ejercicio.nueve;

public class Movimiento {
	private String detalle;
	private int valor;
	private boolean ingreso;


	public Movimiento(String detalle, int valor, boolean ingreso) {
		super();
		this.detalle = detalle;
		this.valor = valor;
		this.ingreso = ingreso;
	}


	public String getDetalle() {
		return detalle;
	}


	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}


	public int getValor() {
		return valor;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}


	public boolean isIngreso() {
		return ingreso;
	}


	public void setIngreso(boolean ingreso) {
		this.ingreso = ingreso;
	}


	@Override
	public String toString() {
		return "Movimiento [detalle=" + detalle + ", valor=" + valor + ", ingreso=" + ingreso + "]";
	}

}
