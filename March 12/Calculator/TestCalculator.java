package Calculator;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

class TestCalculator {
	
	@Test
	public void test() {
		Calculator cal = new Calculator();
		
		// test the sum function 
		int answer = cal.sum(9,20);
		assertEquals(29,answer);
		
		// test the multiply function
		answer = cal.multiply(3, 2);
		assertEquals(6,answer);
		
		// test the divide function
		answer = cal.divide(5, 2);
		assertEquals(2, answer);
		
	}
}
