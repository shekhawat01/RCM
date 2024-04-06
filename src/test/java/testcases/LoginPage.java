package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;
import utilitise.Readxlsdata;

public class LoginPage extends BaseTest{
	
	@Test(dataProviderClass=Readxlsdata.class,dataProvider="bdd")
	public static void login(String username, String password) throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.findElement(By.id(loc.getProperty("usernameid"))).sendKeys(username);
		Thread.sleep(1000);
		driver.findElement(By.name(loc.getProperty("passwordid"))).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.xpath(loc.getProperty("loginbtnxpath"))).click();
		Thread.sleep(1000);
	}

}
