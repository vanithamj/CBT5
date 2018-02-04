package qsp;

import java.net.MalformedURLException;
//import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DemoA {
  @Test
  public void testA() throws MalformedURLException 
  {
	/*  URL r = new URL("http://localhost:4444/wd/hub");
	  DesiredCapabilities d = new DesiredCapabilities();
	  d.setBrowserName("chrome");
	  WebDriver driver = new RemoteWebDriver(r, d);
	  driver.quit(); */
	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.Google.co.in");
	  WebElement e = driver.findElement(By.name("q"));
	  e.sendKeys("Jaigurudev");
	  e.submit();
	  
	  
	  
	  
  }
}
