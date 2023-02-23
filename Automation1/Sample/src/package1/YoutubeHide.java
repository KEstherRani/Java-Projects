package package1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YoutubeHide {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver1=new ChromeDriver();
		
		driver1.get("https://accounts.google.com/");

		driver1.findElement(By.cssSelector("[aria-label='Email or phone']")).sendKeys("ksonyteressa@gmail.com");
		
		driver1.findElement(By.className("VfPpkd-vQzf8d")).click();
		
		
		
		
		
		
		
		
		//Thread.sleep(4000);
//		WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(driver1.findElement(By.className("yt-spec-touch-feedback-shape__fill"))));
		//driver1.findElement(By.className("yt-spec-touch-feedback-shape__fill")).click();
		
		
		
	}

}
