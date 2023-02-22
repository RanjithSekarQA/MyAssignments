package week3.day1;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
		String test = "changeme";
		//test.toLowerCase();
		String output ="";
		
		char[] charArray = test.toCharArray();
		for (int i=0; i<charArray.length; i++) {
			
			if (i%2 != 0) {
				
				charArray[i]=Character.toUpperCase(charArray[i]);
				
			}
			
				output = output + charArray[i];
				
			
		}
		System.out.println(output);
	}

}
