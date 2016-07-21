package cpm.alabi;

public class FizzBuzzExtra {

	public static void main(String[] args) 
	{
		for (int i = 100; i > 0; i--)
		{
			if (((i % 3) == 0) && ((i % 5) == 0) && ((i % 7) == 0))
			{	
				System.out.println("FizzBuzzBang");
			}
			else if (((i % 3) == 0) && ((i % 5) == 0))
			{	
				System.out.println("FizzBuzz");
			}
			else if (((i % 3) == 0) && ((i % 7) == 0))
			{	
				System.out.println("FizzBang");
			}
			else if (((i % 5) == 0) && ((i % 7) == 0))
			{	
				System.out.println("BuzzBang");
			}
			else if ((i % 3) == 0)
			{
				System.out.println("Fizz");
			}
			else if ((i % 5) == 0)
			{
				System.out.println("Buzz");
			}
			else if ((i % 7) == 0)
			{
				System.out.println("Bang");
			}
			else
			{
				System.out.println(i);
			}
			
		}


	}

}
