package zoologico;

public class Mamifero extends Animal {
	private String colorPelaje;

	public Mamifero(String nombre, String reproduccion, Double peso, Double alimento, String colorPelaje) {
		super(nombre, reproduccion, peso, alimento);
		this.colorPelaje = colorPelaje;
		setArea(TipoArea.MAMIFEROS);
		setTipoSangre(TipoSangre.ENDOTERMO);
	}

}
