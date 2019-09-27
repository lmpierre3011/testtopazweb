package pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Ayuda.Ayuda;
import Ayuda.screenShooters;;

public class pageOper7ApClBas {
	private WebDriver driver;
	@FindBy(xpath = "//*[@id=\"T1L6\"]") 
	private WebElement radio_persona_basica; 
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div[3]/button[1]")
	private WebElement boton_aceptar;
	@FindBy(id = "T1L5")
	private WebElement cliente;
	@FindBy(id = "T1L10")
	private WebElement opciones_tipocliente; 
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div[1]")
	private WebElement titulo_interfaz;
	@FindBy(id = "T1L18")
	private WebElement tipo_documento;
	@FindBy(id = "T1L20")
	private WebElement numero_docuemnto;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div/div/div/div/div[2]/div[3]/button[1]")
	private WebElement boton_aceptar1;
	@FindBy(id = "T8L6")
	private WebElement nombre_cliente;
	@FindBy(id = "T8L28")
	private WebElement campo_residencia;
	@FindBy(id = "T8L35")
	private WebElement institucion_financiera;
	@FindBy(id = "T8L43")
	private WebElement Ejecutivo_CLiente;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div[3]/button[1]")
	private WebElement boton_aceptar2;
	@FindBy(id = "T8L109")
	private WebElement asume_dirección_titular;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div/div[3]/div/div/div[2]/div[3]/button[1]")
	private WebElement boton_aceptar3;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div/div[4]/div/div/div[2]/div[3]/button[1]")
	private WebElement boton_aceptar4;
	@FindBy(id = "T17L4")
	private WebElement continua_rela_persona;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div/div[5]/div/div/div[2]/div[3]/button[1]")
	private WebElement boton_aceptar5;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div/div/div/div/div[2]/div[2]/div[3]/div[1]/div/button")
	private WebElement boton_finalizar_operacion;

	public WebElement getTitulo_interfaz() {
		return titulo_interfaz;
	}

	public pageOper7ApClBas(WebDriver chromedriver) {
		this.driver = chromedriver;
		PageFactory.initElements(driver, this);
	}

	// Metodo apartura de cliente basico para persona persona fisica
	public void Metodo_Aper_Cli_Bas_PF(String tipo_cliente, String tipo_doc, String num_doc, String residencia,
			String intitucion_finan, String ejecu_cliente, String Asume_direccion_titular, String continua_rela_pers) {
		Ayuda clase_ayuda = new Ayuda(driver);
		clase_ayuda.seleccionarListbox(opciones_tipocliente, tipo_cliente);
		tipo_documento.clear();
		tipo_documento.sendKeys(tipo_doc);
		tipo_documento.sendKeys(Keys.ENTER);
		numero_docuemnto.clear();
		numero_docuemnto.sendKeys(num_doc);
		numero_docuemnto.sendKeys(Keys.ENTER);
		boton_aceptar1.click();
		nombre_cliente.sendKeys(Keys.ENTER);
		clase_ayuda.seleccionarListbox(campo_residencia, residencia);
		campo_residencia.sendKeys(Keys.ENTER);
		institucion_financiera.sendKeys(intitucion_finan);
		institucion_financiera.sendKeys(Keys.ENTER);
		Ejecutivo_CLiente.sendKeys(ejecu_cliente);
		Ejecutivo_CLiente.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		boton_aceptar2.click();
		clase_ayuda.seleccionarListbox(asume_dirección_titular, Asume_direccion_titular);
		asume_dirección_titular.sendKeys(Keys.ENTER);
		boton_aceptar3.click();
		boton_aceptar4.click();
		clase_ayuda.seleccionarListbox(continua_rela_persona, continua_rela_pers);
		continua_rela_persona.sendKeys(Keys.ENTER);
		boton_aceptar5.click();
		boton_finalizar_operacion.click();
	}

	// Metodo apartura de cliente basico para persona EMPLEADO BANCO
	public void Metodo_Aper_Cli_Bas_EB(String tipo_cliente, String tipo_doc, String num_doc, String residencia,
			String intitucion_finan, String ejecu_cliente, String Asume_direccion_titular, String continua_rela_pers) {
		Ayuda clase_ayuda = new Ayuda(driver);
		radio_persona_basica.click();
		screenShooters.takescreenShooters("Selecciona Tipo de Cliente", driver);
		boton_aceptar.click();
		clase_ayuda.seleccionarListbox(opciones_tipocliente, tipo_cliente);
		tipo_documento.clear();
		tipo_documento.sendKeys(tipo_doc);
		tipo_documento.sendKeys(Keys.ENTER);
		numero_docuemnto.clear();
		numero_docuemnto.sendKeys(num_doc);
		numero_docuemnto.sendKeys(Keys.ENTER);
		screenShooters.takescreenShooters("Apertura de Cliente", driver);
		boton_aceptar1.click();
		nombre_cliente.sendKeys(Keys.ENTER);
		clase_ayuda.seleccionarListbox(campo_residencia, residencia);
		campo_residencia.sendKeys(Keys.ENTER);
		institucion_financiera.sendKeys(intitucion_finan);
		institucion_financiera.sendKeys(Keys.ENTER);
		Ejecutivo_CLiente.sendKeys(ejecu_cliente);
		Ejecutivo_CLiente.sendKeys(Keys.ENTER);
		screenShooters.takescreenShooters("Apertura Cliente n°", driver);
		boton_aceptar2.click();
		clase_ayuda.seleccionarListbox(asume_dirección_titular, Asume_direccion_titular);
		asume_dirección_titular.sendKeys(Keys.ENTER);
		screenShooters.takescreenShooters("Consulta_Dirección°", driver);
		boton_aceptar3.click();
		screenShooters.takescreenShooters("Direcciones°", driver);
		boton_aceptar4.click();
		clase_ayuda.seleccionarListbox(continua_rela_persona, continua_rela_pers);
		continua_rela_persona.sendKeys(Keys.ENTER);
		screenShooters.takescreenShooters("Consulta_Relacionar_Personas°", driver);
		boton_aceptar5.click();
		screenShooters.takescreenShooters("Finalizar Operación", driver);
		boton_finalizar_operacion.click();
	}

	public void Metodo_Aper_Cli_Bas_SG(String tipo_cliente, String num_doc) {
		Ayuda clase_ayuda = new Ayuda(driver);
		radio_persona_basica.click();
		boton_aceptar.click();
		clase_ayuda.seleccionarListbox(opciones_tipocliente, tipo_cliente);
		numero_docuemnto.clear();
		numero_docuemnto.sendKeys(num_doc);
		numero_docuemnto.sendKeys(Keys.ENTER);
	}

	public void Metodo_Aper_Cli_Bas_IF(String tipo_cliente, String tipo_dcoumento, String num_doc) {
		Ayuda clase_ayuda = new Ayuda(driver);
		radio_persona_basica.click();
		boton_aceptar.click();
		clase_ayuda.seleccionarListbox(opciones_tipocliente, tipo_cliente);
		tipo_documento.clear();
		tipo_documento.sendKeys(tipo_dcoumento);
		tipo_documento.sendKeys(Keys.ENTER);
		numero_docuemnto.clear();
		numero_docuemnto.sendKeys(num_doc);
		numero_docuemnto.sendKeys(Keys.ENTER);
	}
}
