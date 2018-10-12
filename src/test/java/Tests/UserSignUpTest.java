package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import ppages.HomePageModule;
import ppages.LoginPage;
import ppages.UserSignUpPageModule;

public class UserSignUpTest extends TestBase {
	
	HomePageModule HomepageObject;
	UserSignUpPageModule UserSignUpObject;
	LoginPage loginObject;
	
	@Test
	public void UserSignUpTestSuccedded()
	{
		 HomepageObject = new HomePageModule(driver);
		 
		 HomepageObject.OpenRegisterlink();
		 
		 UserSignUpObject = new UserSignUpPageModule(driver);
		 
		 UserSignUpObject.UserSignUp("amany","manh","amany@gmail.com","P@ssw067ty","P@ssw067ty");
	
		 Assert.assertTrue(UserSignUpObject.UserAccount.getText().contains("amany"));
		 
	}

	@Test
	public void RegisterUserCanLogOut()
	{
		
	 UserSignUpObject.UserLogout();
	 
	}
	
	@Test
	public void UserCanLogIn()
	{
		HomepageObject.OpenLoginlink();
		loginObject = new LoginPage(driver);
		loginObject.SignIn("aya@gmail.com", "0111@@35839");
	}
	
	
}
