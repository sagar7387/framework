package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Utility.BaseClass;
import com.Utility.Library;
import com.pages.HomePage;

public class Test1 extends BaseClass {
	
	
	@Test
public void loginpage() {
		
		
		
	HomePage login=PageFactory.initElements(driver, HomePage.class );
	
	System.out.println(config.getemail());
	Library.ExplicitWait(driver, login.getEmailid(), 5);
    Library.customsendkey(login.getEmailid(),config.getemail());
    Library.customsendkey(login.getPass(),config.getpass());
    Library.customclick(login.getBtnlogin());
	System.out.println(config.getpass());	
	System.out.println("hellosgar");
//	Library.custom_handleAlert(driver);
//	Library.customIframeHanadlemainpage(driver);
//	Library.DropdownHandle(login.getEmailid(), "sagar");
    
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
