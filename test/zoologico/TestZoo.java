package zoologico;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestZoo {

	@Test
	public void queSePuedaAgregarAnimalesAlZoo(){
		
		Zoo lujan = new Zoo("Lujan");
		
		Animal mamifero1 = new Mamifero("Oso", "Viviparo", 200.0, 10.0, "Negro");
		
		assertTrue(lujan.agrearAnimal(mamifero1));
	}
	
	@Test
	public void queSePuedaEmitirEntrada(){
		
		Zoo lujan = new Zoo("Lujan");
		
		Animal mamifero1 = new Mamifero("Oso", "Viviparo", 200.0, 10.0, "Negro");
		Animal mamifero2 = new Mamifero("Mono", "Viviparo", 200.0, 10.0, "Gris");
		
		lujan.agrearAnimal(mamifero1);
		lujan.agrearAnimal(mamifero2);
		
		lujan.emitirTicket(new Persona("Riquelme",45));
		
	}
	
	@Test
	public void queSePuedaObtenerCantidadDeEntradasVendidas(){
		
		Zoo lujan = new Zoo("Lujan");
		
		Animal mamifero1 = new Mamifero("Oso", "Viviparo", 200.0, 10.0, "Negro");
		Animal mamifero2 = new Mamifero("Mono", "Viviparo", 200.0, 10.0, "Gris");
		
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
		
		Zoo lujan = new Zoo("Lujan");
		
		Animal mamifero1 = new Mamifero("Oso", "Viviparo", 200.0, 10.0, "Negro");
		Animal mamifero2 = new Mamifero("Mono", "Viviparo", 30.0, 3.0, "Gris");
		
		lujan.agrearAnimal(mamifero1);
		lujan.agrearAnimal(mamifero2);
		
		Double resultadoEsperado= 13.0;
		
		assertEquals(resultadoEsperado, lujan.calcularAlimentoArea(TipoArea.MAMIFEROS));
	}
	
	@Test
	public void queSePuedaObtenerCantidadTotalAnimalesEnElZoo(){
		
		Zoo lujan = new Zoo("Lujan");
		
		Animal mamifero1 = new Mamifero("Oso", "Viviparo", 200.0, 10.0, "Negro");
		Animal mamifero2 = new Mamifero("Mono", "Viviparo", 30.0, 3.0, "Gris");
		
		lujan.agrearAnimal(mamifero1);
		lujan.agrearAnimal(mamifero2);
		
		Integer resultadoEsperado= 2;
		
		assertEquals(resultadoEsperado, lujan.obtenerAnimalesZoo());
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




