package Utility;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tempt {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Support\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.primusbank.qedgetch.com/");
		
		
		
		driver.close();

	}

}
