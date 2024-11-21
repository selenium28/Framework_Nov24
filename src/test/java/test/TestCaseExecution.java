package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import core.StepBaseClass;
import pages.LoginPage;

public class TestCaseExecution extends StepBaseClass{
	
	
	@Test
	public void testCaseOne() {
		LoginPage objLoginPage = new LoginPage();
		objLoginPage.enterUsername("student");
		objLoginPage.enterPassword("Password123");
		objLoginPage.clickSubmitButton();

	}

	@BeforeTest
	public void start() {
		setup();
	}

	@AfterTest
	public void finish() {
		tearDown();
	}
}
