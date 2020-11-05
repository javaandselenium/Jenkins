package demo;

import org.testng.annotations.Test;

public class Sample2 {
	@Test
	public void demo()
	{
		System.out.println("Hello");
		test();
	}
	
	public void test()
	{
		System.out.println("Bye");
	}

}
