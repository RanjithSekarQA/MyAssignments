package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver chrome = new ChromeDriver();

		chrome.get("https://en-gb.facebook.com/");
		chrome.manage().window().maximize();
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		chrome.findElement(By.xpath("//a[text()='Create new account']")).click();

		chrome.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ranjith");
		chrome.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ranjith");
		Thread.sleep(2000);

		chrome.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9514988777");

		chrome.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Mar@2023");

		WebElement day = chrome.findElement(By.xpath("//select[@id='day']"));

		Select dayField = new Select(day);
		
		dayField.selectByValue("8");

		WebElement mth = chrome.findElement(By.xpath("//select[@id='month']"));

		Select month = new Select(mth);
		month.selectByIndex(7);

		WebElement yr = chrome.findElement(By.xpath("//select[@id='year']"));

		Select year = new Select(yr);
		year.selectByVisibleText("1998");
		
		
		chrome.findElement(By.xpath("//label[text()='Female']")).click();

	}

}

