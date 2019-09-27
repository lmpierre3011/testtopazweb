
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import Asserts.pageFindOper;
import Repositorio.repoOper7_CB_PF;
import Repositorio.repoOper7_CB_SG;
import Repositorio.repoOper7_CB_EB;
import Repositorio.repoOper7_CB_IF;
import pages.pageOper7ApClBas;
import pages.pageLogin;
import Ayuda.Ayuda;
import Ayuda.Conexion;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Oper7Test {

	private WebDriver driverChrome;
	private Conexion topazweb = new Conexion(driverChrome);

	@BeforeAll
	public void setUp() {
		driverChrome = topazweb.setUp();
	}

	@ParameterizedTest
	@ArgumentsSource(repoOper7_CB_PF.class)
	public void CB_PF(String usser, String pass, String oper, String tipo_cliente, String tipo_documento,
			String numero_documento, String residencia, String intitucion_financiera, String Ejecutivo_Cliente,
			String Asume_direccion_titular, String continua_rela_persona) {
		pageLogin pagelogin = new pageLogin(driverChrome);
		pageFindOper pagefindoper = new pageFindOper(driverChrome);
		pageOper7ApClBas cliente_basico = new pageOper7ApClBas(driverChrome);
		pagelogin.login(usser, pass);
		pagefindoper.findoper(oper);
		Ayuda uno = new Ayuda(driverChrome);
		System.out.print(cliente_basico.getTitulo_interfaz().getText());
		uno.assertTexto(cliente_basico.getTitulo_interfaz(), "Selecciona Tipo de Cliente");
		cliente_basico.Metodo_Aper_Cli_Bas_PF(tipo_cliente, tipo_documento, numero_documento, residencia,
				intitucion_financiera, Ejecutivo_Cliente, Asume_direccion_titular, continua_rela_persona);
	}

	@ParameterizedTest
	@ArgumentsSource(repoOper7_CB_EB.class)
	public void CB_EB(String usser, String pass, String oper, String tipo_cliente, String tipo_documento,
			String Numero_documento, String residencia, String intitucion_financiera, String Ejecutivo_Cliente,
			String Asume_direccion_titular, String continua_rela_persona) {
		pageLogin pagelogin = new pageLogin(driverChrome);
		pageFindOper pagefindoper = new pageFindOper(driverChrome);
		pageOper7ApClBas cliente_basico = new pageOper7ApClBas(driverChrome);
		pagelogin.login(usser, pass);
		pagefindoper.findoper(oper);
		cliente_basico.Metodo_Aper_Cli_Bas_EB(tipo_cliente, tipo_documento, Numero_documento, residencia,
				intitucion_financiera, Ejecutivo_Cliente, Asume_direccion_titular, continua_rela_persona);
	}

	// queda pendiente por falta de campo en la interfaz visual
	@ParameterizedTest
	@ArgumentsSource(repoOper7_CB_SG.class)
	public void CB_SG(String user, String pass, String ope, String tipo_cliente, String Numero_documento) {
		pageLogin pagelogin = new pageLogin(driverChrome);
		pageFindOper pagefindoper = new pageFindOper(driverChrome);
		pageOper7ApClBas cliente_basico = new pageOper7ApClBas(driverChrome);
		pagelogin.login(user, pass);
		pagefindoper.findoper(ope);
		cliente_basico.Metodo_Aper_Cli_Bas_SG(tipo_cliente, Numero_documento);
	}

	@ParameterizedTest
	@ArgumentsSource(repoOper7_CB_IF.class)
	public void CB_IF(String user, String pass, String ope, String tipo_cliente, String tipo_documento,
			String numero_documento) {
		pageLogin pagelogin = new pageLogin(driverChrome);
		pageFindOper pagefindoper = new pageFindOper(driverChrome);
		pageOper7ApClBas cliente_basico = new pageOper7ApClBas(driverChrome);
		pagelogin.login(user, pass);
		pagefindoper.findoper(ope);
		cliente_basico.Metodo_Aper_Cli_Bas_IF(tipo_cliente, tipo_documento, numero_documento);
	}

	@AfterAll
	public void tearDown() {
		driverChrome.close();
	}
}
