package zoologico;

import java.util.ArrayList;

public class Zoologico {
private String nombreZoo;

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

	
	
	
	
	
	public String getNombreZoo() {
		return nombreZoo;
	}

	public void setNombreZoo(String nombreZoo) {
		this.nombreZoo = nombreZoo;
	}
	 
	public void emitirEntrada() {};
public void calcularAnimales() {};
public void calcularAnimalesPorArea() {};
public void calcularAlimentoPorArea() {}; 
}
