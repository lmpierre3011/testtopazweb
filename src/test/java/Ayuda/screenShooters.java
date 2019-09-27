package Ayuda;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenShooters {

	public static void takescreenShooters(String screenshooter, WebDriver driverChrome) {
		File directorio  = new File("C:\\Users\\alejandro\\Pictures\\Evidencias");
		File myscrenshoot = ((TakesScreenshot) driverChrome).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(myscrenshoot, new File(directorio.getAbsolutePath() +"\\"+ screenshooter +".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}



  