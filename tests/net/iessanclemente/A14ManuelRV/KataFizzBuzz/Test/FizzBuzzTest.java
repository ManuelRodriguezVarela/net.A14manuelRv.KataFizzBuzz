package net.iessanclemente.A14ManuelRV.KataFizzBuzz.Test;

import static org.junit.Assert.*;
import junit.framework.Assert;
import net.iessanclemente.A14ManuelRV.FizzBuzz;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	//incializamos obxecto variable privada para probar os test
	private FizzBuzz fb;
	@Before
	public void setUp() throws Exception {
		//instanciamos o obxecto da clase
		fb = new FizzBuzz();
	}
/*
 * Test that checks number divisible by 3 
 * returns fizz
 */
	@Test
	public void getResultFizzNumberDividable3() {
		assertEquals("fizz", fb.getResult(3));
	}
	
/*
 * Test that checks number divisible by 5 
 * returns buzz
 */
	@Test
	public void getResultBuzzNumberDividable5() {
		assertEquals("buzz", fb.getResult(5));
	}
	
/*
 * Test that checks number divisible by 5 or 3 
 * returns fizzbuzz
 */
	@Test
	public void getResultFizzbuzzNumberDividable5Or3() {
        assertEquals("fizzbuzz", fb.getResult(15));
	}
	
/*
 * Test that checks number not divisible by 5 or 3 and 5 and 3 
 * returns number
 */
	@Test
	public void getResulNumberIfNumberNotDividable5And3And5Or3() {
        assertEquals("2", fb.getResult(2));
	}

}
