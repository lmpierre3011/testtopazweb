
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Ayuda.Conexion;
import Ayuda.screenShooters;
import Repositorio.repoOper3PF;
import pages.pageFindOper;
import pages.pageLogin;
import pages.pageOper3PF;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Oper3PFTest {

	private WebDriver driverChrome;
	private Conexion driver;

	@BeforeAll
	public void setUp() {
		driver = new Conexion(driverChrome);
		driverChrome = driver.setUp();
	}

	@ParameterizedTest
	@ArgumentsSource(repoOper3PF.class)
	public void c_pruebaTres(String user, String pass, String oper, String codigopais, String nrodoc, String opc,
			String tipodoc, String apellidopadre, String apellidomadre, String name, String segundoname,
			String fnacimiento, String pnacimiento, String presidencia, String dpto, String codpostal, String ciudad,
			String calle, String nropuerta, String nroapto, String piso) {
		pageLogin pagelogin = new pageLogin(driverChrome);
		pageOper3PF aperturacl = new pageOper3PF(driverChrome);
		pageFindOper op = new pageFindOper(driverChrome);
		pagelogin.login(user, pass);
		op.findoper(oper);
		aperturacl.crearPersonaFisica(codigopais, nrodoc, opc, tipodoc, apellidopadre, apellidomadre, name, segundoname,
				fnacimiento, pnacimiento, presidencia, dpto, codpostal, ciudad, calle, nropuerta, nroapto, piso);
	}

	@AfterAll
	public void tearDown() {
		WebElement reporte = driverChrome.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div/div[3]/div/div[2]/div/embed"));
		WebDriverWait wait = new WebDriverWait(driverChrome, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div/div[3]/div/div[2]/div/embed")));
		if (reporte.isDisplayed()) {
			driverChrome.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
			screenShooters.takescreenShooters("pinturaaaa", driverChrome);
		}
		driverChrome.close();
	}
}