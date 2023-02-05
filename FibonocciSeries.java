package week1.day2;



public class FibonocciSeries {
	public static void main(String[] args) {
		int firstNum = 0;
		int secNum = 1;



		for (int i = 0; i<11; i++) {
			System.out.println(firstNum);

			int sum = firstNum + secNum;
			firstNum = secNum ;
			secNum	= sum;



		}
	}

}
