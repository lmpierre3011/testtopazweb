package Asserts;


import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageError {

	private WebDriver driverChrome;
	private By badtext = By.xpath("//*[@id=\"root\"]/div/div/div/div/div/p");
		
	public pageError(WebDriver driverChrome) {
		this.driverChrome = driverChrome;
	}

	public void assertpageError() {
		String texto = driverChrome.findElement(badtext).getText();
		assertTrue(texto.contains("La clave/contraseña es incorrecta."));
	}
}