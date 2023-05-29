package Generic_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Framework_const {
	
	public WebDriver driver;
	@BeforeMethod
	public void open()
	{
		System.setProperty(chrome_key, chrome_value);
		driver = new ChromeDriver();
		driver.get(baseURL);
		
		
	}

}
