package estd;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
	@Test 
	public void somarTest(){
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.somar(5, 3);
		Assert.assertEquals(8, resultado);
	}
	public void subtrairTest(){
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.subtrair(5, 3);
		Assert.assertEquals(8, resultado);
	}
	public void multiplicarTest(){
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.multiplicar(5, 3);
		Assert.assertEquals(8, resultado);
	}
	public void dividirTest(){
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.dividir(10, 2 );
		Assert.assertEquals(8, resultado);
	}
}