package testAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver dr = new ChromeDriver();
		
		Select dropdown = new Select(dr.findElement(By.id("DROPDOWN LIST ID")));
		
		dropdown.selectByIndex(1);
		
		dropdown.selectByValue("VALUE");
		
		//遍历所有选项
		
		for(WebElement e : dropdown.getOptions()){
			
			e.click();
			
		}
		
		
		
		
		
			
	}

}
