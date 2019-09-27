package Asserts;



import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageGood {

	private WebDriver driverChrome;
	private By fineText = By.xpath(
			"/html/body/div/div/div/div[2]/div[2]/div/div[3]/div/div[2]/div/section[2]/div/div[1]/span[1]/span");;

	public pageGood(WebDriver driverChrome) {
		this.driverChrome = driverChrome;
	}

	public void assertPageuno() {
		String texto = driverChrome.findElement(fineText).getText();
		assertTrue(texto.contains("Categorías"));
	}	
}