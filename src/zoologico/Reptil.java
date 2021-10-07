package zoologico;

public class Reptil extends Animal {

	private String tipoEscamas;
	
	public Reptil(String nombre, String sexo, String reproduccion, Double peso, Double alimento, String tipoEscamas) {
		super(nombre, sexo, reproduccion, peso, alimento);
		this.tipoEscamas = tipoEscamas;
		setArea(TipoArea.REPTILES);
		setTipoSangre(TipoSangre.ECTOTERMO);
	}

	
}
