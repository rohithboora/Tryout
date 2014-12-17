package ham;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {

	
	WebDriver driver = null;
		WebElement element = null;
	public WebElement just()
	{
		System.out.println(element);
		return driver.findElement(By.id(""));
	}
	
	
	 public WebElement findElement(WebDriver driver) 
	 {

		 if (element == null) element = driver.findElement(By.name("")); 
		 return element; 
	} 
}