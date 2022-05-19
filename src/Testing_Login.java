import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testing_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\web driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//launch website
		driver.navigate().to("https://www.urbanladder.com/");
		
				//maximize the browser
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
				//click on human icon
				driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']")).click();
			 
			   
				//click on login
			   driver.findElement(By.xpath("//a[@class='login-link authentication_popup']")).click();
				
				
				// enter email on sign up page
				driver.findElement(By.xpath("//input[@class='email required input_authentication']")).sendKeys("varsharawat1611@gmail.com");
				
				//enter password 
				driver.findElement(By.xpath("//input[@class='required input_authentication']")).sendKeys("V@rsha16");
				
				//click on login page
				driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}

}
