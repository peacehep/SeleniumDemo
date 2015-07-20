package testAPI;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.TakesScreenshot;

public class TakeScreenshot {
	
	public static void main(String[] args) throws IOException{
		
		WebDriver dr = new FirefoxDriver();
		
		File screenshotFile = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File("D:/test.png"));
	
	}

}
