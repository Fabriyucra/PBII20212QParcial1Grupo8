package zoologico;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestZoo {

	@Test
	public void queSePuedaAgregarAnimalesAlZoo(){
		
		Zoo lujan = new Zoo("Lujan");
		
		Animal mamifero1 = new Mamifero("Oso", "Viviparo", 200.0, 10.0, "Negro");
		
		assertTrue(lujan.agrearAnimal(oso));
	}
	
	@Test
	public void queSePuedaEmitirEntrada(){
		
		Zoo lujan = new Zoo("Lujan");
		
		Animal mamifero1 = new Mamifero("Oso", "Viviparo", 200.0, 10.0, "Negro");
		Animal mamifero2 = new Mamifero("Mono", "Viviparo", 200.0, 10.0, "Gris");
		
		lujan.agrearAnimal(mamifero1);
		lujan.agrearAnimal(mamifero2);
		
		lujan.emitirTicket(1,new Persona("Riquelme",45));
		
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

}




