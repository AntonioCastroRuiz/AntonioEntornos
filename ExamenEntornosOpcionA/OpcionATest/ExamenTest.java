import static org.junit.Assert.*;

import org.junit.Test;

public class ExamenTest {

	@Test
	public void test() {
		String resultado = Examen.ordenaMenorMayor(6, 8, 4);
		
		assertEquals(resultado, "2.0 6.0 5.0");   
	}

}
  