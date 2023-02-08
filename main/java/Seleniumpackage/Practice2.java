package Seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {
public static void main(String []args)
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.stealmylogin.com/demo.html");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("TestUsername");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("TestPassword@123");
	driver.findElement(By.xpath("//input[@value='login']")).click();
	System.out.println(driver.getTitle());
	driver.close();
}
}