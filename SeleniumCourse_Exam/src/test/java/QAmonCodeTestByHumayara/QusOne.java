package QAmonCodeTestByHumayara;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class QusOne {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		
		/*//URL visit
		driver.get("https://demoblaze.com/index.html");
		
		//Page title capture
		System.out.println("Title of the page:  "+driver.getTitle());
			
		//current URL capture
		System.out.println("Current url of the page: "+driver.getCurrentUrl());*/ 
		
		//Navigate
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
        Thread.sleep(5000);
		
		//Page Refresh
		driver.navigate().refresh();
		
		//new tab open
		driver.switchTo().newWindow(WindowType.TAB);
		//open URL one
		driver.navigate().to("https://www.aftercareexplained.com/");
		
		//open URL two
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.chhoto.link/");
		
		//Close the existing window
		driver.close();
		
		//Close all the window tab
		//driver.quit();
		
		
	}

}
