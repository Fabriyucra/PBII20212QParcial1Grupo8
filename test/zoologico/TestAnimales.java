package zoologico;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAnimales {
	
	@Test
	public void queUnPezPertenezcaAAreaPeces() {

		Pez pez1 = new Pez("Pez Globo", "M", "Oviparo", 0.3, 0.3, "Salada");
		
		TipoArea resultadoEsperado= TipoArea.PECES;
		
		assertEquals(resultadoEsperado,pez1.getArea());

	}
	
	@Test
	public void queUnMamiferoPertenezcaAAreaMamifero() {

		Mamifero mamifero1 = new Mamifero("Panda", "F", "Viviparo", 100.0, 30.0, "Blanco Y Negro");
		
		TipoArea resultadoEsperado= TipoArea.MAMIFEROS;
		
		assertEquals(resultadoEsperado,mamifero1.getArea());

	}
	
	@Test
	public void queUnAvePertenezcaAAreaAve() {

		Ave ave1 = new Ave("Loro Barranquero", "M", "Oviparo", 1.0, 0.3, "Verde");
		
		TipoArea resultadoEsperado= TipoArea.AVES;
		
		assertEquals(resultadoEsperado,ave1.getArea());

	}
	
	@Test
	public void queUnAnfibioPertenezcaAAreaAnfibio() {

		Anfibio anfibio1 = new Anfibio("Rana", "M", "Oviparo", 0.2, 0.2, TipoRespiracion.BRANQUEAL);
		
		TipoArea resultadoEsperado= TipoArea.ANFIBIOS;
		
		assertEquals(resultadoEsperado,anfibio1.getArea());

	}

	@Test
	public void queUnReptilPertenezcaAAreaReptil() {

		Reptil reptil1 = new Reptil("Cocodrilo", "M", "Oviparo", 50.0, 20.0, "Triangular");
		
		TipoArea resultadoEsperado= TipoArea.REPTILES;
		
		assertEquals(resultadoEsperado,reptil1.getArea());

	}
	
	@Test
	public void queUnPezPuedaNadar() {

		Pez pez1 = new Pez("Pez Globo", "M", "Oviparo", 0.3, 0.3, "Salada");

		assertTrue(pez1.nadar());

	}

	@Test
	public void queUnAvePuedaVolar() {

		Ave ave1 = new Ave("Loro Barranquero", "M", "Oviparo", 1.0, 0.3, "Verde");

		assertTrue(ave1.volar());

	}

	@Test
	public void queUnMamiferoPuedeAmamantar() {

		Mamifero mamifero1 = new Mamifero("Panda", "F", "Viviparo", 100.0, 30.0, "Blanco Y Negro");

		assertTrue(mamifero1.Amamantar());

	}
	
	@Test
	public void queUnReptilPuedaReptar() {

		Reptil reptil1 = new Reptil("Cocodrilo", "M", "Oviparo", 50.0, 20.0, "Triangular");

		assertTrue(reptil1.reptar());

	}
}
