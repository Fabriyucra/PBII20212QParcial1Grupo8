package zoologico;

public class Pez extends Animal {
	private String tipoAguaHabitada;

	public Pez(String nombre, String sexo, String reproduccion, Double peso, Double alimento, String tipoAguaHabitada) {
		super(nombre, sexo, reproduccion, peso, alimento);
		this.tipoAguaHabitada = tipoAguaHabitada;
		setArea(TipoArea.PECES);
		setTipoSangre(TipoSangre.ECTOTERMO);
	}

	public Boolean nadar() {
		Boolean puedeNadar = false;
		if(getArea().equals(TipoArea.ANFIBIOS)||getArea().equals(TipoArea.PECES)) {
			puedeNadar=true;
		}
		return puedeNadar;
	}
	
}
