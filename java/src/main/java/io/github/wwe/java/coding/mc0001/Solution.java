package io.github.wwe.java.coding.mc0001;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static boolean isPrime(final int potentiallyPrime)
	{
		// check for all relevant numbers if they represent a divisor
		for (int i = 2; i <= potentiallyPrime / 2; i++)
		{
			if (potentiallyPrime % i == 0)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(final String[] args)
	{
		System.out.println(isPrime(4));
		System.out.println(isPrime(7));
		System.out.println(isPrime(42));

		List<Integer> primes = new ArrayList<>();
		for (int i = 2; i < 25; i++)
		{
			if (isPrime(i))
				primes.add(i);
		}
		System.out.println("Primes < 25:" + primes);
	}


}
