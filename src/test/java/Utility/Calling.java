package Utility;

public class Calling 
{

	public static void main(String[] args)throws Exception
	{
		Object input1 []=new Object[2];
		input1[0]="webdriver.chrome.driver";
		input1[1]="F:\\Automation Support\\chromedriver.exe";
		SeleniumOperations2.browserLaunch(input1);
		
		Object input2 []=new Object[1];
		input2[0]="http://www.primusbank.qedgetech.com/";
		SeleniumOperations2.openApp(input2);
		
		Object input3 []=new Object[2];
		input3[0]="//*[@id='txtuId']";
		input3[1]="Admin";
		SeleniumOperations2.sendText(input3);
		
		Object input4 []=new Object[2];
		input4[0]="//*[@name='txtPword']";
		input4[1]="Admin";
		SeleniumOperations2.sendText(input4);
		
		Object input5 []=new Object[1];
		input5[0]="//*[@id='login']";
		SeleniumOperations2.clickOnElement(input5);
			
	}

}
