package week3.day1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String input = "I am a software tester";

		String[] myStringArray = input.split(" ");
		String reverseString = "";

		for (int i = 0; i < myStringArray.length; i++) {
			if (i % 2 != 0) {
				char[] charArray = myStringArray[i].toCharArray();

				for (int j = charArray.length - 1; j >= 0; j--) {
					reverseString = reverseString + charArray[j];

				}
				reverseString = reverseString + " ";
			} else {
				reverseString = reverseString + myStringArray[i] + " ";

			}

		}
		System.out.println(reverseString);
	}
}
