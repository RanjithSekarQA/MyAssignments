package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchApp {
	
	
	public static void main(String[] args) {
		

//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/");
		
		EdgeDriver edgebrowser = new EdgeDriver();
		edgebrowser.get("https://login.salesforce.com/");
		edgebrowser.manage().window().maximize();
		edgebrowser.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		edgebrowser.findElement(By.id("password")).sendKeys("Leaf@123");
		WebElement login = edgebrowser.findElement(By.id("login"));
		login.click();
		String title = edgebrowser.getTitle();
		System.out.println("Sales Force Home " + title);
	}	

}
