package zoologico;

public class Pez extends Animal {
	private String tipoAguaHabitada;

	public Pez(String nombre, String reproduccion, Double peso, Double alimento, String tipoAguaHabitada) {
		super(nombre, reproduccion, peso, alimento);
		this.tipoAguaHabitada = tipoAguaHabitada;
		setArea(TipoArea.PECES);
		setTipoSangre(TipoSangre.ECTOTERMO);
	}

}
