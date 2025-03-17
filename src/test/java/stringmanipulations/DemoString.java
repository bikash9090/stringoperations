package stringmanipulations;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoString {
	@BeforeTest
	public void beforeTest()	{
		System.out.println("Before test of Demo String.");
	}
	
	@Test
	public void demoStringTest1() {
		System.out.println("Test1 of DemoString class");
	}
	
	@Test
	public void demoStringTest2() {
		System.out.println("Test2 of DemoString class");
	}
}
