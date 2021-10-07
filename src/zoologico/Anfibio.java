package zoologico;

public class Anfibio extends Animal {
	private TipoRespiracion respiracion;
	
	public Anfibio(String nombre, String reproduccion, Double peso, Double alimento, TipoRespiracion respiracion) {
		super(nombre, reproduccion, peso, alimento);
		this.respiracion = respiracion;
		
	}

	public TipoRespiracion getRespiracion() {
		return respiracion;
	}

	public void setRespiracion(TipoRespiracion respiracion) {
		this.respiracion = respiracion;
	}

}
