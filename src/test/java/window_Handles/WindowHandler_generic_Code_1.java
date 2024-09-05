package window_Handles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandler_generic_Code_1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		// Switch to a new window by index
	    public void switchToWindow(int index) {
	        String[] handles = driver.getWindowHandles().toArray(new String[0]);
	        if (index >= 0 && index < handles.length) {
	            driver.switchTo().window(handles[index]);
	        } else {
	            throw new IndexOutOfBoundsException("Window index out of range.");
	        }
	    }
	    
	    // Close all windows except the original window
	    public void closeAllWindowsExceptOriginal() {
	        String originalHandle = driver.getWindowHandle();
	        for (String handle : driver.getWindowHandles()) {
	            if (!handle.equals(originalHandle)) {
	                driver.switchTo().window(handle);
	                driver.close();
	            }
	        }
	        driver.switchTo().window(originalHandle);

	}

}
}