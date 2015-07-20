package testAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementOperate {
	
	public static void main(String[] args){
		
		WebDriver dr = new ChromeDriver();
		
		dr.findElement(By.linkText("--- LINK NAME ---"));
		
		WebElement obj_text_field = dr.findElement(By.name("--NAME--"));
		
		obj_text_field.sendKeys("--text--");
		
		obj_text_field.clear();
		
		dr.findElement(By.id("---ID NAME---")).sendKeys(Keys.chord(Keys.CONTROL + "a"));
		
		
		
	}

}
