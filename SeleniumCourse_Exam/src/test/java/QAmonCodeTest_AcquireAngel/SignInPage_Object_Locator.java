package QAmonCodeTest_AcquireAngel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage_Object_Locator {
	
private static WebElement element=null;
	
	public static WebElement emailaddress(WebDriver driver)
	{
     element=driver.findElement(By.id("Email"));
     return element;
    }
		
	public static WebElement password(WebDriver driver)
	{
     element=driver.findElement(By.id("Password"));
     return element;
    }
      
	public static WebElement rememberme(WebDriver driver)
	{
     element=driver.findElement(By.id("IsRemember"));
     return element;
    }
	
	public static WebElement signin(WebDriver driver)
	{
     element=driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
     return element;
     
    }
	
	public static WebElement forgotpassword(WebDriver driver)
	{
	 element=driver.findElement(By.xpath("//a[@class='float-right']"));
	 return element;
	}
	
	public static WebElement forgotpasswordemail(WebDriver driver)
	{
		element=driver.findElement(By.id("Email"));
	     return element;
	}
	
	public static WebElement send(WebDriver driver)
	{
     element=driver.findElement(By.xpath("//input[@type='submit']"));
     return element;
     
    }

}

