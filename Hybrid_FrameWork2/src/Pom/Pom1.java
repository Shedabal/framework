package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Script.Base_Page;

public class Pom1  extends Base_Page{
	@FindBy(name="email")
	private WebElement unTbox;

	@FindBy(name="pass")
	private WebElement pwdTbox;

	@FindBy(name="login")
	private WebElement loginBtn;

	public Pom1(WebDriver driver)
	{
	super(driver);
	}
	public void unData(String un)
	{
		unTbox.sendKeys(un);
	}

	public void pwdData(String pwd)
	{
		pwdTbox.sendKeys(pwd);
	}
	public void clickLogin()
	{
		loginBtn.click();
	}

}
