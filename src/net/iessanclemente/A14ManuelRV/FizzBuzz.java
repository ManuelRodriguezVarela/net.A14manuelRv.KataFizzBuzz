package net.iessanclemente.A14ManuelRV;

/**
 * Class kata fizzbuzz tdd
 * @author: Manuel Rodríguez Varela
 * @version: 15/05/2016
 */
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
	
	/*
	 * if number is multiple of three return true
	 * @param int number
	 * @return boolean true
	 */
	private static boolean isMultipleOfThree(int number) 
	{ 
        return number % 3 == 0; 
    } 
	
	/*
	 * if number is contains three return true
	 * @param int number
	 * @return boolean true
	 */
	private static boolean isContainsThree(int number) 
	{ 
		String numberName = Integer.toString(number);
        return numberName.contains("3"); 
    } 
	
	/*
	 * if number is multiple of five return true
	 * @param int number
	 * @return boolean true
	 */
	private static boolean isMultipleOfFive(int number)
	{
		return number % 5 == 0;
	}
	
	/*
	 * if number is contains five return true
	 * @param int number
	 * @return boolean true
	 */
	private static boolean isContainsFive(int number)
	{
		String numberName = Integer.toString(number);
		return numberName.contains("5");
	}
}
