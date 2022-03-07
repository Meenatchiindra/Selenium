package org.topics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium Topics\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("indirakumar");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("meenatchi");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("no 22,gandhinagar,puducherry-10");
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("denmark@gmail.com");
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("890067546");
		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		driver.findElement(By.xpath("//input[@name='radiooptions']")).click();
		WebElement file = driver.findElement(By.xpath("//input[@id='imagesrc']"));
		file.sendKeys("C:\\Users\\HP\\Desktop\\demo.txt");
		System.out.println("file upload succesfully");
	
	
	
		
	}

}
