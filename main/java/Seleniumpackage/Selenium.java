package Seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");
		driver.manage().window().maximize();
	    WebElement s1=driver.findElement(By.xpath("//input[@id='user-message']"));
	    s1.sendKeys("veeraraju");
	    WebElement s3=driver.findElement(By.xpath("(//button[@class='btn btn-default'])[1]"));
	    s3.click();
	    WebElement s4=driver.findElement(By.xpath("(//button[@class='btn btn-default'])[2]"));
	    s4.click();
	    Thread.sleep(10);
	    driver.close();
	    
	}

}
