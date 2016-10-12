package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

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
    public void testIgnoreBiggerThan1000(){

    	assertEquals(19,Calculator.add("3,1000,1001,6,10"));

    }
	/*@Test
	public void testIfNegative() {
		Calculator.add("-3,6,15");
	}

	@Test
	public final void ifNegative() 
		{
	    Exception exception = null;
	    try {
	        Calculator.add("3,-6,15,-18,46,33");
	    } catch (Exception e) {
	        exception = e;
	    }
	    Assert.assertNotNull(exception);
	    Assert.assertEquals("Negatives not allowed:", exception.getMessage());


	}*/
}