package practice_demo;

import org.testng.annotations.Test;

public class TestScript1_Test 
{
	@Test(groups = "Smoke")
	public void test1()
	{
		System.out.println("Smoke-1");
	}
	
	@Test(groups = "regression")
	public void test2()
	{
		System.out.println("regression-1");
	}

}
