package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumOperations 
{

	public static ChromeDriver driver;
	
	public static void browserLaunch(String key, String value)
	{
		String chrome = key;
		String exe=value;
		System.setProperty(chrome, exe);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	public static void openApp(String url)
	{
		String path=url;
		driver.get(path);
	}
	
	public static void sendText(String xpath, String textOnUI)
	{
		String xPath=xpath;
		String text=textOnUI;
		//driver.findElementByXPath(xPath).sendKeys(text);
		driver.findElement(By.xpath(xPath)).sendKeys(text);
		
	}
	public static void clickOnElement(String locator)
	{
		String xpath=locator;
		driver.findElement(By.xpath(xpath)).click();
	}
	
	
	public static void main(String[] args) throws Exception
	{
		browserLaunch("webdriver.chrome.driver", "F:\\Automation Support\\chromedriver.exe");
		openApp("http://www.primusbank.qedgetech.com/");
		sendText("//*[@id='txtuId']","Admin");
		sendText("//*[@name='txtPword']","Admin");
		clickOnElement("//*[@id='login']");
			
	}
	
	

}
