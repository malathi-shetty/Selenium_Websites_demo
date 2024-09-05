package window_Handles;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandler_generic_Code {

	public static void main(String[] args) {
		// switchToWindow

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		 Set<String> windowHandles = driver.getWindowHandles();
	        for (String handle : windowHandles) {
	            driver.switchTo().window(handle);
	            if (driver.getTitle().equals(windowTitle)) {
	                break;
	            }
	}

}
