// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		//   
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        
		//set the time of the day to PM
		String timeOfTheDay = "PM";

		//set the time to AM if it's after midnight
		if(hours<12){
			timeOfTheDay = "AM";
		}	
		//make sure that hours after midday will be in the range of 0-12 
		else if(hours>12){
			hours -= 12;}
		
		//make sure to print the minutes that are less then 10 with a zero before
		if(minutes<10){
			//print the hour in the requiered format 
			System.out.println(hours + ":0" + minutes + " " + timeOfTheDay);
		} else{
			System.out.println(hours + ":" + minutes + " " + timeOfTheDay);
	 }
	}
}