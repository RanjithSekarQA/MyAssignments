package week1.day2;

public class PracticeMethod {

public static void main(String[] args) {
	
	PracticeMethod car = new PracticeMethod();
	
	int regNumber = car.registrationNumber();
	System.out.println("RegistrationNumber is : " + regNumber);
	
	String name = car.name();
	System.out.println("Car Name Is " + name);
	
	int calculateSub = car.calculateSub(10, 5);
	System.out.println("Substraction Value is : " + calculateSub);
	
	int calculateMultiply = car.calculateMultiply(2, 3, 4);
	System.out.println("Multiplication Value is : " + calculateMultiply);
	
	
	int calculateDivide = car.calculateDivide(10, 5);
	System.out.println("Division Value is :" + calculateDivide);
}
	public int registrationNumber() {
		return 3997;
	}
	private String name() {
		return "Ranjith";
	}
	
	void  model() {
		String carModel= "Tata Manza";
		System.out.println("My Car Model is  : " + carModel);
		
	}


	public boolean tyreStatus() {
		return true;
	}

	public int  calculateSub(int num1, int num2) {
		
		return num1-num2;
	}


	public int  calculateMultiply(int num1 , int num2, int num3 ) {
		
		return num1*num2*num3;
	}
	public int  calculateDivide(int num1 , int num2 ) {
		
		return num1/num2  ;
	}

}



