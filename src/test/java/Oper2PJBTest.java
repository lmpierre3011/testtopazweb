
import java.util.concurrent.TimeUnit;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Ayuda.Conexion;
import Ayuda.screenShooters;
import Repositorio.repoOper2PJB;
import pages.pageFindOper;
import pages.pageLogin;
import pages.pageOper2PJB;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Oper2PJBTest {

	private WebDriver driverChrome;
	private Conexion topazweb = new Conexion(driverChrome);

	@BeforeAll
	public void setUp() {
		driverChrome = topazweb.setUp();
	}

	/** Prueba de la Operación 2 Persona Jurídica */
	@ParameterizedTest
	@ArgumentsSource(repoOper2PJB.class)
	public void a_pruebaUno(String usser, String pass, String oper, int val1, int val2, String paisdo, String tipodoc,
			String numdo, String fechap, String otrodo, String razsoci, String fechanc, String tippe, String fant,
			String contact, String carg, String paisres, String depto, String codpost, String call, String nropuert,
			String apt, String pis, String telfij, String celu, String codigocu, String iniciac, String venta,
			String ultins, String dgi, String presenta, String formaban, String peps, String trace, String irae,
			String imeba, String ipeque, String monotrib, String codimpu, String levsecban, String datosint) {
		pageLogin pagelogin = new pageLogin(driverChrome);
		pageFindOper pagefindoper = new pageFindOper(driverChrome);
		pageOper2PJB oper2 = new pageOper2PJB(driverChrome);
		pagelogin.login(usser, pass);
		screenShooters.takescreenShooters("evidencia00", driverChrome);
		pagefindoper.findoper(oper);
		pagefindoper.assertOper();
		oper2.selectaccion(val1, val2);
		driverChrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		screenShooters.takescreenShooters("evidencia001", driverChrome);
		oper2.oper2002(paisdo, tipodoc, numdo, fechap, otrodo, razsoci, fechanc, tippe, fant, contact, carg, paisres,
				depto, codpost, call, nropuert, apt, pis, telfij, celu, codigocu, iniciac, venta, ultins, dgi, presenta,
				formaban, peps, trace, irae, imeba, ipeque, monotrib, codimpu, levsecban, datosint);
		screenShooters.takescreenShooters("evidencia13", driverChrome);
		oper2.assertreport();
	}

	@AfterAll
	public void tearDown() {
		WebElement reporte = driverChrome
				.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div/div[3]/div/div[2]/div"));
		WebDriverWait wait = new WebDriverWait(driverChrome, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div/div[3]/div/div[2]/div/embed")));
		screenShooters.takescreenShooters("res", driverChrome);
		driverChrome.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		if (reporte.isDisplayed()) {
			driverChrome.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			screenShooters.takescreenShooters("req2", driverChrome);
		}
		driverChrome.close();
	}
}
