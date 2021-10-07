package zoologico;

import java.util.ArrayList;

public class Zoologico {
	
    private String nombreZoo;
    ArrayList<Animal> Zoo;

ArrayList<Ave> AreaAves = new ArrayList<Ave>();
ArrayList<Mamifero> AreaMamifero = new ArrayList<Mamifero>();
ArrayList<Pez> AreaPeces = new ArrayList<Pez>();
ArrayList<Anfibio> AreaAnfibio = new ArrayList<Anfibio>();
ArrayList<Reptil> AreaReptiles = new ArrayList<Reptil> ();



public Zoologico(String nombreZoo) {
	super();
	this.nombreZoo = nombreZoo;
	Zoo = new ArrayList<Animal>();
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
public void calcularAlimentoPorArea() {}

public boolean agrearAnimal(Animal x) {
	// TODO Auto-generated method stub
	return Zoo.add(x);
}


}
