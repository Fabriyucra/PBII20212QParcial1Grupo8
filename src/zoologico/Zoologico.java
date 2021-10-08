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
		if (areaPeces.size() > 0) {
			return areaPeces.size();
		} else {
			return 0;
		}
	}

	public Integer getAreaMamiferos() {
		if (areaMamiferos.size() > 0) {
			return areaMamiferos.size();
		} else {
			return 0;
		}
	}

	public Integer getAreaAves() {
		if (areaAves.size() > 0) {
			return areaAves.size();
		} else {
			return 0;
		}
	}

	public Integer getAreaAnfibios() {
		if (areaAnfibios.size() > 0) {
			return areaAnfibios.size();
		} else {
			return 0;
		}
	}

	public Integer getAreaReptiles() {
		if (areaReptiles.size() > 0) {
			return areaReptiles.size();
		} else {
			return 0;
		}
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
		Double acum = 0.0;
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

	public Integer obtenerAnimalesZoologico() {

		return getAreaAves() + getAreaAnfibios() + getAreaMamiferos() + getAreaPeces() + getAreaReptiles();
	}

	public Integer obtenerPrecioEntrada(Entrada entrada) {

		for (Entrada e : entradas) {
			if (e.getNumero() == entrada.getNumero()) {
				return e.getPrecio();
			}
			;
		}
		return 0;
	}

}
