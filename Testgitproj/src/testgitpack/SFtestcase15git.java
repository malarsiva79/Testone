package testgitpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SFtestcase15git extends Reusableclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivakumar\\eclipse-workspace1\\Drivers\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		WebElement userName=driver.findElement(By.xpath("//input[@id='username']"));
		//userName.sendKeys("Kruthiroshinie-mxpr@force.com");
		enterText(userName, "Kruthiroshinie-mxpr@force.com", "userNamefield");
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		//password.sendKeys("selenium1234");
		enterText(password, "selenium1234", "passwordfield");
		WebElement loginButton=driver.findElement(By.xpath("//input[@id='Login']"));
		//loginButton.click();	
		Clickmethod(loginButton, "Loginfield");
		
		Thread.sleep(3000);
		driver.findElement(By.id("lexNoThanks")).click();
		driver.findElement(By.id("tryLexDialogX")).click();
		Thread.sleep(3000);	
		WebElement Clickopportunities=driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]"));
		//Clickopportunities.click();
		Clickmethod(Clickopportunities, "Clickopportunitiesfield");
		
		Thread.sleep(3000);
		WebElement Clickdropdown=driver.findElement(By.xpath("//select[@id='fcf']"));
		//Clickdropdown.click();
		Clickmethod(Clickdropdown, "Clickdropdownfield");
	}

}
