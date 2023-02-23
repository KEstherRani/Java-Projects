package package1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test2 {

	
	@DataProvider
	public Object[][] dataprovider1()
	{
		Object[][] data= new Object[3][2];
		// 3 data sets with --2 values in each data set
	
		//1st set
		data[0][0]="username1";
		data[0][1]="Password1";
		
		//2nd set
		data[1][0]="username2";
		data[1][1]="Password2";
		
		//3rd set
		data[2][0]="username3";
		data[2][1]="Password3";
		
		return data;
		
	}
	
	@Test(dataProvider="dataprovider1")
	public void Demo8(String usrname, String pswrd)
	{
		System.out.println("Hello3");
		System.out.println(usrname);
		System.out.println(pswrd);
	}
	
	@Test(groups={"Smoke"})
	public void Demo3()
	{
		System.out.println("Hello3");
	}
	
	@BeforeTest
	public void demo4()
	{
		System.out.println("test2->Before test Demo4");
	}
	
	@AfterTest
	public void demo6()
	{
		System.out.println("tes2->After test Demo6");
	}
	@BeforeSuite
	public void deeo7()
	{
		System.out.println("Before Suite in test2");
	}
	
}
