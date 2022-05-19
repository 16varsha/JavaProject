import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testing_SignUp {

	public static void main(String[] args) {
	
	
		System.setProperty("webdriver.chrome.driver", "C:\\web driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

				//maximize the browser
				driver.manage().window().maximize();
				
			
				
				//launch website
				driver.navigate().to("https://www.urbanladder.com/");
				
				
				
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
				//click on human icon
				driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']")).click();
			 
			
			   driver.findElement(By.xpath("//a[@class='signup-link authentication_popup']")).click();
			
				
				
				// enter email on sign up page
				driver.findElement(By.xpath("//input[@class='textfield email required input_authentication email-suggest']")).sendKeys("varsharawat1611@gmail.com");
				
				//enter password 
				driver.findElement(By.xpath("//input[@class='textfield required input_authentication']")).sendKeys("V@rsha16");
				
				//click on singUp page
				driver.findElement(By.xpath("//input[@value='Sign Up']")).click();
	

	}

}
