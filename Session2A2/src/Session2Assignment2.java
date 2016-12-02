import java.util.ArrayList;

public class Session2Assignment2 {
	/*
	 * Generate prime numbers between 1 and 100 using for loop. A prime number
	 * (or a prime) is a natural number greater than 1 that has no positive
	 * divisors other than 1 and itself. A natural number greater than 1 that is
	 * not a prime number is called a composite number. Use for loop and break
	 * statement to achieve this task.
	 */
	public static void main(String[] args) {

		final int RANGE = 100;
		ArrayList<Integer> primes = new ArrayList<Integer>();

		primes.add(1);
		primes.add(2);

		// outter loop iterates 2-100
		for (int i = 3; i <= RANGE; i++) {
			// inner loop looks for zero remainder;
			boolean prime = true;
			for (int j = 2; j < i; j++) {
				if ((i % j) == 0) { // no remainder means not prime
					prime = false;
					break;
				}

			}
			if (prime) primes.add(i); //adds primes to list.
		}
		System.out.println("Prime numbers between 1 and 100:");
		for (int i: primes) {	
			System.out.print(i  + " ");
		}
	}

}
