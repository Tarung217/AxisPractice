package DD.AxisPractice;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class immegration extends Login{
	
	@SuppressWarnings("deprecation")
	@AfterMethod
	public void immi() 
	{
		WebDriver driver = Login.driver;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement username2 = driver.findElement(By.xpath(" (//a[normalize-space()='Immigration'])[1]"));
		username2.click();
		System.out.println("Navigated to Immigration");

		WebElement addbutton = driver.findElement(By.xpath(" (//button[@type='button'][normalize-space()='Add'])[1]"));
		addbutton.click();
		System.out.println("Button Clicked");

		WebElement radio1 = driver.findElement(By.xpath("(//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input'])[2]"));
		radio1.click();
		System.out.println("Radio Button Clicked");

		WebElement number1 = driver.findElement(By.xpath(" (//input[@class='oxd-input oxd-input--active'])[2]"));
		number1.click();
		number1.sendKeys("123456");
		System.out.println("Number Button Clicked");
		
		WebElement date1 = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
		date1.click();
		date1.sendKeys("2023-01-01");
		System.out.println("Issued date selected");
		
		WebElement date2 = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]"));
		date2.click();
		date2.sendKeys("2026-01-01");
		System.out.println("Expiry date selected");
		
		
		WebElement eligiblestatus = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]"));
		eligiblestatus.click();
		eligiblestatus.sendKeys("YES");
		System.out.println("Eligible Button Clicked");
			
		WebElement date3 = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[5]"));
		date3.click();
		date3.sendKeys("2023-08-24");
		System.out.println("Eligible review date selected");

		WebElement comments = driver.findElement(By.xpath("(//textarea[@placeholder='Type Comments here'])[1]"));
		comments.click();
		comments.sendKeys("Hello Comments");
		System.out.println("Comments Button Clicked");
		
		WebElement save = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		save.click();
		System.out.println("Data is Saved");

	}

}