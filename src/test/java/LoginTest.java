
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.openqa.selenium.WebDriver;
import Asserts.pageError;
import Asserts.pageGood;
import Ayuda.Conexion;
import Repositorio.repoSource;
import pages.pageLogin;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class LoginTest {
	private WebDriver driverChrome;
	private Conexion topazweb = new Conexion(driverChrome);

	@BeforeAll
	public void setUp() {
		driverChrome = topazweb.setUp();
	}

	/** Prueba Login */
	@ParameterizedTest
	@ArgumentsSource(repoSource.class)
	public void a_pruebaUno(String user, String pass, boolean ok) {
		pageLogin pagelogin = new pageLogin(driverChrome);
		pageError incorrecto = new pageError(driverChrome);
		pageGood correcto = new pageGood(driverChrome);
		pagelogin.login(user, pass);
		if (ok) {
			correcto.assertPageuno();
		} else {
			incorrecto.assertpageError();
		}
	}

	@AfterAll
	public void tearDown() {
		driverChrome.close();
	}
}