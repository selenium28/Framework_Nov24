package util;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.StepBaseClass;

public class UtilityClass extends StepBaseClass{

	public void clickOnWebElement (WebElement element, long waitTimeInSeconds) {
		WebDriverWait webwait = new WebDriverWait(driver, Duration.ofSeconds(waitTimeInSeconds));
		WebElement elements = null;
		elements = webwait.until(ExpectedConditions.elementToBeClickable(element));
		elements.click();
	}
	
	public void sendKeysTextField(WebElement element, String text) {
		clickOnWebElement(element, 5);
		element.clear();
		element.sendKeys(text);
	}
	
}
