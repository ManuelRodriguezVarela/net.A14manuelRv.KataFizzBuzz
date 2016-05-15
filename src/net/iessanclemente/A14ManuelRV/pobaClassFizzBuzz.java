package net.iessanclemente.A14ManuelRV;

public class pobaClassFizzBuzz 
{
	public static void main(String[] args)
	{
		FizzBuzz proba = new FizzBuzz();
		
		int i = 0;
		
		for(i = 0; i < 100; i++)
		{
			System.out.println(proba.getResult(i) + "\n");
		}
	}
}
