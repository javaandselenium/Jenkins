package demo;

import org.testng.annotations.Test;

public class Sample {
	@Test
	public void demo()
	{
		System.out.println("Hello");
		String browser =System.getProperty("Browser");
		System.out.println(browser);
		
	}
}
