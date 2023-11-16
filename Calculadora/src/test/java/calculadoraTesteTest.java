import static org.junit.Assert.*;

import org.junit.Test;

public class calculadoraTesteTest {

	@Test
	public void testsomar() {
		int resultado = calculadoraTeste.somar(5, 70);
		assertEquals(75, resultado);
	}

	@Test(expected = ArithmeticException.class)
	public void testDivisaoPorZero() {
		int resultado = calculadoraTeste.dividir(10, 0);
		assertEquals(10, resultado);
	}

	@Test
	public void testdividir() {
		int resultado = calculadoraTeste.dividir(5, 5);
		assertEquals(1, resultado);

	}

	@Test
	public void testmultiplicar() {
		int resultado = calculadoraTeste.multiplicar(5, 5);
		assertEquals(25, resultado);
	}

	@Test
	public void testsubtrair() {
		int resultado = calculadoraTeste.subtrair(10, 10);
		assertEquals(0, resultado);
	}
}
