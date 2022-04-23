package com.simplilearn;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class login {

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
		        
		        WebElement signin= driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div[1]/div/div[1]/div/a[1]"));
		        signin.click();
		        
		        WebElement mobile= driver.findElement(By.id("mobile"));
		        mobile.sendKeys("8904588312");
		        
                TakesScreenshot screenshot=(TakesScreenshot)driver;
				
				File src=screenshot.getScreenshotAs(OutputType.FILE);
				try {
					FileHandler.copy(src, new File("D://Screenshot//login1.png"));
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}

				driver.close();

	}

}
