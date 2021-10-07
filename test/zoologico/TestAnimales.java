package zoologico;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestAnimales {

	@Test
	public void queUnPezPuedaNadar() {
		
		Animal pez1 = new Pez("Pez Globo","M", "Oviparo", 0.3, 0.3, "Salada");
		
		System.out.println(pez1.getArea());
		
	}
}
