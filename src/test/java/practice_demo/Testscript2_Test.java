package practice_demo;

import org.testng.annotations.Test;

public class Testscript2_Test 
{
	@Test(groups = "Smoke")
	public void test1()
	{
		System.out.println("Smoke-2");
	}
	
	@Test(groups = "regression")
	public void test2()
	{
		System.out.println("regression-2");
	}

}
