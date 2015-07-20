package testAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NavURL {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver dr = new ChromeDriver();
		
		String str_url = "http://www.baidu.com";
		
		//-- method 1 GET--//
		
		dr.get(str_url);
		
		//-- method 2 NAVIGATE ( include BACK and FORWARD)--//
		
		dr.navigate().to(str_url);
		
		dr.navigate().back();
		dr.navigate().forward();
		
		//-- Get the Current URL -- //
		dr.getCurrentUrl();
		
		//-- Get Page Title --//
		dr.getTitle();
		
		
	}
}
