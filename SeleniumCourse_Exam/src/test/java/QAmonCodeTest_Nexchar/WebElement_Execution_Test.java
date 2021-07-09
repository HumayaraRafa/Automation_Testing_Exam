package QAmonCodeTest_Nexchar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElement_Execution_Test {
    public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		
		//URL visit
		driver.get("https://nexchar.com/signup");
		
		//form fillUp with 	
	    driver.findElement(By.id("Name")).sendKeys("Humayara");
	    //drop down menu
	 	Select dropdownbox=new Select(driver.findElement(By.id("CategoryId")));
	 	
	 	dropdownbox.selectByValue("6");
	 	/*dropdownbox.selectByValue("2");
	 	dropdownbox.selectByValue("3");
	 	dropdownbox.selectByValue("4");
	 	dropdownbox.selectByValue("5");
	 	dropdownbox.selectByValue("6");
	 	dropdownbox.selectByValue("9");
	 	dropdownbox.selectByValue("10");
	 	dropdownbox.selectByValue("11");
	 	dropdownbox.selectByValue("50"); */
	 	
	 	//email address
	 	//driver.findElement(By.id("Email")).sendKeys("nides60350@godpeed.com");
	 	driver.findElement(By.id("Email")).sendKeys("sayak83958@godpeed.com");
	 	
	 	//password
	 	//driver.findElement(By.id("Password")).sendKeys("12345");
	 	driver.findElement(By.id("Password")).sendKeys("12345");
	 	
	 	//show password
	 	driver.findElement(By.xpath("//*[@class='icon']")).click();
	 	//tick box
	 	driver.findElement(By.id("NotReceiveNewsLetter")).click();
	 	//submit button
	 	driver.findElement(By.xpath("//button[@type='submit']")).click();
	 	
	 	Thread.sleep(2000);
	 	
	 	//Navigate
	 	driver.navigate().to("https://nexchar.com/signin");
	 	
	 	//Form fill up with verify emails & password
	 	//driver.findElement(By.id("Email")).sendKeys("nides60350@godpeed.com");
	 	driver.findElement(By.id("Email")).sendKeys("sayak83958@godpeed.com");
	 	
	 	/* //Forgot Password Button
	 	driver.findElement(By.linkText("I forgot password")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("Email")).sendKeys("humayarachy.rafa@gmail.com");
	    driver.findElement(By.xpath("//button[@class='btn btn-primary w-100']")).click();*/
	    
	 	driver.findElement(By.id("Password")).sendKeys("12345");
	 	driver.findElement(By.xpath("//*[@class='icon']")).click();
	 	driver.findElement(By.id("RememberMe")).click();
	 	driver.findElement(By.cssSelector(".btn-primary")).click();
	 	
	 	driver.close();
	 	
	 	
	 	
	 	
}

}
