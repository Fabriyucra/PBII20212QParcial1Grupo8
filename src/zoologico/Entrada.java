package zoologico;

public class Entrada {
	private String fechaEntrada;
	private Integer numero;
	private Visitante visitanteQueCompraLaEntrada;
	private TipoEntrada tipo;
	private Integer precio;
	private static Integer numeroSiguiente = 1;

	public Entrada(String fechaEntrada, TipoEntrada tipo, Visitante visitanteQueCompraLaEntrada) {
		this.numero = numeroSiguiente;
		this.fechaEntrada = fechaEntrada;
		this.tipo = tipo;
		this.visitanteQueCompraLaEntrada = visitanteQueCompraLaEntrada;
		this.numeroSiguiente++;
		this.setPrecio();
	}

	public void setNumero(Integer numero) {
		this.numero = numero;

	}

	public Integer getNumero() {
		return numero;
	}

	public Integer getPrecio() {
		return this.precio;

	}

	public void setPrecio() {
		if (visitanteQueCompraLaEntrada.getEdad() > 6) {
			switch (tipo) {
			case PASE_FULL:
				this.precio = 2000;
				break;
			case PASE_TRESAREAS:
				this.precio = 1300;
				break;
			case PASE_ACUATICO:
				this.precio = 500;
				break;
			case PASE_TERRESTRE:
				this.precio = 1200;
				break;
			}
		} else {
			precio = 0;
		}

	}

	public String getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(String fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

}
