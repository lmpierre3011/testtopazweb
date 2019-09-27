package pages;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class pageFindOper {

	private WebDriver driverChrome;
	private By findOper = By.xpath("//*[@id=\"autosuggestContainer\"]/div[1]/div/input");
	private By resultOper = By
			.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[1]/span[1]");

	public pageFindOper(WebDriver driverChrome) {
		this.driverChrome = driverChrome;
	}

	public void findoper(String oper) {
		driverChrome.findElement(findOper).sendKeys(oper);
		driverChrome.findElement(findOper).sendKeys(Keys.ENTER);
		driverChrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void assertOper() {
		String texto = driverChrome.findElement(resultOper).getText();
		assertTrue(texto.contains("APERTURA DE PERSONA"));;
	}
}
