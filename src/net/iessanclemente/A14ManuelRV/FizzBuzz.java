package net.iessanclemente.A14ManuelRV;

public class FizzBuzz {
	public String getResult(int number)
	{
		String result="";
		
		if(number%5==0 && number%3==0)
			result = "fizzbuzz";
		
		else if(number%3==0)
			result = "fizz";
		
		else if(isMultipleOfFive(number)|| isContainsFive(number))
			result = "buzz";
		
		else
			result = Integer.toString(number);
		
		return result;
	}
	
	private static boolean isMultipleOfFive(int number)
	{
		return number % 5 == 0;
	}
	
	private static boolean isContainsFive(int number)
	{
		String numberName = Integer.toString(number);
		return numberName.contains("5");
	}

}
