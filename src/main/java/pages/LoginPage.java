package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.StepBaseClass;
import util.UtilityClass;

public class LoginPage extends StepBaseClass{
	
	UtilityClass objUtilityClass = new UtilityClass();
	
	@FindBy(xpath = "//*[@name='username']")
	WebElement userName_TextBox;
	
	@FindBy(xpath = "//*[@name='password']")
	WebElement password_TextBox;
	
	@FindBy(xpath = "//*[@id='submit']")
	WebElement submit_Button;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
//	public void enterUsername(String user) {
////		userName_TextBox.sendKeys(user);
//		objUtilityClass.sendKeysTextField(userName_TextBox, user);
//	}
//	
//	public void enterPassword(String pass) {
//		password_TextBox.sendKeys(pass);
//	}
//	
//	public void clickSubmitButton() {
//		submit_Button.click();
//	}
	
	public void loginMethod(String user, String pass) {
		objUtilityClass.sendKeysTextField(userName_TextBox, user);
		objUtilityClass.sendKeysTextField(password_TextBox, pass);
		objUtilityClass.clickOnWebElement(submit_Button, 5);
	}

}
