package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestDemo extends TestCore {
	
	@Test
	public void testFunction() throws Exception {
		System.out.println("Hello");
		driver.navigate().to("http://www.google.com");
		//String strPageTitle = driver.getTitle();
		//Assert.assertTrue(strPageTitle.equalsIgnoreCase("Google"), "Page title doesn't match");
		
		driver.get("https://www.myvideo.net.tw");
		
		WebElement loginButton = null;
		
		try
		{
			loginButton = driver.findElement(By.id("btn_search"));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		if (loginButton == null)
		{
		throw new Exception("找不到登入按鈕");
		}
		else
		{
			System.out.println("有登入按鈕");
			loginButton.click();
		}
		
	}

	
}
