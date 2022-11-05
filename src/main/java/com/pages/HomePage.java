package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	
	
	@FindBy(how=How.XPATH,using="//input[@name='em']")private WebElement emailid;
	
	@FindBy(how=How.XPATH,using="//input[@type='password']")private WebElement pass;
	@FindBy(how=How.XPATH,using="//button[@name=\"login\"]")private WebElement btnlogin;
	
	
	
	
	public WebElement getEmailid() {
		return emailid;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}

	
	
	

}
