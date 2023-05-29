package Test_Script;

import org.testng.annotations.Test;

import Generic_Script.Base_Test;
import Pom.Pom1;

public class Runner extends Base_Test
{  
	@Test(dataProvider = "testdata")
	public void validLogin(String d1,String d2) throws InterruptedException
	{
		Pom1 p=new Pom1(driver);
		p.unData(d1);
		p.pwdData();
		Thread.sleep(2000);
		p.clickLogin();
	 
	}
	
}
