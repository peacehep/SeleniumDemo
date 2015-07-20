package testAPI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocateObject {
	
	public void main(String[] args){
		
		WebDriver dr = new ChromeDriver();
		
		/*
		 * 单个对象的定位方法
		 * 多个对象的定位方法
		 * 层级定位
		 * 
		 */
		
		/* 单个对象的定位方法
		 * 获得操作对象
		 * 获得对象的属性，如获得测试对象的class属性，name属性等等
		 * 获得对象的text
		 * 获得对象的数量
		 * 
		 */
		
		dr.findElement(By.id("---ELEMENT ID---"));
		
		dr.findElement(By.name("---ELEMENT NAME---"));
		
		dr.findElement(By.tagName("---TAG NAME---")).getAttribute("Attribute Name");
		
		dr.findElement(By.linkText("---TEXT NAME---"));
		
		dr.findElement(By.cssSelector("---TEXT NAME---"));
		
		dr.findElement(By.xpath("Element XPATH"));
		
		/*
		 * 多个对象的定位方法
		 * 
		 */
		int num_elements_size;
		
		List<WebElement> elements = dr.findElements(By.xpath("---ELEMENT XPATH---"));
		
		num_elements_size = elements.size();
		
		/*
		 * 层级定位
		 * 
		 */
		
		WebElement obj_father = dr.findElement(By.className("---ELEMENT CLASS NAME---"));
		
		List<WebElement> obj_child = obj_father.findElements(By.xpath("---CHILD ELEMENT TAG ---"));
		
		for(WebElement e : obj_child){
			
			System.out.println(e.getText());
			
		}
		
		/* Example:
		 * Dropdown List
		 * Link1
		 * 	Dropdown
		 *  	Item1
		 *  	Item2
		 *  	Item3
		 *  
		 */
		
		dr.findElement(By.linkText("Link1")).click();
		
		(new WebDriverWait(dr, 10)).until(new ExpectedCondition<Boolean>(){
			
			public Boolean apply(WebDriver d){
				
				return d.findElement(By.id("Item1")).isDisplayed();
							
			}
		});
		
		
		WebElement menu = dr.findElement(By.id("dropdown")).findElement(By.linkText("Item1"));
		
		(new Actions(dr)).moveToElement(menu).perform();
		
		/* Example:
		 * Filter checkbox from TagName = INPUT
		 *  
		 */
		
        List<WebElement> inputs = dr.findElements(By.tagName("input"));
        
        for(WebElement input : inputs){
        	
            if(input.getAttribute("type").equals("checkbox")){
            	
                input.click();
                
            }
        }
		

		
		
		
	}
	

}
