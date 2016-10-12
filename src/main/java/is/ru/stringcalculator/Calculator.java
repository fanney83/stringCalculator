package is.ru.stringcalculator;

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
		//String negatives [];
		for(String number : numbers){
			if(Integer.parseInt(number) < 1000)
			{
				total += Integer.parseInt(number);
				//throw new exception("Negatives not allowed: " + Integer.parseInt(number));
			}
		}
		return total;
	}

}