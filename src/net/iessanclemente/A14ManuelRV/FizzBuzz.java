package net.iessanclemente.A14ManuelRV;

public class FizzBuzz {
	public String getResult(int number)
	{
		String result="";
		
		if(number%3==0)
			result = "fizz";
		else if(number%5==0)
			result = "buzz";
		
		return result;
	}

}
