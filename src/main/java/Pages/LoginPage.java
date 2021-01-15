package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import Utils.TestBase;

public class LoginPage  extends TestBase{
	//PageFactory:
			@FindBy(name="email")
			WebElement username;
			
			@FindBy(name="password")
			WebElement password;
			
			@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
			WebElement loginBtn;
			
			@FindBy(linkText="Sign Up")
			WebElement SignUpBtn;
			
			//Initializing page objects
			public  LoginPage() {
				PageFactory.initElements(driver, this);
			}
			//Actions:
			public String validateLoginPageTitle() {
				return driver.getTitle();
			}
			public HomePage login(String un,String pwd) {
				username.sendKeys(un);
				password.sendKeys(pwd);
				loginBtn.click();
				return new HomePage();
				
			}

}
