package zoologico;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestZoo {

	@Test
	public void queSePuedaAgregarAnimalesAlZoologico() {

		Zoologico lujan = new Zoologico("Lujan");

		Animal mamifero1 = new Mamifero("Oso", "M", "Viviparo", 200.0, 10.0, "Negro");

		assertTrue(lujan.agregarAnimal(mamifero1));
	}

	@Test
	public void queSePuedaEmitirEntrada() {

		Zoologico lujan = new Zoologico("Lujan");

		Animal mamifero1 = new Mamifero("Oso", "M", "Viviparo", 200.0, 10.0, "Negro");
		Animal mamifero2 = new Mamifero("Mono", "M", "Viviparo", 200.0, 10.0, "Gris");

		lujan.agregarAnimal(mamifero1);
		lujan.agregarAnimal(mamifero2);

		Entrada entrada1 = new Entrada("7/10/2021", TipoEntrada.PASE_FULL,
				new Visitante("Roman", "Riquelme", 40, 16321250));

		assertTrue(lujan.emitirEntrada(entrada1));
	}

	@Test
	public void queSePuedaObtenerCantidadDeEntradasVendidas() {

		Zoologico lujan = new Zoologico("Lujan");

		Animal mamifero1 = new Mamifero("Oso", "M", "Viviparo", 200.0, 10.0, "Negro");
		Animal mamifero2 = new Mamifero("Mono", "M", "Viviparo", 200.0, 10.0, "Gris");

		lujan.agregarAnimal(mamifero1);
		lujan.agregarAnimal(mamifero2);

		Entrada entrada1 = new Entrada("7/10/2021", TipoEntrada.PASE_FULL,
				new Visitante("Roman", "Riquelme", 40, 16321250));
		Entrada entrada2 = new Entrada("8/10/2021", TipoEntrada.PASE_FULL,
				new Visitante("Junior", "Riquelme", 20, 46321250));
		Entrada entrada3 = new Entrada("10/10/2021", TipoEntrada.PASE_TRESAREAS,
				new Visitante("Martin", "Palermo", 43, 17351250));

		assertTrue(lujan.emitirEntrada(entrada1));
		assertTrue(lujan.emitirEntrada(entrada2));
		assertTrue(lujan.emitirEntrada(entrada3));

		Integer resultadoEsperado = 3;

		assertEquals(resultadoEsperado, lujan.obtenerEntradasVendidas());

	}

	@Test
	public void queSePuedaObtenerPrecioEntrada() {

		Zoologico lujan = new Zoologico("Lujan");

		Animal mamifero1 = new Mamifero("Oso", "M", "Viviparo", 200.0, 10.0, "Negro");
		Animal mamifero2 = new Mamifero("Mono", "M", "Viviparo", 200.0, 10.0, "Gris");

		lujan.agregarAnimal(mamifero1);
		lujan.agregarAnimal(mamifero2);

		Entrada entrada1 = new Entrada("7/10/2021", TipoEntrada.PASE_FULL,
				new Visitante("Roman", "Riquelme", 40, 16321250));
		Entrada entrada2 = new Entrada("8/10/2021", TipoEntrada.PASE_FULL,
				new Visitante("Junior", "Riquelme", 20, 46321250));
		Entrada entrada3 = new Entrada("10/10/2021", TipoEntrada.PASE_TRESAREAS,
				new Visitante("Martin", "Palermo", 43, 17351250));

		assertTrue(lujan.emitirEntrada(entrada1));
		assertTrue(lujan.emitirEntrada(entrada2));
		assertTrue(lujan.emitirEntrada(entrada3)); // Entrada seleccionada $1300

		Integer resultadoEsperado = 1300;

		assertEquals(resultadoEsperado, lujan.obtenerPrecioEntrada(entrada3));

	}

	@Test
	public void queSePuedaCalcularAlimentoPorArea() {

		Zoologico lujan = new Zoologico("Lujan");

		Animal mamifero1 = new Mamifero("Oso", "M", "Viviparo", 200.0, 10.0, "Negro");
		Animal mamifero2 = new Mamifero("Mono", "M", "Viviparo", 30.0, 3.0, "Gris");

		lujan.agregarAnimal(mamifero1);
		lujan.agregarAnimal(mamifero2);

		Double resultadoEsperado = 13.0;

		assertEquals(resultadoEsperado, lujan.calcularAlimentoArea(TipoArea.MAMIFEROS));
	}

	@Test
	public void queSePuedaObtenerCantidadTotalAnimalesEnElZoologico() {

		Zoologico lujan = new Zoologico("Lujan");

		Animal mamifero1 = new Mamifero("Oso", "M", "Viviparo", 200.0, 10.0, "Negro");
		Animal mamifero2 = new Mamifero("Mono", "M", "Viviparo", 30.0, 3.0, "Gris");
		Animal anfibio1 = new Anfibio("rana", "X", "Oviparo", 0.20, 0.02, TipoRespiracion.BRANQUEAL);

		lujan.agregarAnimal(mamifero1);
		lujan.agregarAnimal(mamifero2);
		lujan.agregarAnimal(anfibio1);

		Integer resultadoEsperado = 3;

		assertEquals(resultadoEsperado, lujan.obtenerAnimalesZoologico());
	}
}
