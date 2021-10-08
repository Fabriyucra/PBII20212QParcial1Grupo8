package zoologico;

import java.util.ArrayList;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Zoologico {
	
    private String nombreZoo;
ArrayList<Animal> areaAves;
ArrayList<Animal> areaMamiferos;
ArrayList<Animal> areaPeces;
ArrayList<Animal> areaAnfibios;
ArrayList<Animal> areaReptiles;
ArrayList<Entrada> entradas;

public Zoologico(String nombreZoo) {

	this.nombreZoo = nombreZoo;
	areaAves = new ArrayList<>();
	areaMamiferos = new ArrayList<>();
	areaPeces = new ArrayList<>();
	areaAnfibios = new ArrayList<>();
	areaReptiles = new ArrayList<>();
    entradas = new ArrayList<>();

}

public Boolean agregarAnimal(Animal animal) {

	switch (animal.getArea()) {
	case AVES:
		return areaAves.add(animal);
		
	case REPTILES:
		return areaReptiles.add(animal);
		
	case PECES:
		return areaPeces.add(animal);
		
	case ANFIBIOS:
		return areaAnfibios.add(animal);
		
	case MAMIFEROS:
		return areaMamiferos.add(animal);
		
	default:
		return false;
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
	 
	
public Boolean emitirEntrada(Entrada entrada) {
	
	return entradas.add(entrada);
	

};

public Integer obtenerEntradasVendidas() {
	
	return entradas.size();
}

public Double calcularAlimentoArea(TipoArea area) {
	Double acum=0.0;
	switch (area) {
	
	case AVES:
		for (Animal animal2 : areaAves) {
			acum += animal2.getAlimento();
		}
		return acum;
		
	case REPTILES:
		for (Animal animal2 : areaReptiles) {
			acum += animal2.getAlimento();
		}
		return acum;
		
	case PECES:
		for (Animal animal2 : areaPeces) {
			acum += animal2.getAlimento();
		}
		return acum;
		
	case ANFIBIOS:
		for (Animal animal2 : areaAnfibios) {
			acum += animal2.getAlimento();
		}
		return acum;
		
	case MAMIFEROS:
		for (Animal animal2 : areaMamiferos) {
			acum += animal2.getAlimento();
		}
		return acum;
		
	default:
		return 0.0;
	}
	
}




}
