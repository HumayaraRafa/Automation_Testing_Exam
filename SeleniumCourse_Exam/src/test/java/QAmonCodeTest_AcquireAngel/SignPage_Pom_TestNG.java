package QAmonCodeTest_AcquireAngel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import QAmonCodeTest_AcquireAngel.SignInPage_Object_Locator;

public class SignPage_Pom_TestNG {
	
		private static WebDriver driver=null;
	
	@BeforeTest
		public void setUpTest()
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	
	@Test
		public void stepone() throws InterruptedException
	{
		driver.get("https://www.acquireangel.com/signin");
		
		//email
		SignInPage_Object_Locator.emailaddress(driver).sendKeys("hamidsaymon9@gmail.com");
		
		//password 
		SignInPage_Object_Locator.password(driver).sendKeys("Abc12345");
		
		//remember_me
		//SignInPage_Object_Locator.rememberme(driver).click();
		
		//submit button
		SignInPage_Object_Locator.signin(driver).click();
		
		/*//forgot password
		SignInPage_Object_Locator.forgotpassword(driver).click();
		SignInPage_Object_Locator.forgotpasswordemail(driver).sendKeys("hrafa783@gmail.com");
		SignInPage_Object_Locator.send(driver).click(); */
		
	} 

	@AfterTest
		public void tearDown()
{
		driver.close();
	
} 
	
}