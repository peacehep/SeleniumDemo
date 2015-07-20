package testAPI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class WaitElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver dr = new FirefoxDriver();
		
		/*
		 * explicit wait
		 */

		Thread.sleep(5000);
		
		/*
		 * 利用WebDriverWait类
		 * ExpectedCondition接口
		 * 就能实现这一点。
		 *
		 */
		
		
		/*
		 * 在实例化WebDriverWait类时，有下面2个构造方法
		 * 		public WebDriverWait(WebDriver driver, long timeOutInSeconds)
		 * 		public WebDriverWait(WebDriver driver, long timeOutInSeconds, long sleepInMillis)
		 * 其参数为
		 * 		WebDriver driver。不言而喻
		 * 		long timeOutInSeconds。总体的超时时间，最多等这么久。
		 * 		long sleepInMillis。每隔多久去检查一次until的结果
		 */
		
		WebDriverWait explicit_wait = new WebDriverWait(dr,10);
		
		explicit_wait.until(new ExpectedCondition<WebElement>(){
			
			@Override
			public WebElement apply(WebDriver d){
				
				return d.findElement(By.id("b"));
			}
		}).click();
		
		/*
		 * implicit wait
		 * 
		 * 隐性等待是指当要查找元素，
		 * 而这个元素没有马上出现时，
		 * 告诉WebDriver 查询Dom 一定时间。
		 * 默认值是0,但是设置之后，
		 * 这个时间将在WebDriver 对象实例整个生命周期都起作用。
		 */
		
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		/*
		 * webdriver中可以设置其他的超时时间
		 * 	1. setScriptTimeout。异步脚本的超时时间。
		 * 		webdriver可以异步执行脚本，
		 * 		这个是设置异步执行脚本脚本返回结果的超时时间
		 *  2. pageLoadTimeout。页面加载时的超时时间。
		 *  	因为webdriver会等页面加载完毕在进行后面的操作，
		 *  	所以如果页面在这个超时时间内没有加载完成，
		 *  	那么webdriver就会抛出异常
		 */
		
		  dr.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

		  dr.manage().timeouts().setScriptTimeout(3, TimeUnit.SECONDS);
		
	}

}
