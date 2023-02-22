package week3.day2;

public class Automation extends MultipleLangauge {

public static void main(String[] args) {
	Automation lang = new Automation ();
	
	lang.java();
	lang.python();
	lang.selenium();
	lang.ruby();
	
}

public void java() {
	System.out.println("java");
	
}

public void selenium() {
	System.out.println("Selenium");
	
}

@Override
public void ruby() {
	System.out.println("ruby");
	
}	
}