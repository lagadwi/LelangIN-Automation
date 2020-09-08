package com.qa.testcases;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class LoginPageTest extends TestBase {
//	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		homePage = new HomePage();
//		loginPage = new LoginPage();

	}

	@Test(priority = 1)
	public void  loginUser(){
		homePage.clickSignInButton();
		homePage = homePage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

}
