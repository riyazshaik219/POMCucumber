package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import Utils.TestBase;

public class HomePage extends  TestBase {

	@FindBy(xpath="//span[@class='user-display']")
	WebElement userlabel;
	@FindBy(css="#main-nav>a:nth-child(3)")
	WebElement contactslink;
	@FindBy(xpath="//button[contains(text(),'New')]")
	WebElement NewContactLink;
	
public HomePage() {
	PageFactory.initElements(driver, this);
}
public String  verifyHomePageTitle() {
	return driver.getTitle();
}
public boolean verifyuserlabel() {
	return userlabel.isDisplayed();
}
public ContactsPage clickOnContactslink() {
	contactslink.click();
	return new ContactsPage();
}

public void clickOnNewContactsLink() {
	contactslink.click();
	NewContactLink.click();
}

}
