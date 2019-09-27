import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Testgoogle {
	private ChromeDriver driverChrome;
	


		@BeforeAll
		public void setup() {
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			driverChrome = new ChromeDriver(options);
			driverChrome.manage().window().maximize();
			driverChrome.navigate().to("https://google.com");
		}
		@Test
		public void login() {
			System.out.println(driverChrome.getTitle());
			assertTrue(driverChrome.getTitle().equals("Google"));
			driverChrome.getTitle();
		}
		
		@AfterAll
		public void cerrarAPP() {
			driverChrome.quit();
			
		}
	}

