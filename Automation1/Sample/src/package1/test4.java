package package1;

import org.testng.annotations.Test;

public class test4 {

	
	@Test
	public void script1()
	{
		System.out.println("script1");
	}
	
	@Test
	public void script2()
	{
		System.out.println("script2");
	}
	
	
	@Test(groups={"Smoke"})
	public void script3()
	{
		System.out.println("script3");
	}
	
	@Test
	public void Demo5()
	{
		System.out.println("script4");
	}
	
}
