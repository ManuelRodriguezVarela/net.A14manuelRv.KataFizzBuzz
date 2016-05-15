package net.iessanclemente.A14ManuelRV;

public class FizzBuzz {
	public String getResult(int number)
	{
		String result="";
		
		if(number%3==0)
			result = "fizz";
		if(number%5==0)
			result = "buzz";
		if(number%5==0 && number%3==0)
			result = "fizzbuzz";
		
		return result;
	}

}
