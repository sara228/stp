package ppages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageModule extends PageBaseModule{
	
	public  HomePageModule(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"header-account-menu\"]")
	WebElement Accountbtn;
	
	@FindBy(xpath="//*[@id=\"account-register\"]")
	WebElement SignUpink;
	
	@FindBy(xpath="//*[@id=\"account-signin\"]")
	WebElement LoginLink;
	
	@FindBy(id="header-account-menu-signed-in")
	WebElement userLoginbtn;


	public void OpenRegisterlink()
	{
		ClickButton(Accountbtn);
		ClickButton(SignUpink);
	}
	
	public void OpenLoginlink()
	{
		ClickButton(Accountbtn);
		ClickButton(LoginLink);
	}
	
	
}
