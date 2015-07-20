package testAPI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BreadCrumb {
	
	public static void main(String[] args){
	
		WebDriver dr = new ChromeDriver();
		
		/*
		 * 在实际的测试脚本中，有可能需要处理面包屑。
		 * 处理面包屑主要是获取其层级关系，以及获得当前的层级。
		 * 一般来说当前层级都不会是链接，而父层级则基本是以链接，所以处理面包屑的思路就很明显了。
		 * 找到面包屑所在的div或ul，然后再通过该div或ul找到下面的所有链接，这些链接就是父层级。
		 * 最后不是链接的部分就应该是当前层级了。
		 * 
		 */
		
		List<WebElement> ancestors = dr.findElement(By.className("breadcrumb")).findElements(By.tagName("a"));
		
		for(WebElement link : ancestors){
			
			System.out.println(link.getText());
		}
		
		WebElement current = dr.findElement(By.className("breadcrumb")).findElement(By.className("active"));
		
        System.out.println(current.getText());
        
        
		
	}
}
