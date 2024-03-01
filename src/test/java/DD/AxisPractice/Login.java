package DD.AxisPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	public static WebDriver driver;
@SuppressWarnings("deprecation")
@Test
public void Log() throws InterruptedException 
{

	System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	System.out.println("Page opened");
	WebElement Log1 = driver.findElement(By.xpath("//input[@name='username']"));	
	Log1.click();
	Log1.sendKeys("Admin");
	System.out.println("Entered Username");
	
	WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
	pass.click();
	pass.sendKeys("admin123");
	System.out.println("Entered Password");
	
	WebElement submit = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
	submit.click();
	System.out.println("Submitted");
	
	WebElement myInfo = driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[6]"));
	myInfo.click();
	System.out.println("Navigated to My info");
	
}

}