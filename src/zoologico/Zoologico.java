package zoologico;

import java.util.ArrayList;

public class Zoologico {
private String nombreZoo;

ArrayList<Ave> AreaAves = new ArrayList<Ave>();
ArrayList<Mamifero> AreaMamifero = new ArrayList<Mamifero>();
ArrayList<Pez> AreaPeces = new ArrayList<Pez>();
ArrayList<Anfibio> AreaAnfibio = new ArrayList<Anfibio>();
ArrayList<Reptil> AreaReptiles = new ArrayList<Reptil> ();



public Zoologico(String nombreZoo, ArrayList<Ave> areaAves, ArrayList<Mamifero> areaMamifero, ArrayList<Pez> areaPeces,
		ArrayList<Anfibio> areaAnfibio, ArrayList<Reptil> areaReptiles) {
	super();
	this.nombreZoo = nombreZoo;
	AreaAves = areaAves;
	AreaMamifero = areaMamifero;
	AreaPeces = areaPeces;
	AreaAnfibio = areaAnfibio;
	AreaReptiles = areaReptiles;
}

public String getNombreZoo() {
	return nombreZoo;
}

public void setNombreZoo(String nombreZoo) {
	this.nombreZoo = nombreZoo;
}
 
public void emitirEntrada() {};
public void agregarAnimal() {};
public void calcularAnimales() {};
public void calcularAnimalesPorArea() {};
public void calcularAlimentoPorArea() {}; 
}
