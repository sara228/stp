package ppages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBaseModule{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="signin-loginid")
	WebElement userEmail;
	
	@FindBy(id="signin-password")
	WebElement userPassword;
	
	@FindBy(id="submitButton")
	WebElement SigninBtn;
	
	public void SignIn(String email,String pas)
	{
		sentTextForElement(userEmail, email);
		sentTextForElement(userPassword, pas);
		ClickButton(SigninBtn);
	}
}
