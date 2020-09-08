package com.qa.pages;

import com.qa.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {


	@FindBy(xpath = "//a[contains(text(),'Home')]")
    WebElement homeButton;
	
	@FindBy(xpath = "//a[contains(text(),'Sign Up')]")
    WebElement signUpButton;

	@FindBy(xpath = "(//button[@type='button'])[2]")
    WebElement signInButton;

	@FindBy(xpath = "(//input[@id='username'])")
    WebElement username;

	@FindBy(xpath = "(//input[@id='password'])")
	WebElement password;

	@FindBy(xpath = "(//button[@id='submitButton'])")
	WebElement loginButton;

	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}

	public HomePage login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		//loginBtn.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginButton);

		return new HomePage();
	}
//
//	public ContactsPage clickOnContactsLink(){
//		contactsLink.click();
//		return new ContactsPage();
//	}
//
//	public DealsPage clickOnDealsLink(){
//		dealsLink.click();
//		return new DealsPage();
//	}
//
//	public TasksPage clickOnTasksLink(){
//		tasksLink.click();
//		return new TasksPage();
//	}
//
	public void clickSignInButton(){
		Actions action = new Actions(driver);
		action.moveToElement(signInButton).build().perform();
		signInButton.click();
	}
	
	
	
	
	
	
	

}
