package week3.day1;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String Text = "We learn java basics as part of java sessions in java week1";
		int count =0;
		String str = "";
		String[] myStringArray = Text.split(" ");
		
		for (int i =0 ; i<myStringArray.length;i++) {
			for (int j = 0;j<myStringArray.length;j++ ) {
				if(myStringArray[i].equals(myStringArray[j])) {
					count  =count +1;
				}
			}
			if (count> 1) {
				myStringArray[i] = "";
									
					
				}
			System.out.println(myStringArray[i]); 
			}
				
		}

	}


