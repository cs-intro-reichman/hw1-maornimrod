
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		//insert the input into "limit" 
		int limit = Integer.parseInt(args[0]);
		
		//using math fuction to define a,b,c as random numbers in the given limit
		int a = (int)(Math.random() * limit + 1);
		int b = (int)(Math.random() * limit + 1);
		int c = (int)(Math.random() * limit + 1);

		//finding the minimum value from a,b,c
		int minValue = Math.min(a, b);
		minValue = Math.min(minValue,c);

		//finding the maximum value from a,b,c
		int maxValue = Math.max(a, b);
		maxValue = Math.max(maxValue, c);

		//finding the mid value from a,b and c
		int midValue = a + b + c - minValue - maxValue;

		//print the random numbers in the wy they grilled
		System.out.println(a + " " + b + " " + c);
		//print the random numbers from min to max
		System.out.println(minValue + " " + midValue + " " + maxValue);
	}
}
