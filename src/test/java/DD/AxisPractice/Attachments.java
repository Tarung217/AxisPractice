package DD.AxisPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class Attachments extends Login {

	@SuppressWarnings("deprecation")
	@AfterMethod
	public void addattach() {

		WebElement username2 = driver.findElement(By.xpath(" (//a[normalize-space()='Immigration'])[1]"));
		username2.click();
		System.out.println("Navigated to Immigration");

		
		WebElement ele = driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Add'])[2]"));
		ele.click();
		System.out.println("Add button clicked");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Upload = driver.findElement(By.xpath("(//input[@type='file'])[1]"));
		Upload.sendKeys("C:\\Users\\athar\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-02-23 233504.png");
		System.out.println("Document Uploaded");

		WebElement Comm = driver.findElement(By.xpath("//textarea[@placeholder='Type comment here']"));
		Comm.sendKeys("File Uploaded");
		System.out.println("Comments done");

		WebElement save = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		save.click();
		System.out.println("Attachment is Saved");

	}

}
