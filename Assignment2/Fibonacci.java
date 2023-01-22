/**
 * Given an integer parameter, the program
 * returns the fibonacci sequence result
 * of the term.
 * <p>
 * The fibonacci sequence is calculated
 * using recursion.
 * @author Jesus Sanchez-Rivera
 */
public class Fibonacci
{
	/**
	 * Default constructor
	 */
	public Fibonacci() {}

	/**
	 * Recursive function to solve for
	 * the fibonacci sequence result of
	 * a given integer value.
	 * @param n Integer representing the fibonacci
 	 * term to solve for
	 * @return The value of the fibonacci sequence given a
 	 * term
	 */
	public static long fibonacci(int n)
	{
		/**
		 * To solve for the fibonacci sequence recursively,
		 * a base case is created to end the recursion
		 * and avoid an infinite loop.
		 */
		// Base case for recursion
		if (n == 0)
			return 0;

		// First two in sequence
		if (n <= 2)
			return 1;

		/**
		 * The return method contains the recursive case,
		 * which are any values greater than the base case.
		 * @return Fibonacci sequence result
		 */
		// Return nth term
		return fibonacci(n - 2) + fibonacci(n - 1);
	}

	/**
	 * Given an integer, calls the recursive
	 * fibonacci function to return the sequence
	 * value.
	 * @param args Integer value
	 */
	public static void main(String[] args)
	{
		/**
		 * The main function expects a paremeter
		 * during the execution to use as the
		 * fibonacci term to calculate.
		 * @param n The fibonacci term
		 */
		int n = 0;

		if (args.length == 0)
			System.out.println("Please enter an integer to calculate the fibonacci sequence value.");
		else
		{
			n = Integer.parseInt(args[0]);
		
			System.out.println("The term " + n +" of the Fibonacci sequence is " + fibonacci(n));
		}

	}
}