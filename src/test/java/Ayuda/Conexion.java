package Ayuda;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Conexion {

	private WebDriver driverChrome;

	public Conexion(WebDriver driverChrome) {
		this.driverChrome = driverChrome;
	}

	public WebDriver setUp() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		driverChrome = new ChromeDriver(options);
		driverChrome.manage().window().maximize();
		driverChrome.navigate().to("http://192.168.100.67:8280");
		return driverChrome;
	}
}