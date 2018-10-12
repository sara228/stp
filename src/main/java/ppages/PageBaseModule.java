package ppages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;



public class PageBaseModule {
	
	protected static WebDriver driver;

public PageBaseModule(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

protected static void ClickButton(WebElement element)
{
   element.click();
}

protected static void sentTextForElement(WebElement element,String text)
{
   element.sendKeys(text);
}

}
