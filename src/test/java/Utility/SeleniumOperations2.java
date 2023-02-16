package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumOperations2 
{
	public static ChromeDriver driver;
	
	//By using Object array and Exception handling
	public static void browserLaunch(Object[] inputparameters)
	{
		try 
		{
			String chrome = (String) inputparameters[0];
			String exe=(String) inputparameters[1];;
			System.setProperty(chrome, exe);
			driver=new ChromeDriver();
			driver.manage().window().maximize();			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
	public static void openApp(Object[] inputparameters)
	{
		try
		{String path=(String) inputparameters[0];
		driver.get(path);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void sendText(Object[] inputparameters)
	{
		try
		{
		String xPath1=(String) inputparameters[0];
		String text=(String) inputparameters[1];
		//driver.findElementByXPath(xPath).sendKeys(text);
		driver.findElement(By.xpath(xPath1)).sendKeys(text);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	public static void clickOnElement(Object[] inputparameters)
	{
		try
		{
		String xpath2=(String) inputparameters[0];
		driver.findElement(By.xpath(xpath2)).click();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void validation(Object[] inputparameters)
	{
		try
		{
			String inputGiven=(String) inputparameters[0];
			String xpath=(String) inputparameters[1];
			String capturedtext=driver.findElement(By.xpath(xpath)).getText();
			if(inputGiven.equalsIgnoreCase(capturedtext))
			{
				System.out.println("Test case pass");
			}
			else
			{
				System.out.println("Test case FAIL");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
}
