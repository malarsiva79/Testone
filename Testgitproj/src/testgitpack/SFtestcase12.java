package testgitpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SFtestcase12 extends Reusableclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivakumar\\eclipse-workspace1\\Drivers\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		WebElement userName=driver.findElement(By.xpath("//input[@id='username']"));
		//userName.sendKeys("Kruthiroshinie-mxpr@force.com");
		enterText(userName, "Kruthiroshinie-mxpr@force.com","Usrnamefield");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		//password.sendKeys("selenium1234");
		enterText(password,"selenium1234", "passwordfield");
		
		WebElement loginButton=driver.findElement(By.xpath("//input[@id='Login']"));
		//loginButton.click();	
		Clickmethod(loginButton, "Loginfield");
		
		Thread.sleep(3000);
		driver.findElement(By.id("lexNoThanks")).click();
		driver.findElement(By.id("tryLexDialogX")).click();
		Thread.sleep(3000);
		WebElement Accounts=driver.findElement(By.xpath("//a[contains(text(),'Accounts')]"));
		Accounts.click();
		Thread.sleep(3000);	
		WebElement ViewName=driver.findElement(By.xpath("//select[@id='fcf']"));
//		Select dropdown = new Select(ViewName);
//		dropdown.selectByVisibleText("ABC");
		dropdownmethod(ViewName, "ABC", "view name field" , "ByvisibleText");
		
		Thread.sleep(3000);
		WebElement Clickeditbutton=driver.findElement(By.xpath("//span[@class='fFooter']//a[contains(text(),'Edit')]"));
		//Clickeditbutton.click();
		Clickmethod(Clickeditbutton, "editbuttonfield");
		
		Thread.sleep(3000);	
		WebElement AccountName=driver.findElement(By.xpath("//select[@id='fcol1']"));
		//Select Accdropdown = new Select(AccountName);
		//Accdropdown.selectByVisibleText("Account Name");
		dropdownmethod(AccountName, "Account Name", "Account Name field" , "ByvisibleText");
		
		Thread.sleep(3000);	
		WebElement Clickequals=driver.findElement(By.xpath("//select[@id='fop1']"));
		//Select Eqdropdown = new Select(Clickequals);
		//Eqdropdown.selectByVisibleText("equals");
		dropdownmethod(Clickequals, "equals", "Clickequals field" , "ByvisibleText");
		
		
		WebElement Valuefield=driver.findElement(By.xpath("//input[@id='fval1']"));
		//Valuefield.sendKeys("KK");
		enterText(Valuefield, "KK", "Valuefield");
		
		Thread.sleep(3000);
		WebElement ClickLastactivity=driver.findElement(By.xpath("//select[@id='colselector_select_0']//option[contains(text(),'Last Activity')]"));
		//ClickLastactivity.click();
		Clickmethod(ClickLastactivity, "Lastactivityfield");
		
		Thread.sleep(3000);
		WebElement ClickAddbutton=driver.findElement(By.xpath("//img[@class='rightArrowIcon']"));
		//ClickAddbutton.click();
		Clickmethod(ClickAddbutton, "Addbuttonfield");
		
		Thread.sleep(3000);
		WebElement ClickSavebutton=driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[1]"));
		//ClickSavebutton.click();
		Clickmethod(ClickSavebutton, "Savebuttonfield");
		
	}

}
