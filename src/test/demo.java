package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void  main(String[] args) {
		// TODO Auto-generated method stub
//selenium code-
		
		//Create Driver object for chrome Browser
		
		// We will strictly implement methods of webdriver
		
		/* Class name= ChrimeDriver,
		 
		   x driver=new x();*/
		//invoke .exe file first
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asenn\\test\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://google.com"); //hit url on the browser 
		System.out.println(driver.getTitle()); // validate url if your page title is correct
		System.out.println(driver.getCurrentUrl()); //validate on correct url
		
		driver.close(); // it close current browser 
		driver.quit(); //close all the browsers opened by selenium script
		
	}

}