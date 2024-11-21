package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import core.StepBaseClass;
import pages.LoginPage;

public class TestCaseExecution extends StepBaseClass{
	
	
	@Test (priority = 1)
	public void testCaseOne() {
		LoginPage objLoginPage = new LoginPage();
//		objLoginPage.enterUsername("student");
//		objLoginPage.enterPassword("Password123");
//		objLoginPage.clickSubmitButton();
		
		objLoginPage.loginMethod("student", "Password123");

	}
	
	@Test (priority = 2)
	public void testCaseTwo() {
		LoginPage objLoginPage = new LoginPage();
//		objLoginPage.enterUsername("student");
//		objLoginPage.enterPassword("Password123");
//		objLoginPage.clickSubmitButton();
		
		objLoginPage.loginMethod("student", "Password123");

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
