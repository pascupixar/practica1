package orange.calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void existsAdd() {
		App.add("");
		
	}
	
	@Test
	public void sumavacio() {
		assertTrue(App.add("")==0);
	}
	
	@Test
	public void sumaUno() {
		assertTrue(App.add("1")==1);
	}
	
	@Test
	public void sumaDos() {
		assertTrue(App.add("1,2")==3);
	}
	
	@Test
	public void sumatres() {
		assertTrue(App.add("1,2,3")==6);
	}
	
	@Test
	public void sumaLetras() {
		try {
		App.add("1,2,A");
		fail("Estas sumando letras");
		}catch (Exception e) {
			assertTrue(true);
		}
	}
}

