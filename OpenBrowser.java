package testAPI;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.ie.InternetExplorerDriver;




public class OpenBrowser {
	
	//--- Part 1 Start Browser ---//
	
	public static void main(String[] args){
		
		//-- For Chrome --//
		WebDriver drChrome = new ChromeDriver();
		
			// - For Specified Path - //
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		System.setProperty("webdriver.chrome.bin", "---CHROME BIN PATH---");
		
		WebDriver drChrome_2 = new ChromeDriver();
		
		//-- For FireFox--//
			//- Default Path - //
		
		WebDriver drFF = new FirefoxDriver();
	
			// - For Specified Path - 1//
		File pathToFirefoxBinary = new File("--Firefox Path--");
		
		WebDriver drFF_bin_1 = new FirefoxDriver();
		
			// - For Specified Path - 2//
		FirefoxBinary firefox_binary = new FirefoxBinary(pathToFirefoxBinary);
		
		WebDriver drFF_bin_2 = new FirefoxDriver(firefox_binary,null);
		
		//-- For IE --//
		File file = new File("---IEDriverServer Path---");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		
		WebDriver dr_ie = new InternetExplorerDriver();
	
		
	}

}
