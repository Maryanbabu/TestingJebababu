package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepageobj extends Basepage {
	public Homepageobj() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//*[text()='Dresses'])[2]")
	private WebElement tabDresses;

	public WebElement getDresses() {
		return tabDresses;
	}

	public void clickDresses() {
		tabDresses.click();
	}

	@FindBy(id = "newsletter-input")
	private WebElement txtBoxNewsLetter;

	@FindBy(name = "submitNewsletter")
	private WebElement txtBoxSubmitButton;

	@FindBy(xpath = "//*[@class='alert alert-success']")
	private WebElement msgSuccess;

	public WebElement getNewsLetterMsgtab() {
		return msgSuccess;
	}

	public String getNewslettermsg() {
		return msgSuccess.getText();
	}

	@FindBy(xpath = "(//*[text()='Women'])[2]")
	private WebElement tabWomen;

	public WebElement getWomen() {
		return tabWomen;
	}

	public void setNewsLetter(String email) {
		setText(txtBoxNewsLetter, email);
		txtBoxSubmitButton.click();
	}


}
