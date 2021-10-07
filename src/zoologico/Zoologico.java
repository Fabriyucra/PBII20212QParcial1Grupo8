package zoologico;

import java.util.ArrayList;

public class Zoologico {
	
    private String nombreZoo;
    ArrayList<Animal> Zoo;

<<<<<<< HEAD
ArrayList<Animal> areaAves;
ArrayList<Animal> areaMamiferos;
ArrayList<Animal> areaPeces;
ArrayList<Animal> areaAnfibios;
ArrayList<Animal> areaReptiles;

public Zoologico(String nombreZoo) {

	this.nombreZoo = nombreZoo;
	areaAves = new ArrayList<>();
	areaMamiferos = new ArrayList<>();
	areaPeces = new ArrayList<>();
	areaAnfibios = new ArrayList<>();
	areaReptiles = new ArrayList<>();
=======
ArrayList<Ave> AreaAves = new ArrayList<Ave>();
ArrayList<Mamifero> AreaMamifero = new ArrayList<Mamifero>();
ArrayList<Pez> AreaPeces = new ArrayList<Pez>();
ArrayList<Anfibio> AreaAnfibio = new ArrayList<Anfibio>();
ArrayList<Reptil> AreaReptiles = new ArrayList<Reptil> ();



public Zoologico(String nombreZoo) {
	super();
	this.nombreZoo = nombreZoo;
	Zoo = new ArrayList<Animal>();
>>>>>>> DevFabricio
}



public void agregarAnimal(Animal animal) {

	switch (animal.getArea()) {
	case AVES:
		
		break;
	case REPTILES:
		
		break;
	case PECES:
		areaPeces.add(animal);
		
		break;
	case ANFIBIOS:
		
		break;
	case MAMIFEROS:
		areaMamiferos.add(animal);
		
		break;
	default:
		break;
	}
	
	};
	
	public Integer getAreaPeces() {
	return areaPeces.size();
}

	public Integer getAreaMamiferos() {
	return areaMamiferos.size();
}
<<<<<<< HEAD

	
	
	
	
	
	public String getNombreZoo() {
		return nombreZoo;
	}

	public void setNombreZoo(String nombreZoo) {
		this.nombreZoo = nombreZoo;
	}
	 
	public void emitirEntrada() {};
=======
 
public void emitirEntrada() {};
>>>>>>> DevFabricio
public void calcularAnimales() {};
public void calcularAnimalesPorArea() {};
public void calcularAlimentoPorArea() {}

public boolean agrearAnimal(Animal x) {
	// TODO Auto-generated method stub
	return Zoo.add(x);
}


}
