package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.StepBaseClass;

public class LoginPage extends StepBaseClass{
	
	@FindBy(xpath = "//*[@name='username']")
	WebElement userName_TextBox;
	
	@FindBy(xpath = "//*[@name='password']")
	WebElement password_TextBox;
	
	@FindBy(xpath = "//*[@id='submit']")
	WebElement submit_Button;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String user) {
		userName_TextBox.sendKeys(user);
	}
	
	public void enterPassword(String pass) {
		password_TextBox.sendKeys(pass);
	}
	
	public void clickSubmitButton() {
		submit_Button.click();
	}
	
	
	

}
