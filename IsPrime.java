package week1.day2;

public class IsPrime {
	public static void main(String[] args) {
	  int input =8;
	  boolean flag = false;

		for(int i = 2; i < input ; i++) {
			
			
			if (input % i == 0) {
				  flag = true;
			}
		}
				
			if (!flag) {
				System.out.println(input + " is prime number " );
				
			}
			else {
				System.out.println(input + " Not a prime number " );}
		}

	}

