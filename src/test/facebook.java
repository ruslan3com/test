package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asenn\\test\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
				
	driver.get("http://facebook.com");
	driver.findElement(By.id("email")).sendKeys("this is my firt code");
	driver.findElement(By.name("pass")).sendKeys("123456");
	driver.findElement(By.id("u_0_6"));
	
	
	}

}
