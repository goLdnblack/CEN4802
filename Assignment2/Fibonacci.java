public class Fibonacci
{
	static long fibonacci(int n)
	{
		// Base case for recursion
		if (n == 0)
			return 0;

		// First two in sequence
		if (n <= 2)
			return 1;

		// Return nth term
		return fibonacci(n - 2) + fibonacci(n - 1);
	}

	public static void main(String[] args)
	{
		int n = Integer.parseInt(args[0]);
		
		System.out.println("The term " + n +" of the Fibonacci sequence is " + fibonacci(n));
	}
}