package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {

//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/");

		EdgeDriver edgebrowser = new EdgeDriver();
		edgebrowser.get("http://leaftaps.com/opentaps/control/login");
		edgebrowser.manage().window().maximize();
		WebElement enterUserName = edgebrowser.findElement(By.xpath("//input[@id='username']"));
		WebElement enterPassword = edgebrowser.findElement(By.xpath("//input[@id='password']"));

		WebElement login = edgebrowser.findElement(By.xpath("//input[contains(@class,'decorative')]"))	;

		enterUserName.clear();
		enterUserName.sendKeys("Demosalesmanager");
		enterPassword.clear();
		enterPassword.sendKeys("crmsfa");
		Thread.sleep(2000);
		login.click();

		edgebrowser.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		edgebrowser.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		edgebrowser.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();

		edgebrowser.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Test Leaf Training");
		edgebrowser.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Ranjith");
		edgebrowser.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Sekar");
		edgebrowser.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Test First Name Local");

		edgebrowser.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("TECHNOLOGY");
		edgebrowser.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Test Description");
		edgebrowser.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("ranjith.sekar@gmail.com");

		WebElement dropdown1 = edgebrowser.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select stateDD = new Select(dropdown1);

		stateDD.selectByVisibleText("New York");
		edgebrowser.findElement(By.xpath("//input[@name='submitButton']")).click();

		String title = edgebrowser.getTitle();
		System.out.println("Create page Title  " + title);
	}
		
}
