package test;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCore {
	
	public static WebDriver driver;
	
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void setup() {
	  
	  System.out.println("*******************");
	  System.out.println("launching chrome browser");
	  System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterClass
	public void tearDown() {
		if(driver!=null) {
			System.out.println("Closing chrome browser");
			driver.close();
			driver.quit();
		}
	}

}
