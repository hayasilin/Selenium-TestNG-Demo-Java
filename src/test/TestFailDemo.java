package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestFailDemo extends TestCore {

	@Test
	public void testFunction() throws Exception {
		System.out.println("Test failed demo");
		driver.navigate().to("http://www.google.com");
		//String strPageTitle = driver.getTitle();
		//Assert.assertTrue(strPageTitle.equalsIgnoreCase("Google"), "Page title doesn't match");
		
		driver.get("https://www.myvideo.net.tw");
		
//		WebElement haha = null;
//		
//		haha = driver.findElement(By.className("fiqf"));
//		
//		if (haha == null)
//		{
//			throw new Exception("Failed demo");
//		}
	}
}
