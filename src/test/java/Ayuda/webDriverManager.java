package Ayuda;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Dimension;

public class webDriverManager {

	public static void setWindowsSize(WebDriver driverChrome, String size) {
		if (size.toLowerCase() == "maximized") {
			driverChrome.manage().window().maximize();
		}
		if (size.toLowerCase() == "fullscreen") {
			driverChrome.manage().window().fullscreen();
		}
	}

	public static void setWindowsSize(WebDriver driverChrome, int x, int y) {
		driverChrome.manage().window().setSize(new Dimension(x, y));
	}
}