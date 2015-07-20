package testAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementStatusCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver dr = new FirefoxDriver();
		
		/*
		 * 在web自动化测试中，我们需要获取测试对象的四种状态是否显示。
		 * 1. 使用element.isDisplayed()方法；是否存在。
		 * 2. 使用findElement方法，捕获其抛出的异常，
		 *   	如果是NoSuchElementException的话则可以确定该元素不存在；
		 * 3. 是否被选中。一般是判断表单元素，比如radio或checkbox是否被选中。
		 *   	使用element.isSelected()方法；
		 * 4. 否enable，也就是是否是灰化状态。
		 * 	 	使用element.isEnabled()方法；
		 * 
		 */
		
		WebElement obj_text_field = dr.findElement(By.name("ELEMENT NAME"));
		
		System.out.println(obj_text_field.isDisplayed());
		
		/*
		 * 在这里我们遇到了一种情况，那就是测试对象看上去是disabled，
		 * 但是使用enabled方法却返回true。
		 * 这时候一般思路是判断该对象的css属性或class，
		 * 通过这些值去进一步判断对象是否disable。
		 * 
		 */
		
		System.out.println(dr.findElement(By.className("CLASSNAME")).isEnabled());
		
		WebElement obj_radio = dr.findElement(By.name("ELEMENT NAME"));
		
		obj_radio.click();
        
		System.out.println(obj_radio.isSelected());
        
        try{
            dr.findElement(By.id("none"));
            
        } catch(NoSuchElementException e){
        	
            System.out.println("element does not exist");
            
        }
		
        
     

	}

}
