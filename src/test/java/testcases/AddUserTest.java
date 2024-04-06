package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;
import utilitise.RandomNumber;
import utilitise.Readxlsdata;

public class AddUserTest extends BaseTest{
	
	@Test(dataProviderClass=Readxlsdata.class,dataProvider="bdd")
	public static void adduser(String name, String email, String phone) throws InterruptedException {
		int randomNumber = RandomNumber.generateRandomNumber(1000000000);
		
		driver.findElement(By.xpath(loc.getProperty("manageusers"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(loc.getProperty("adduserInManageUsers"))).click();
		Thread.sleep(1000);
		driver.findElement(By.id(loc.getProperty("nameid"))).sendKeys(name+randomNumber);
		Thread.sleep(1000);
		driver.findElement(By.name(loc.getProperty("emailName"))).sendKeys(email);
		Thread.sleep(1000);
		driver.findElement(By.name(loc.getProperty("phoneName"))).sendKeys(phone);
		Thread.sleep(1000);
		
	}

}
