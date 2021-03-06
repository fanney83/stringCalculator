package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Rule;

public class CalculatorTest {

	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber() {
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testTwoNumbers() {
		assertEquals(3, Calculator.add("1,2"));
	}

	@Test
	public void testMultipleNumbers() {
		assertEquals(6, Calculator.add("1,2,3"));
	}

	@Test
	public void testWithNewLine() {
		assertEquals(24, Calculator.add("3,6\n15"));
	}

	@Test
	public final void ifNegative() {
	    	Exception exception = null;
		   	try {
		        Calculator.add("1,-2");
		    } catch (Exception e) {
		        exception = e;
	    }
	}

	@Test
	public final void ifTwoNegatives() {
		Exception exception = null;
		   	try {
		        Calculator.add("3, -5, 6, 9");
		    } catch (Exception e) {
		        exception = e;
	    }
	}
	@Test
	public void ifOver1000() {
		assertEquals(45, Calculator.add("1000,5,3000,40"));
	}



}
