package com.simplilearn;

import java.io.File;
import java.io.IOException;
import java.util.Iterator; 
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path= "D:\\Phase-5\\chromedriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        
        ///initiate the driver
        WebDriver driver= new ChromeDriver();
        ///step:2 base url
        String base_url= "https://www.swiggy.com/";
        ///step:3 launching shine.com
        driver.get(base_url);
        
        WebElement signup= driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div[1]/div/div[1]/div/a[2]"));
        signup.click();
        
        WebElement mobile= driver.findElement(By.id("mobile"));
        mobile.sendKeys("8904588312");
        
        WebElement name= driver.findElement(By.id("name"));
        name.sendKeys("Esther Rani");
        
        WebElement email= driver.findElement(By.id("email"));
        email.sendKeys("r7a1n2i3@gmail.com");
        
        WebElement pass= driver.findElement(By.id("password"));
        pass.sendKeys("Rani@1234");
        

		TakesScreenshot screenshot=(TakesScreenshot)driver;
		
		File src=screenshot.getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src, new File("D://Screenshot//register.png"));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		driver.close();
        
        WebElement button= driver.findElement(By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div/div[2]/form/div[2]/a"));
        button.click();
        
	}

}
