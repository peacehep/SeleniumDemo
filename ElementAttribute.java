package testAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementAttribute {
	public static void main(String[] args){
		
		WebDriver dr = new FirefoxDriver();
		
		//Get the value of a the given attribute of the element.
		dr.findElement(By.id("ELEMENT ID")).getAttribute("ELEMENT NAME");
		
		//The innerText of this element.
		
		dr.findElement(By.id("ELEMENT ID")).getText();
		
		System.out.println(dr.findElement(By.id("ELEMENT ID")).getCssValue("color"));
		
		
	}
	
	
}
