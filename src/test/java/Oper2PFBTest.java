
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
import Repositorio.repoOper2PFB;
import pages.pageFindOper;
import pages.pageLogin;
import pages.pageOper2PFB;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Oper2PFBTest {

	private WebDriver driverChrome;
	private Conexion topazweb = new Conexion(driverChrome);

	@BeforeAll
	public void setUp() {
		driverChrome = topazweb.setUp();
	}

	/** Prueba de la Operación 2 */
	@ParameterizedTest
	@ArgumentsSource(repoOper2PFB.class)
	public void a_pruebaUno(String usser, String pass, String oper, int val1, int val2, String paisdoc, String tipodoc,
			String numdoc, String fechaven, String ape1, String ape2, String nombre1, String nombre2, String fechanac,
			String paisnac, String sexo, String sitsent, String descrip, String otro, String paisres, String depto,
			String codpost, String call, String nropuert, String apto, String piso, String telfij, String celu,
			String codprofe, String empban, String codact, String fteing, String ingr, String estpatr, String constingr,
			String includpeps, String perftrace, String irae, String imeba, String ipeque, String monotrib,
			String servpers, String datconyu) {
		pageLogin pagelogin = new pageLogin(driverChrome);
		pageFindOper pagefindoper = new pageFindOper(driverChrome);
		pageOper2PFB oper2 = new pageOper2PFB(driverChrome);
		pagelogin.login(usser, pass);
		screenShooters.takescreenShooters("evidencia00", driverChrome);
		pagefindoper.findoper(oper);
		pagefindoper.assertOper();
		screenShooters.takescreenShooters("evidencia01", driverChrome);
		oper2.selectaccion(val1, val2);
		screenShooters.takescreenShooters("evidencia02", driverChrome);
		oper2.oper2002(paisdoc, tipodoc, numdoc, fechaven, ape1, ape2, nombre1, nombre2, fechanac, paisnac, sexo,
				sitsent, descrip, otro, paisres, depto, codpost, call, nropuert, apto, piso, telfij, celu, codprofe,
				empban, codact, fteing, ingr, estpatr, constingr, includpeps, perftrace, irae, imeba, ipeque, monotrib,
				servpers, datconyu);
		screenShooters.takescreenShooters("evidencia03", driverChrome);
		oper2.assertreport();
		driverChrome.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@AfterAll
	public void tearDown() {
		WebElement reporte = driverChrome
				.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div/div[3]/div/div[2]/div"));
		WebDriverWait wait = new WebDriverWait(driverChrome, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div/div[3]/div/div[2]/div/embed")));
		screenShooters.takescreenShooters("rep", driverChrome);
		driverChrome.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		if (reporte.isDisplayed()) {
			driverChrome.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			screenShooters.takescreenShooters("repPerFis", driverChrome);
		}
		driverChrome.close();
	}
}
