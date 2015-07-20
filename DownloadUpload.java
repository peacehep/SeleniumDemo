package testAPI;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadUpload {
	
	public static void main(String[] args){
	
		WebDriver dr = new FirefoxDriver();
		
		/*
		 * 上传文件的方法是找到上传文件的对象，通常是的对象。
		 * 然后直接往这个对象sendKeys，传入需要上传文件的正确路径。
		 * 绝对路径和相对路径都可以，但是上传的文件必须存在，否则会报错。
		 * 
		 */
		
		File str_file_path = new File("FILE PATH");
		
		String filePath = "file:///" + str_file_path.getAbsolutePath();
		
		dr.get(filePath);
		
		dr.findElement(By.cssSelector("input[type=file]")).sendKeys("src/navs.html");
		
		/*
		 * webdriver允许我们设置默认的文件下载路径。
		 * 也就是说文件会自动下载并且存在设置的那个目录中。
		 * 下面会给出firefox浏览器的具体设置方法。
		 * 
		 * 
		 */
	    
		  //driver = Selenium::WebDriver.for :chrome, :profile => profile

		  // for firefox 
		  FirefoxProfile firefoxProfile = new FirefoxProfile();

	      firefoxProfile.setPreference("browser.download.folderList",2);
  		  firefoxProfile.setPreference("browser.download.manager.showWhenStarting",false);
		  firefoxProfile.setPreference("browser.download.dir","c:\\downloads");
		  firefoxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk","text/csv");

		  WebDriver driver = new FirefoxDriver(firefoxProfile);
		  //new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);

		  driver.navigate().to("http://www.myfile.com/hey.csv");
	
	}
}
