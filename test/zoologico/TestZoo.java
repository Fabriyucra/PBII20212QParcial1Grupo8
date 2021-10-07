package zoologico;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestZoo {

	@Test
	public void queSePuedaAgregarAnimalesAlZoologico(){
		
		Zoologico lujan = new Zoologico("Lujan");
		
		Animal mamifero1 = new Mamifero("Oso","M", "Viviparo", 200.0, 10.0, "Negro");
		
		System.out.println(lujan.getAreaMamiferos());
		
		lujan.agregarAnimal(mamifero1);
		
		System.out.println(lujan.getAreaMamiferos());

	}
	
	@Test
	public void queSePuedaEmitirEntrada(){
		
		Zoologico lujan = new Zoologico("Lujan");
		
		Animal mamifero1 = new Mamifero("Oso","M", "Viviparo", 200.0, 10.0, "Negro");
		Animal mamifero2 = new Mamifero("Mono","M", "Viviparo", 200.0, 10.0, "Gris");
		
		lujan.agrearAnimal(mamifero1);
		lujan.agrearAnimal(mamifero2);
		
		lujan.emitirTicket(new Persona("Riquelme",45));
		
	}
	
	@Test
	public void queSePuedaObtenerCantidadDeEntradasVendidas(){
		
		Zoologico lujan = new Zoologico("Lujan");
		
		Animal mamifero1 = new Mamifero("Oso","M", "Viviparo", 200.0, 10.0, "Negro");
		Animal mamifero2 = new Mamifero("Mono","M", "Viviparo", 200.0, 10.0, "Gris");
		
		lujan.agrearAnimal(mamifero1);
		lujan.agrearAnimal(mamifero2);
		
		lujan.emitirTicket(new Persona("Riquelme",45));
		lujan.emitirTicket(new Persona("Bianchi",99));
		lujan.emitirTicket(new Persona("Tevez",40));
		
		Integer resultadoEsperado = 3;
		
		assertEquals(resultadoEsperado, lujan.obtenerEntradasVendidas());
		
	}
	
	@Test
	public void queSePuedaCalcularAlimentoPorArea(){
		
		Zoologico lujan = new Zoologico("Lujan");
		
		Animal mamifero1 = new Mamifero("Oso","M", "Viviparo", 200.0, 10.0, "Negro");
		Animal mamifero2 = new Mamifero("Mono","M", "Viviparo", 30.0, 3.0, "Gris");
		
		lujan.agrearAnimal(mamifero1);
		lujan.agrearAnimal(mamifero2);
		
		Double resultadoEsperado= 13.0;
		
		assertEquals(resultadoEsperado, lujan.calcularAlimentoArea(TipoArea.MAMIFEROS));
	}
	
	@Test
	public void queSePuedaObtenerCantidadTotalAnimalesEnElZoologico(){
		
		Zoologico lujan = new Zoologico("Lujan");
		
		Animal mamifero1 = new Mamifero("Oso","M", "Viviparo", 200.0, 10.0, "Negro");
		Animal mamifero2 = new Mamifero("Mono","M", "Viviparo", 30.0, 3.0, "Gris");
		
		lujan.agrearAnimal(mamifero1);
		lujan.agrearAnimal(mamifero2);
		
		Integer resultadoEsperado= 2;
		
		assertEquals(resultadoEsperado, lujan.obtenerAnimalesZoologico());
	}
	
	@Test
	public void queSePuedaAgregarAveAAreaAves() {
	}
	
	@Test
	public void queSePuedaAgregarReptilAAreaReptil() {
	}
	
	@Test
	public void queSePuedaAgregarPezAAreaPeces() {
	}

	@Test
	public void queSePuedaAgregarMamiferoAAreaMamifero() {
	}

}




