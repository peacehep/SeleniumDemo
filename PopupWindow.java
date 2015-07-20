package testAPI;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopupWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 定位弹出窗口的关键在于获得弹出窗口的handle
		 * windowhandles 方法获取所有弹出的浏览器窗口的句柄，
		 * 然后使用windowhandle 方法来获取当前浏览器窗口的句柄，
		 * 将这两个值的差值就是新弹出窗口的句柄。
		 * 
		 * 在获取新弹出窗口的句柄后，
		 * 使用switchto.window(newwindow_handle)方法，
		 * 将新窗口的句柄作为参数传入既可捕获到新窗口了。
		 * 
		 * 如果想回到以前的窗口定位元素，
		 * 那么再调用1 次switch_to.window 方法，
		 * 传入之前窗口的句柄既可达到目的。
		 * 
		 */
		
		/*
		 * Alert
		 * 
		 */
		
		WebDriver dr = new FirefoxDriver();
		
		dr.findElement(By.id("--Alert ID--")).click();
		
		Alert alert = dr.switchTo().alert();
		
		String text = alert.getText();
		
		alert.accept(); //alert.dismiss();
		
		/*
		 * Confirm
		 * 
		 */
		
		
		dr.findElement(By.id("--Confirm ID--")).click();
		
		Alert confirm = dr.switchTo().alert();
		
		confirm.accept(); // confirm.dismiss();
		
		
		/*
		 * Prompt
		 * 
		 */
		dr.findElement(By.id("--Prompt ID--")).click();
		
		Alert prompt = dr.switchTo().alert();
		
		prompt.sendKeys("TEXT");
		
		prompt.accept();//prompt.dismiss();
		
		
		
	}

}
