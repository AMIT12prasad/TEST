package HRMTEST;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ORANGEHRM.HRMDASHBOARD;
import ORANGEHRM.Loginohrm;

public class TESTHRM {

	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		Loginohrm input=new Loginohrm(driver);
		input.loginMethod();
		
		HRMDASHBOARD hrm= new HRMDASHBOARD(driver);
		hrm.hrmboardMethod();
	}
	
}
