package Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ExcelReader;
import ppages.HomePageModule;
import ppages.LoginPage;
import ppages.UserSignUpPageModule;

public class UserSignUpTestWithDDTAndExcelFile extends TestBase {
	
	HomePageModule HomepageObject;
	UserSignUpPageModule UserSignUpObject;
	LoginPage loginObject;
	
	@DataProvider(name="ExcelData")
	public Object[][] userRegisterData() throws IOException
	{
		// get data from Excel Reader class 
		ExcelReader ER = new ExcelReader();
		return ER.getExcelData();
	}
		
	@Test(priority=1,alwaysRun=true,dataProvider="ExcelData")
	public void UserSignUpTestSuccedded(String FN,String LN,String email,String password,String Confirmpassword) throws InterruptedException
	{
		 HomepageObject = new HomePageModule(driver);
		 
		 HomepageObject.OpenRegisterlink();
		 
		 UserSignUpObject = new UserSignUpPageModule(driver);
		 
		 UserSignUpObject.UserSignUp(FN,LN,email,password,Confirmpassword);
	
	
		
		 Assert.assertTrue(UserSignUpObject.UserAccount.getText().contains(FN));
		
		 UserSignUpObject.UserLogout();
		 
	     HomepageObject.OpenLoginlink();
		
		 loginObject = new LoginPage(driver);
		
	     loginObject.SignIn(email, password);
		
	}

	
	
}
