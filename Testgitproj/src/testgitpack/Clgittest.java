package testgitpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clgittest extends Reusableclass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("selenium training");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivakumar\\eclipse-workspace1\\Drivers\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		WebElement variablename=driver.findElement(By.xpath("//input[@id='username']"));
//		userName.sendKeys("Kruthiroshinie-mxpr@force.com");
		
		enterText(variablename, "Kruthiroshinie-mxpr@force.com", "field User Name" ); 
		
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
//		if(password.isEnabled()) {
//			password.sendKeys("selenium123 ");
//			System.out.println("pass:"+"selenium123 is entered in"+"Password");
//			}
//		else {
//			System.out.println("Fail:" + "Password" + "field is not enabled");
//		}
		
		enterText(password, "selenium1234","field Password" );
		
		//password.sendKeys("selenium123 ");
		
		WebElement checkrememberme=driver.findElement(By.id("rememberUn"));
		//checkrememberme.click();
		Clickmethod(checkrememberme, "Rememberme");
		
		WebElement loginButton=driver.findElement(By.xpath("//input[@id='Login']"));
		//loginButton.click();	
		Clickmethod(loginButton, "Login");
		
		Thread.sleep(3000);
		driver.findElement(By.id("lexNoThanks")).click();
		driver.findElement(By.id("tryLexDialogX")).click();	
		
		WebElement Usermenu=driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		//Usermenu.click();
		Clickmethod(Usermenu,"Usermenu");
		
		WebElement LogoutButton=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		//LogoutButton.click();
		Clickmethod(LogoutButton, "Logout");
		
	}
	

}
