package IntroToHashMaps;

import java.util.HashMap;

public class IntroToHashMaps {
	//1. Create a HashMap called roots with Integers for the keys and Doubles for the values.
	HashMap<Integer, Double> roots = new HashMap<Integer, Double>();
	//2. Using a for-loop, add 500 entries to your HashMap. The key entry will be the 
	//   current iteration of the loop (i). The value entry will be the square root of i.
	public static void main(String[] args) {
		HashMap<Integer, Double> roots = new HashMap<Integer, Double>();
		for (int i = 0; i < 500; i++) {
			double root = Math.sqrt(i);
			roots.put(i, root);
			System.out.println("the square root of " + i + " is " + root);
		}
	}
	
	//3. Iterate through all the entries in your HashMap displaying the keys with their respective
	//   square roots (values). Use the following format.
	
	//   The square Root of 0 is 0.0
	//   The square Root of 1 is 1.0
	//   The square Root of 2 is 1.4142135623730951
	//   The square Root of 3 is 1.7320508075688772
}
