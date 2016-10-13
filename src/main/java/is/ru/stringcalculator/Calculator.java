package is.ru.stringcalculator;
import java.util.ArrayList;


public class Calculator {

	public static int add(String text)
	{
		if(text.equals(""))
			return 0;
		if(text.contains(","))
		{	
			return sum(splitNumbers(text));
		}
		if(text.contains("\n"))
		{
			return sum(splitNumbers(text));
		}
		else
			return 1;

	}

	private static int toInt(String number)
	{
		return Integer.parseInt(number);
	}


	private static String[] splitNumbers(String numbers)
	{
		return numbers.split("[,:\n]");
	}


	private static int sum(String[] numbers)
	{
		int total = 0;
		ArrayList<Integer> negativeNumbers = new ArrayList<Integer>();
		int n = 0;

		for(String number : numbers)
		{
			n = toInt(number);

			if(n >= 0 && n < 1000)
			{
				total += n;
			}
			if(n < 0)
			{
				negativeNumbers.add(n);
			}
		}
		if(negativeNumbers.size() > 0)
		{
			throw new RuntimeException("Negatives not allowed:" + negativeNumbers.toString());
		}

		return total;
	}
}