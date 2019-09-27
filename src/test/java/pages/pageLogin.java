package pages;

import java.util.concurrent.TimeUnit;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class pageLogin {

	private WebDriver driverChrome;
	
	@FindBy(name = "username")
	private WebElement userFieldElement;
	@FindBy(how = How.TAG_NAME, using = "input")
	private List<WebElement> contelement;
	private By passwordField = By.name("password");
	private By loginButton = By.xpath("//*[@id=\"root\"]/div/div/div/div/form/div[3]/button");

	public pageLogin(WebDriver driverChrome) {
		this.driverChrome = driverChrome;
		PageFactory.initElements(driverChrome, this);
	}

	public void login(String usser, String pass) {
		userFieldElement.clear();
		userFieldElement.sendKeys(usser);
		driverChrome.findElement(passwordField).clear();
		driverChrome.findElement(passwordField).sendKeys(pass);
		driverChrome.findElement(loginButton).click();
		driverChrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
