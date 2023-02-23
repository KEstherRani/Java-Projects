package package1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test3 {

	@BeforeClass
	public void bfclass()
	{
		System.out.println("Before executing any methods in class--test3");
	}
	
	@AfterClass
	public void afclass()
	{
		System.out.println("After executing all methods in class--test3");
	}
	
	@Test(groups={"Smoke"})
	public void CarWeblogin()
	{
		System.out.println("CarWeblogin");
	}
	
	@Test
	public void CarMobilelogin()
	{
		System.out.println("CarMobilelogin");
	}
	
	
	@Test
	public void CarAPIlogin()
	{
		System.out.println("CarAPIlogin");
	}
	
	
}
