package ppages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserSignUpPageModule extends PageBaseModule {
	
	public UserSignUpPageModule(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(id="create-account-firstname")
	WebElement FirstName;
	
	@FindBy(id="create-account-lastname")
	WebElement LastName;
	
	@FindBy(id="create-account-emailId")
	WebElement Email;
	
	@FindBy(id="create-account-password")
	WebElement Password;
	
	@FindBy(id="create-account-confirm-password")
	WebElement ConfirmPAssword;
	
	@FindBy(xpath="//*[@id=\"create-account-expedia-policy\"]")
	WebElement AgreementChBox ;
	
	@FindBy(id="create-account-submit-button")
	WebElement CreateAccount ;
	
	@FindBy(xpath="//*[@id=\"userGreetingName\"]")
	public WebElement UserAccount;
	
	@FindBy(xpath="//*[@id=\"header-account-menu-signed-in\"]")
	public WebElement UserBtn;
	
	@FindBy(xpath="//*[@id=\"account-signout\"]")
	public WebElement LogoutLink;
	
	
	public void UserSignUp(String FN,String LN,String email,String Pas,String Confpas)
	{
		sentTextForElement(FirstName,FN);
		sentTextForElement(LastName,LN);
		sentTextForElement(Email,email);
		sentTextForElement(Password,Pas);
		sentTextForElement(ConfirmPAssword,Confpas);
		ClickButton(AgreementChBox);
		ClickButton(CreateAccount);
		
	}

	public void UserLogout()
	{
	
		ClickButton(UserBtn);
		ClickButton(LogoutLink);
	}
	

}
