package testAPI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver dr = new ChromeDriver();
		
		/*
		 *下面的代码演示了如何找到second这个按钮。
		 *其处理方法是先找到button group的父div，
		 *class为btn-group的div，
		 *然后再找到下面所有的div(也就是button)，
		 *返回text是second的div。 
		 * 
		 */
		
		List<WebElement> btns = dr.findElement(By.className("btn-group")).findElements(By.className("btn"));
		
		for(WebElement btn : btns){
			
			if(btn.getText().equals("second")){
				
				btn.click();
				break;
			}
		}

	}

}
