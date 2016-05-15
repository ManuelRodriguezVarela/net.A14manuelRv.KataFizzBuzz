package net.iessanclemente.A14ManuelRV;

public class FizzBuzz 
{
	public String getResult(int number)
	{
		String result = Integer.toString(number);
		
		if(number%5 == 0 && number%3 == 0)
			result = "fizzbuzz";
		else if(isMultipleOfThree(number)|| isContainsThree(number))
			result = "fizz";
		else if(isMultipleOfFive(number)|| isContainsFive(number))
			result = "buzz";
		
		return result;
	}
	
	private static boolean isMultipleOfThree(int number) 
	{ 
        return number % 3 == 0; 
    } 
	
	private static boolean isContainsThree(int number) 
	{ 
		String numberName = Integer.toString(number);
        return numberName.contains("3"); 
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
