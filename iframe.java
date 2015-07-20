package testAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class iframe {
	
	public static void main(String[] args){
		
		WebDriver dr = new ChromeDriver();
		
		/*
		 *	default content 中查找一个在iframe 中的元素，
		 *	那肯定是找不到的。
		 *	反之你在一个iframe 中查找另一个iframe 元素或default content 中的元素，
		 *	那必然也定到不到。
		 *
		 *	selenium webdriver 中提供了进入一个iframe 的方法：
		 *	WebDriver org.openqa.selenium.WebDriver.TargetLocator.frame(StringnameOrId)
		 *
		 *	也提供了一个返回default content 的方法：
		 *	WebDriver org.openqa.selenium.WebDriver.TargetLocator.defaultContent()
		 *
		 */
		
		dr.switchTo().frame("---FRAME ID---");
		
		dr.findElement(By.id("---ID in this frame---"));
		
		//jump out of the frame
		
		dr.switchTo().defaultContent();
		dr.findElement(By.id("---ID out of this frame"));
		
		/*
		 * switch_to 方法会new1 个TargetLocator 对象，
		 * 使用该对象的frame方法可以将当前识别的”主体”
		 * 移动到需要定位的frame上去。
		 * 
		 */		
	}

}
