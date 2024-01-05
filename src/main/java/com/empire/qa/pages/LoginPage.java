package com.empire.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.empire.qa.base.BaseTest;

public class LoginPage extends BaseTest {

	
	@FindBy(name = "emailid")
	@CacheLookup
	WebElement uname;

	@FindBy(id = "pword")
	@CacheLookup
	WebElement pwd;

	@FindBy(xpath = "//button[text()='Login']")
	@CacheLookup
	WebElement loginbtn;

	@FindBy(xpath = "//img[@src=\"/WebApp/assets/dist/img/logo.png\"]")
	@CacheLookup
	WebElement ehimg;

	public LoginPage() throws Throwable {
		
		PageFactory.initElements(driver, this);

	}

	public void setusername(String user) {
		uname.sendKeys(user);
	}

	public void setpassword(String pass) {
		pwd.sendKeys(pass);
	}

	public void clickLoginBtn() {
		loginbtn.click();
	}

	
}
