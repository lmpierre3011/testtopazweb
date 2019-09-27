package Ayuda;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Ayuda {
	private WebDriver driverChrome;

	public Ayuda(WebDriver driverChrome) {
		super();
		this.driverChrome = driverChrome;
	}

	public void seleccionarListbox(WebElement elemento, String Opcion) {
		Select opcioningresodoc = new Select(elemento);
		List<WebElement> listaelementos = opcioningresodoc.getOptions();
		for (int i = 0; i < listaelementos.size(); i++) {
			if (listaelementos.get(i).getText().equals(Opcion)) {
				listaelementos.get(i).click();
				break;
			}
		}
	}

	public void assertTexto(WebElement elemento, String text) {
		Assert.assertTrue(elemento.getText().equals(text));
	}

	public void assertContainsTexto(WebElement elemento, String text) {
		Assert.assertTrue(elemento.getText().contains(text));
	}
	
	public void clickDerecho(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.contextClick(element).build().perform();
	}
}