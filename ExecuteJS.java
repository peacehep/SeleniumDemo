package testAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;

public class ExecuteJS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver dr = new FirefoxDriver();
		
		/*
		 * webdriver提供了JavascriptExecutor(dr).executeScript()接口来帮助我们完成这一工作。
		 * 在实际的测试脚本中，以下两种场景是经常遇到的
		 * 		1. 在页面直接执行一段js
		 * 		2. 在某个已经定位的元素的上执行js
		 * 
		 */
		
		
		((JavascriptExecutor)dr).executeScript("alert(\"hello,this is a alert!\")");
		
		WebElement button = dr.findElement(By.className("btn"));
		
        ((JavascriptExecutor)dr).executeScript("$(arguments[0]).fadeOut();", button);
					
	}

}
