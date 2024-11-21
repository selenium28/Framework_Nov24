package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.StepBaseClass;

public class LogoutPage extends StepBaseClass {
	
	@FindBy(xpath = "//*[@name='username']")
	WebElement logOut;
	
	public LogoutPage(){
		PageFactory.initElements(driver, this);
	}
	
	

}
