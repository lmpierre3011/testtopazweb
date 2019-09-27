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
import Ayuda.screenShooters;

public class pageOper2PFB {

	private WebDriver driverChrome;
	private By accion1Oper = By.id("T1L3");
	private By accion2Oper = By.id("T1L4");
	private By acciontrueOper = By.xpath(
			"//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div/div/div/div/div[2]/div[3]/button[1]");
	private By paisdoc = By.id("T4L2");
	private By tipodoc = By.id("T4L15");
	private By numdoc = By.id("T4L23");
	private By fechaven = By.id("T4L46");
	private By ape1 = By.id("T4L60");
	private By ape2 = By.id("T4L64");
	private By nombre1 = By.id("T4L66");
	private By nombre2 = By.id("T4L68");
	private By msj = By.xpath(
			"//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div/div[3]/div/div/div[2]/div[2]/div[3]/div[1]/div/button/span");
	private By fechanac = By.id("T4L78");
	private By paisnac = By.id("T4L96");
	private By nac = By.id("T4L103");
	private By sexo = By.id("T4L105");
	private By sitsent = By.id("T4L106");
	private By desc = By.id("T4L108");
	private By envdat = By.xpath(
			"//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div[3]/button[1]/span");
	private By otrodoc = By.id("T7L5");
	private By paisresi = By.id("T9L3");
	private By dpto = By.id("T9L9");
	private By codigp = By.id("T9L18");
	private By ciudad = By.id("T9L25");
	private By calle = By.id("T9L28");
	private By puerta = By.id("T9L36");
	private By apto = By.id("T9L38");
	private By piso = By.id("T9L39");
	private By fijo = By.id("T9L43");
	private By movil = By.id("T9L75");
	private By telconf = By.id("T9L111");
	private By sendform = By.xpath(
			"//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div/div[4]/div/div/div[2]/div[3]/button[1]/span");
	private By codprof = By.id("T10L3");
	private By empba = By.id("T10L6");
	private By codac = By.id("T10L7");
	private By ftein = By.id("T10L11");
	private By ing = By.id("T10L15");
	private By estpat = By.id("T10L33");
	private By consting = By.id("T10L35");
	private By includpep = By.id("T10L40");
	private By perftrac = By.id("T10L41");
	private By ira = By.id("T10L50");
	private By imeb = By.id("T10L51");
	private By ipequ = By.id("T10L55");
	private By monotri = By.id("T10L57");
	private By servper = By.id("T10L59");
	private By sendform2 = By.xpath(
			"//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div/div[5]/div/div/div[2]/div[3]/button[1]/span");
	private By datcony = By.id("T11L62");
	private By finoper = By.xpath(
			"//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div[3]/div/div[2]/div/div[2]/div/div[7]/div/div/div[2]/div[2]/div[3]/div[1]/div/button");
	private By verform = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[2]/a/span");
	private By reporte = By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div/div[3]/div/div[2]/div/h2");

	public pageOper2PFB(WebDriver driverchrome) {
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
		assertTrue(texto.contains("Alta Persona Física"));;
	}

	public void oper2002(String paisdo, String tipodo, String numdo, String fechav, String apel1, String apel2,
			String nomb1, String nomb2, String fechanc, String paisnc, String sex, String sitsen, String descr,
			String otro, String paisres, String depto, String codpost, String call, String nropuert, String apt,
			String pis, String telfij, String celu, String codprofe, String empban, String codact, String fteing,
			String ingr, String estpatr, String constingr, String includpeps, String perftrace, String irae,
			String imeba, String ipeque, String monotrib, String servpers, String datconyu) {
		driverChrome.findElement(paisdoc).sendKeys(paisdo);
		driverChrome.findElement(paisdoc).sendKeys(Keys.ENTER);
		driverChrome.findElement(tipodoc).sendKeys(tipodo);
		driverChrome.findElement(tipodoc).sendKeys(Keys.ENTER);
		driverChrome.findElement(numdoc).sendKeys(numdo);
		driverChrome.findElement(numdoc).sendKeys(Keys.ENTER);
		driverChrome.findElement(fechaven).sendKeys(fechav);
		driverChrome.findElement(fechaven).sendKeys(Keys.ENTER);
		driverChrome.findElement(ape1).sendKeys(apel1);
		driverChrome.findElement(ape1).sendKeys(Keys.ENTER);
		driverChrome.findElement(ape2).sendKeys(apel2);
		driverChrome.findElement(ape2).sendKeys(Keys.ENTER);
		driverChrome.findElement(nombre1).sendKeys(nomb1);
		driverChrome.findElement(nombre1).sendKeys(Keys.ENTER);
		driverChrome.findElement(nombre2).sendKeys(nomb2);
		driverChrome.findElement(nombre2).sendKeys(Keys.ENTER);
		driverChrome.findElement(msj).click();
		driverChrome.findElement(fechanac).sendKeys(fechanc);
		driverChrome.findElement(fechanac).sendKeys(Keys.ENTER);
		driverChrome.findElement(paisnac).sendKeys(paisnc);
		driverChrome.findElement(paisnac).sendKeys(Keys.ENTER);
		driverChrome.findElement(nac).sendKeys(Keys.ENTER);
		driverChrome.findElement(sexo).sendKeys(sex);
		driverChrome.findElement(sexo).sendKeys(Keys.ENTER);
		driverChrome.findElement(sitsent).sendKeys(sitsen);
		driverChrome.findElement(sitsent).sendKeys(Keys.ENTER);
		driverChrome.findElement(desc).sendKeys(descr);
		driverChrome.findElement(desc).sendKeys(Keys.ENTER);
		driverChrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		screenShooters.takescreenShooters("evidencia04", driverChrome);
		driverChrome.findElement(envdat).click();
		driverChrome.findElement(otrodoc).sendKeys(otro);
		screenShooters.takescreenShooters("evidencia05", driverChrome);
		driverChrome.findElement(otrodoc).sendKeys(Keys.ENTER);
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
		screenShooters.takescreenShooters("evidencia06", driverChrome);
		driverChrome.findElement(sendform).click();
		driverChrome.findElement(codprof).sendKeys(codprofe);
		driverChrome.findElement(codprof).sendKeys(Keys.ENTER);
		driverChrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driverChrome.findElement(empba).sendKeys(empban);
		driverChrome.findElement(empba).sendKeys(Keys.ENTER);
		driverChrome.findElement(codac).sendKeys(codact);
		driverChrome.findElement(codac).sendKeys(Keys.ENTER);
		driverChrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driverChrome.findElement(ftein).sendKeys(fteing);
		driverChrome.findElement(ftein).sendKeys(Keys.ENTER);
		driverChrome.findElement(ing).sendKeys(ingr);
		driverChrome.findElement(ing).sendKeys(Keys.ENTER);
		driverChrome.findElement(estpat).sendKeys(estpatr);
		driverChrome.findElement(estpat).sendKeys(Keys.ENTER);
		driverChrome.findElement(consting).sendKeys(constingr);
		driverChrome.findElement(consting).sendKeys(Keys.ENTER);
		driverChrome.findElement(includpep).sendKeys(includpeps);
		driverChrome.findElement(includpep).sendKeys(Keys.ENTER);
		driverChrome.findElement(perftrac).sendKeys(perftrace);
		driverChrome.findElement(perftrac).sendKeys(Keys.ENTER);
		driverChrome.findElement(ira).sendKeys(irae);
		driverChrome.findElement(ira).sendKeys(Keys.ENTER);
		driverChrome.findElement(imeb).sendKeys(imeba);
		driverChrome.findElement(imeb).sendKeys(Keys.ENTER);
		driverChrome.findElement(ipequ).sendKeys(ipeque);
		driverChrome.findElement(ipequ).sendKeys(Keys.ENTER);
		driverChrome.findElement(monotri).sendKeys(monotrib);
		driverChrome.findElement(monotri).sendKeys(Keys.ENTER);
		driverChrome.findElement(servper).sendKeys(servpers);
		driverChrome.findElement(servper).sendKeys(Keys.ENTER);
		screenShooters.takescreenShooters("evidencia07", driverChrome);
		driverChrome.findElement(sendform2).click();
		driverChrome.findElement(datcony).sendKeys(datconyu);
		screenShooters.takescreenShooters("evidencia08", driverChrome);
		driverChrome.findElement(datcony).sendKeys(Keys.ENTER);
		screenShooters.takescreenShooters("evidencia09", driverChrome);
		driverChrome.findElement(finoper).click();
		screenShooters.takescreenShooters("evidencia10", driverChrome);
		driverChrome.findElement(verform).click();
	}
}
