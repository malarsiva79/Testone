package testgitpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Reusableclass {

	public static void enterText(WebElement obj,String text, String fieldname) {
		if(obj.isEnabled()) {
			obj.sendKeys(text);
			System.out.println("pass:"+text+"is entered in"+"field"+ fieldname);
		}
		else {
			System.out.println("Fail:" + fieldname + "field is not enabled");
		}

	}


	public static void Clickmethod(WebElement A, String Name) {
		if (A.isEnabled()) {
			A.click();
			System.out.println("Pass:"+ "Field" +Name);
		}
		else {
			System.out.println("Fail:"+"Field" + Name);
		}
	}

	public static void dropdownmethod(WebElement arrow, String text, String Name, String keyword) {
		Select dropdown = new Select(arrow);

		if (arrow.isEnabled()) {
			if (keyword == "ByvisibleText") {
					dropdown.selectByVisibleText(text);	 
			}
			if (keyword == "ByValue" ) {
					dropdown.selectByValue(text);
			}

			System.out.println("Pass: " + Name + "is selected");
		}
		else {
			System.out.println("Fail: " + Name + "is not selected");
		}


	}



}
