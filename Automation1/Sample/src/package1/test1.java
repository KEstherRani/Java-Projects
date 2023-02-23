package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test1 {
	
	@BeforeMethod
	public void BFmethod()
	{
		System.out.println("Before method in test1");
	}
	
	@AfterMethod
	public void AFmethod()
	{
		System.out.println("After method in test1");
	}
	
	@Parameters({"URL", "Phone"})
	@Test(groups={"Smoke"})
	public void Demo1(String URL, String Phone){
		
	System.out.println("Hello1");	

	WebDriver driver1=new ChromeDriver();
	driver1.get(URL);
	System.out.println(Phone);	

	System.out.println("Opened browser");
	driver1.close();
	}
	
	@Test
	public void demo2(){
		
		System.out.println("Hello2");
	}

	@BeforeTest
	public void demo5()
	{
		System.out.println("test1->Before test  Demo5");
	}
	@BeforeSuite
	public void demo7()
	{
		System.out.println("Before Suite in test1");
	}
	@AfterSuite
	public void demo8()
	{
		System.out.println("After Suite in test1");
	}
}
