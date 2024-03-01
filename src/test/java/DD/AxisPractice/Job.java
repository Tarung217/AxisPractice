package DD.AxisPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class Job extends Login {

	@SuppressWarnings("deprecation")
	@AfterMethod
	public void jobs() {

		WebDriver driver = Login.driver;
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
		WebElement job = driver.findElement(By.xpath("//a[normalize-space()='Job']"));
		job.click();
		System.out.println("Clicked on Job");

		WebElement slider = driver.findElement(By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']"));
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
		slider.click();
		System.out.println("Clicked on button now its showing Contract Details");

	}
}
