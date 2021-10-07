package zoologico;

public class Anfibio extends Animal {
	private TipoRespiracion respiracion;
	
	public Anfibio(String nombre, String sexo, String reproduccion, Double peso, Double alimento, TipoRespiracion respiracion) {
		super(nombre, sexo, reproduccion, peso, alimento);
		this.respiracion = respiracion;
		
	}

	public TipoRespiracion getRespiracion() {
		return respiracion;
	}

	public void setRespiracion(TipoRespiracion respiracion) {
		this.respiracion = respiracion;
	}

	public Boolean nadar() {
		Boolean puedeNadar = false;
		if(getArea().equals(TipoArea.ANFIBIOS)||getArea().equals(TipoArea.PECES)) {
			puedeNadar=true;
		}
		return puedeNadar;
	}
}
