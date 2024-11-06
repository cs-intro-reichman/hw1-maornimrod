// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		//insert th inputs into variables of the names and the bill 
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		int fullBill = Integer.parseInt(args[3]);

		//calculating the value that each person needs to pay by deviding the bill to 3 
		double eachPays = Math.ceil((double)fullBill/3);

		System.out.println("Dear " + name3 + ", " + name2 + ", and " + name1 + ": pay " + eachPays + " Shekels each.");
	}
}
