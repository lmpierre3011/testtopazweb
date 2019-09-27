package pages;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import Ayuda.Ayuda;
import Ayuda.screenShooters;

public class pageOper2PJB {

	private WebDriver driverChrome;
	private By accion1Oper = By.id("T1L3");
	private By accion2Oper = By.id("T1L4");
	private By acciontrueOper = By.xpath(
			"//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div/div/div/div/div[2]/div[3]/button[1]");
	private By paisdoc = By.id("T1L10");
	private By aceptar = By.xpath(
			"//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div[3]/button[1]/span");
	private By tipodoc = By.xpath("//*[@id=\"T2L7\"]/div[1]/div/div[1]/span");
	private By valordoc = By.xpath(
			"//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[2]/div[3]/div[3]/input");
	private By aceptarayuda = By.xpath(
			"//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[2]/div[4]/button[1]/span");
	private By captofila = By.xpath("//*[@id=\"T2L7\"]/div[2]/div/div[1]");
	private By aceptar2 = By.xpath(
			"//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div/div[3]/div/div/div[2]/div[3]/button[1]/span");
	private By numdoc = By.id("T4L7");
	private By fechapre = By.id("T4L24");
	private By aceptar3 = By.xpath(
			"//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div/div[4]/div/div/div[2]/div[3]/button[1]/span");
	private By otrodoc = By.id("T7L4");
	private By razsoc = By.id("T9L4");
	private By msj = By.xpath(
			"//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div/div[7]/div/div/div[2]/div[2]/div[3]/div[1]/div/button/span");
	private By fechac = By.id("T9L16");
	private By tippj = By.id("T9L20");
	private By nomfant = By.id("T9L23");
	private By contacto = By.id("T9L26");
	private By cargo = By.id("T9L29");
	private By aceptar4 = By.xpath(
			"//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div/div[6]/div/div/div[2]/div[3]/button[1]/span");
	private By paisresi = By.id("T10L3");
	private By dpto = By.id("T10L10");
	private By codigp = By.id("T10L19");
	private By ciudad = By.id("T10L26");
	private By calle = By.id("T10L29");
	private By puerta = By.id("T10L36");
	private By apto = By.id("T10L37");
	private By piso = By.id("T10L38");
	private By fijo = By.id("T10L39");
	private By movil = By.id("T10L42");
	private By telconf = By.id("T10L49");
	private By sendform = By.xpath(
			"//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div/div[7]/div/div/div[2]/div[3]/button[1]/span");
	private By codcu = By.id("T10L58");
	private By iniact = By.id("T10L62");
	private By ventan = By.id("T10L69");
	private By ultinsc = By.id("T10L79");
	private By certdgi = By.id("T10L83");
	private By aceptar5 = By.xpath(
			"//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div/div[8]/div/div/div[2]/div[3]/button[1]/span");
	private By prespor = By.id("T10L91");
	private By forma = By.id("T10L93");
	private By incpeps = By.id("T10L101");
	private By perftr = By.id("T10L102");
	private By aceptar6 = By.xpath(
			"//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div/div[9]/div/div/div[2]/div[3]/button[1]/span");
	private By ira = By.id("T10L107");
	private By imeb = By.id("T10L108");
	private By ipequ = By.id("T10L110");
	private By monotri = By.id("T10L112");
	private By codimp = By.id("T10L114");
	private By levsec = By.id("T10L118");
	private By aceptar7 = By.xpath(
			"//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div/div[10]/div/div/div[2]/div[3]/button[1]/span");
	private By datint = By.id("T13L5");
	private By finoper = By.xpath(
			"//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div/div[12]/div/div/div[2]/div[2]/div[3]/div[1]/div/button/span");
	private By verform = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[2]/a/span");
	private By reporte = By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div/div[3]/div/div[2]/div/h2");

	public pageOper2PJB(WebDriver driverchrome) {
		this.driverChrome = driverchrome;
	}

	public void selectaccion(int index1, int index2) {
		WebDriverWait wait = new WebDriverWait(driverChrome, 10);
		WebElement cantAcciones = wait.until(ExpectedConditions.presenceOfElementLocated(accion1Oper));
		WebElement cantAcciones2 = wait.until(ExpectedConditions.presenceOfElementLocated(accion2Oper));
		Select selectacciones = new Select(cantAcciones);
		Select selectacciones2 = new Select(cantAcciones2);
		selectacciones.selectByIndex(index1);
		selectacciones2.selectByIndex(index2);
		driverChrome.findElement(acciontrueOper).click();
	}

	public void assertreport() {
		String texto = driverChrome.findElement(reporte).getText();
		assertTrue(texto.contains("Alta / Modif. Persona Jurídica"));;
	}

	public void oper2002(String paisdo, String tipodo, String numdo, String fechap, String otrodo, String razsoci,
			String fechanc, String tippe, String fant, String contact, String carg, String paisres, String depto,
			String codpost, String call, String nropuert, String apt, String pis, String telfij, String celu,
			String codigocu, String iniciac, String venta, String ultins, String dgi, String presenta, String formaban,
			String peps, String trace, String irae, String imeba, String ipeque, String monotrib, String codimpu,
			String levsecban, String datosint) {
		driverChrome.findElement(paisdoc).sendKeys(paisdo);
		driverChrome.findElement(paisdoc).sendKeys(Keys.ENTER);
		screenShooters.takescreenShooters("evidencia01", driverChrome);
		driverChrome.findElement(aceptar).click();
		Ayuda help = new Ayuda(driverChrome);
		help.clickDerecho(driverChrome, driverChrome.findElement(tipodoc));
		driverChrome.findElement(valordoc).sendKeys(tipodo);
		driverChrome.findElement(valordoc).sendKeys(Keys.ENTER);
		driverChrome.findElement(aceptarayuda).click();
		driverChrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driverChrome.findElement(captofila).click();
		driverChrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		screenShooters.takescreenShooters("evidencia02", driverChrome);
		driverChrome.findElement(aceptar2).click();
		driverChrome.findElement(numdoc).sendKeys(numdo);
		driverChrome.findElement(numdoc).sendKeys(Keys.ENTER);
		driverChrome.findElement(fechapre).sendKeys(fechap);
		driverChrome.findElement(fechapre).sendKeys(Keys.ENTER);
		driverChrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		screenShooters.takescreenShooters("evidencia03", driverChrome);
		driverChrome.findElement(aceptar3).click();
		driverChrome.findElement(otrodoc).sendKeys(otrodo);
		driverChrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driverChrome.findElement(otrodoc).sendKeys(Keys.ENTER);
		screenShooters.takescreenShooters("evidencia04", driverChrome);
		driverChrome.findElement(razsoc).sendKeys(razsoci);
		driverChrome.findElement(razsoc).sendKeys(Keys.ENTER);
		driverChrome.findElement(msj).click();
		driverChrome.findElement(fechac).sendKeys(fechanc);
		driverChrome.findElement(fechac).sendKeys(Keys.ENTER);
		driverChrome.findElement(tippj).sendKeys(tippe);
		driverChrome.findElement(tippj).sendKeys(Keys.ENTER);
		driverChrome.findElement(nomfant).sendKeys(fant);
		driverChrome.findElement(nomfant).sendKeys(Keys.ENTER);
		driverChrome.findElement(contacto).sendKeys(contact);
		driverChrome.findElement(contacto).sendKeys(Keys.ENTER);
		driverChrome.findElement(cargo).sendKeys(carg);
		driverChrome.findElement(cargo).sendKeys(Keys.ENTER);
		driverChrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		screenShooters.takescreenShooters("evidencia05", driverChrome);
		driverChrome.findElement(aceptar4).click();
		driverChrome.findElement(paisresi).sendKeys(paisres);
		driverChrome.findElement(paisresi).sendKeys(Keys.ENTER);
		driverChrome.findElement(dpto).sendKeys(depto);
		driverChrome.findElement(dpto).sendKeys(Keys.ENTER);
		driverChrome.findElement(codigp).sendKeys(codpost);
		driverChrome.findElement(codigp).sendKeys(Keys.ENTER);
		driverChrome.findElement(ciudad).sendKeys(Keys.ENTER);
		driverChrome.findElement(calle).sendKeys(call);
		driverChrome.findElement(calle).sendKeys(Keys.ENTER);
		driverChrome.findElement(puerta).sendKeys(nropuert);
		driverChrome.findElement(puerta).sendKeys(Keys.ENTER);
		driverChrome.findElement(apto).sendKeys(apt);
		driverChrome.findElement(apto).sendKeys(Keys.ENTER);
		driverChrome.findElement(piso).sendKeys(pis);
		driverChrome.findElement(piso).sendKeys(Keys.ENTER);
		driverChrome.findElement(fijo).sendKeys(telfij);
		driverChrome.findElement(fijo).sendKeys(Keys.ENTER);
		driverChrome.findElement(movil).sendKeys(celu);
		driverChrome.findElement(movil).sendKeys(Keys.ENTER);
		driverChrome.findElement(telconf).sendKeys(Keys.ENTER);
		driverChrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		screenShooters.takescreenShooters("evidencia06", driverChrome);
		driverChrome.findElement(sendform).click();
		driverChrome.findElement(codcu).sendKeys(codigocu);
		driverChrome.findElement(codcu).sendKeys(Keys.ENTER);
		driverChrome.findElement(iniact).sendKeys(iniciac);
		driverChrome.findElement(iniact).sendKeys(Keys.ENTER);
		driverChrome.findElement(ventan).sendKeys(venta);
		driverChrome.findElement(ventan).sendKeys(Keys.ENTER);
		driverChrome.findElement(ultinsc).sendKeys(ultins);
		driverChrome.findElement(ultinsc).sendKeys(Keys.ENTER);
		driverChrome.findElement(certdgi).sendKeys(dgi);
		driverChrome.findElement(certdgi).sendKeys(Keys.ENTER);
		driverChrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		screenShooters.takescreenShooters("evidencia07", driverChrome);
		driverChrome.findElement(aceptar5).click();
		driverChrome.findElement(prespor).sendKeys(presenta);
		driverChrome.findElement(prespor).sendKeys(Keys.ENTER);
		driverChrome.findElement(forma).sendKeys(formaban);
		driverChrome.findElement(forma).sendKeys(Keys.ENTER);
		driverChrome.findElement(incpeps).sendKeys(peps);
		driverChrome.findElement(incpeps).sendKeys(Keys.ENTER);
		driverChrome.findElement(perftr).sendKeys(trace);
		driverChrome.findElement(perftr).sendKeys(Keys.ENTER);
		driverChrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		screenShooters.takescreenShooters("evidencia08", driverChrome);
		driverChrome.findElement(aceptar6).click();
		driverChrome.findElement(ira).sendKeys(irae);
		driverChrome.findElement(ira).sendKeys(Keys.ENTER);
		driverChrome.findElement(imeb).sendKeys(imeba);
		driverChrome.findElement(imeb).sendKeys(Keys.ENTER);
		driverChrome.findElement(ipequ).sendKeys(ipeque);
		driverChrome.findElement(ipequ).sendKeys(Keys.ENTER);
		driverChrome.findElement(monotri).sendKeys(monotrib);
		driverChrome.findElement(monotri).sendKeys(Keys.ENTER);
		driverChrome.findElement(codimp).sendKeys(codimpu);
		driverChrome.findElement(codimp).sendKeys(Keys.ENTER);
		driverChrome.findElement(levsec).sendKeys(levsecban);
		driverChrome.findElement(levsec).sendKeys(Keys.ENTER);
		driverChrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		screenShooters.takescreenShooters("evidencia09", driverChrome);
		driverChrome.findElement(aceptar7).click();
		driverChrome.findElement(datint).sendKeys(datosint);
		screenShooters.takescreenShooters("evidencia10", driverChrome);
		driverChrome.findElement(datint).sendKeys(Keys.ENTER);
		screenShooters.takescreenShooters("evidencia11", driverChrome);
		driverChrome.findElement(finoper).click();
		screenShooters.takescreenShooters("evidencia12", driverChrome);
		driverChrome.findElement(verform).click();
	}
}
