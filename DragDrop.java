package testAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver dr = new FirefoxDriver();
		
		WebElement from = dr.findElement(By.id("item1"));
		
		WebElement to = dr.findElement(By.id("drop"));

		(new Actions(dr)).dragAndDrop(from,to).perform();
		
	   /*
		*Action类的一些主要方法还有:
		*
		*  keyDown。模拟按键按下
		*  keyUp。模拟按键弹起
		*  click
		*  sendKeys
		*  doubleClick。鼠标左键双击
		*  clickAndHold。鼠标左键点击住不放
		*  release。鼠标左键弹起，可以与click_and_hold配合使用
		*  moveToElement。把鼠标移动到元素的中心点
		*  contextClick。鼠标右键点击
		*/
		
		
	}

}
