package zoologico;

public class Mamifero extends Animal {
	private String colorPelaje;

	public Mamifero(String nombre, String sexo, String reproduccion, Double peso, Double alimento, String colorPelaje) {
		super(nombre, sexo, reproduccion, peso, alimento);
		this.colorPelaje = colorPelaje;
		setArea(TipoArea.MAMIFEROS);
		setTipoSangre(TipoSangre.ENDOTERMO);
	}

	public Boolean Amamantar() {
		Boolean puedeAmamantar = false;
		if(getSexo().equals("F")) {
			puedeAmamantar = true;
		}
		return puedeAmamantar;
	}
}
