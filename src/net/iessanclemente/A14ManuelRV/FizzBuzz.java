package net.iessanclemente.A14ManuelRV;

public class FizzBuzz {
	public String getResult(int number)
	{
		String result="";
		
		if(number%5==0 && number%3==0)
			result = "fizzbuzz";
		else if(number%3==0)
			result = "fizz";
		else if(number%5==0)
			result = "buzz";
		else
			result = Integer.toString(number);
		
		return result;
	}

}
