package pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Ayuda.Ayuda;

public class pageOper3PF {
	private WebDriver driverChrome;
	@FindBy(id = "T1L6")
	private WebElement radioPersona;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div[3]/button[1]")
	private WebElement aceptar;
	@FindBy(id = "T2L2")
	private WebElement paisdocumento;
	@FindBy(xpath = "//*[@id=\"T2L16\"]/div[1]/div/div[1]")
	private WebElement seleccionartipodoc;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div[6]/div/div/div[3]/div/div[2]/div[2]/div[3]/div[3]/input")
	private WebElement insertartipodoc;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div[6]/div/div/div[3]/div/div[2]/div[2]/div[4]/button[1]")
	private WebElement btnaceptar;
	@FindBy(xpath = "//*[@id=\"T2L16\"]/div[2]/div")
	private WebElement celda;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div/div[3]/div/div/div[2]/div[2]/div[3]/div/div/button")
	private WebElement alerta;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div[3]/button[1]")
	private WebElement aceptar1;
	@FindBy(id = "T4L4")
	private WebElement nrodocumento;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div/div[3]/div/div/div[2]/div[3]/button[1]")
	private WebElement aceptar2;
	@FindBy(id = "T7L4")
	private WebElement ingrsootrodoc;
	@FindBy(id = "T8L3")
	private WebElement apellidopaterno;
	@FindBy(id = "T8L7")
	private WebElement apellidomaterno;
	@FindBy(id = "T8L9")
	private WebElement primernombre;
	@FindBy(id = "T8L11")
	private WebElement segundonombre;
	@FindBy(id = "T8L21")
	private WebElement fechanacimiento;
	@FindBy(id = "T8L40")
	private WebElement paisnacimiento;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div/div[6]/div/div/div[2]/div[2]/div[3]/div[1]/div/button")
	private WebElement alertatrace;
	@FindBy(id = "T8L46")
	private WebElement paisresidencia;
	@FindBy(id = "T8L56")
	private WebElement departamento;
	@FindBy(id = "T8L61")
	private WebElement codigopostal;
	@FindBy(id = "T8L66")
	private WebElement ciudad;
	@FindBy(id = "T8L72")
	private WebElement calle;
	@FindBy(id = "T8L73")
	private WebElement nropuerta;
	@FindBy(id = "T8L74")
	private WebElement nroapto;
	@FindBy(id = "T8L75")
	private WebElement piso;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div/div[5]/div/div/div[2]/div[3]/button[1]/span")
	private WebElement aceptar3;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div/div[6]/div/div/div[2]/div[2]/div[3]/div[1]/div/button")
	private WebElement aceptarfin;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[2]/a/span")
	private WebElement visualizarreporte;

	public pageOper3PF(WebDriver driverChrome) {
		this.driverChrome = driverChrome;
		PageFactory.initElements(driverChrome, this);
	}

	public void crearPersonaFisica(String codigopais, String nrodoc, String Opcion, String tipodoc,
			String apellidopadre, String apellidomadre, String name, String segundoname, String fnacimiento,
			String pnacimiento, String presidencia, String dpto, String codpostal, String pciudad, String pcalle,
			String pnropuerta, String pnroapto, String ppiso) {
		Ayuda contayuda = new Ayuda(driverChrome);
		radioPersona.click();
		aceptar.click();
		paisdocumento.clear();
		paisdocumento.sendKeys(codigopais);
		paisdocumento.sendKeys(Keys.ENTER);
		driverChrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		contayuda.clickDerecho(driverChrome, seleccionartipodoc);
		insertartipodoc.clear();
		insertartipodoc.sendKeys(tipodoc);
		btnaceptar.click();
		celda.click();
		aceptar1.click();
		nrodocumento.clear();
		nrodocumento.sendKeys(nrodoc);
		nrodocumento.sendKeys(Keys.ENTER);
		aceptar2.click();
		contayuda.seleccionarListbox(ingrsootrodoc, Opcion);
		ingrsootrodoc.sendKeys(Keys.ENTER);
		apellidopaterno.clear();
		apellidopaterno.sendKeys(apellidopadre);
		apellidopaterno.sendKeys(Keys.ENTER);
		apellidomaterno.clear();
		apellidomaterno.sendKeys(apellidomadre);
		apellidomaterno.sendKeys(Keys.ENTER);
		primernombre.clear();
		primernombre.sendKeys(name);
		primernombre.sendKeys(Keys.ENTER);
		segundonombre.clear();
		segundonombre.sendKeys(segundoname);
		segundonombre.sendKeys(Keys.ENTER);
		fechanacimiento.clear();
		fechanacimiento.sendKeys(fnacimiento);
		fechanacimiento.sendKeys(Keys.ENTER);
		paisnacimiento.clear();
		paisnacimiento.sendKeys(pnacimiento);
		paisnacimiento.sendKeys(Keys.ENTER);
		alertatrace.click();
		paisresidencia.clear();
		paisresidencia.sendKeys(presidencia);
		paisresidencia.sendKeys(Keys.ENTER);
		departamento.clear();
		departamento.sendKeys(dpto);
		departamento.sendKeys(Keys.ENTER);
		codigopostal.clear();
		codigopostal.sendKeys(codpostal);
		codigopostal.sendKeys(Keys.ENTER);
		ciudad.clear();
		ciudad.sendKeys(pciudad);
		ciudad.sendKeys(Keys.ENTER);
		calle.clear();
		calle.sendKeys(pcalle);
		calle.sendKeys(Keys.ENTER);
		nropuerta.clear();
		nropuerta.sendKeys(pnropuerta);
		nropuerta.sendKeys(Keys.ENTER);
		nroapto.clear();
		nroapto.sendKeys(pnroapto);
		nroapto.sendKeys(Keys.ENTER);
		piso.clear();
		piso.sendKeys(ppiso);
		piso.sendKeys(Keys.ENTER);
		aceptar3.click();
		aceptarfin.click();
		visualizarreporte.click();
	}
}
