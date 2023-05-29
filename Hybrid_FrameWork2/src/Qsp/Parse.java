package Qsp;

import org.testng.annotations.Test;

public class Parse {
	@Test
	public void test1()
	{
		String a = "10";
		int b = Integer.parseInt(a);	
		System.out.println(b);
	}
	
	@Test
	public void test2()
	{
		String a = "10";
	   double c = Double.parseDouble(a);
	   System.out.println(c);
				
	}

}
