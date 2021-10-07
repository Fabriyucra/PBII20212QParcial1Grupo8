package zoologico;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaAve {

	@Test
	public void test() {
		Ave pajaro = new Ave("Pajaro","Sexual",8.0,5.0,"Rojo");
		 assertNotNull(pajaro);
	}

}
