package zoologico;

public class Ave extends Animal {

	private String colorPlumaje;

	public Ave(String nombre, String reproduccion, Double peso, Double alimento, String colorPlumaje) {
		super(nombre, reproduccion, peso, alimento);
		this.colorPlumaje = colorPlumaje;
		setArea(TipoArea.AVES);
		setTipoSangre(TipoSangre.ENDOTERMO);
	}
	
	public Boolean volar() {
		Boolean puedeVolar = false;
		if(getArea().equals(TipoArea.AVES)) {
			puedeVolar=true;
		}
		return puedeVolar;
	}

}
