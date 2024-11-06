// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		//insert the inputs into variables 
		int currentValue = Integer.parseInt(args[0]);
		double rate = (Double.parseDouble(args[1]));
		int years = Integer.parseInt(args[2]);

		//calculating and printing the future value of the money
		double futureValue = currentValue * Math.pow(1+(rate/100), (double)years);

		System.out.println("After " + years + " years, " + currentValue + "$ saved at " +
		rate + "% will yield $" + (int)futureValue);

	}
}