package zoologico;

public class Animal {
	private String nombre;
	private String sexo;
	private TipoArea area;
	private Double peso;
	private TipoSangre tipoSangre;
	private String reproduccion;
	private Double alimento;

	public Animal(String nombre, String sexo, String reproduccion, Double peso, Double alimento) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.reproduccion = reproduccion;
		this.peso = peso;
		this.alimento = alimento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoArea getArea() {
		return area;
	}

	public void setArea(TipoArea area) {
		this.area = area;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public TipoSangre getTipoSangre() {
		return tipoSangre;
	}

	public void setTipoSangre(TipoSangre tipoSangre) {
		this.tipoSangre = tipoSangre;
	}

	public String getReproduccion() { 
		return reproduccion;
	}

	public void setReproduccion(String reproduccion) {
		this.reproduccion = reproduccion;
	}

	public Double getAlimento() {
		return alimento;
	}

	public void setAlimento(Double alimento) {
		this.alimento = alimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
