package demo;

import org.testng.annotations.Test;

public class Sample2 {
	@Test
	public void demo()
	{
		System.out.println("Hello");
		String browser =System.getProperty("Browser");
		System.out.println(browser);
		test();
	}
	
	public void test()
	{
		System.out.println("Bye");
	}

}
