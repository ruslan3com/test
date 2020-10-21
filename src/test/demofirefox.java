package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demofirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//selenium code-
		
		//Create Driver object for Firefox Browser
		
		// We will strictly implement methods of webdriver
		
		/* Class name= ChrimeDriver,
		 
		   x driver=new x();*/
		//invoke .exe file first
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\asenn\\test\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
	}
		
}
