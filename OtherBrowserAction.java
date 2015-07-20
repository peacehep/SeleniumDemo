package testAPI;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OtherBrowserAction {
	
	public static void main(String[] args){
		
		WebDriver dr = new ChromeDriver();
		
		/*
		 * close方法关闭当前的浏览器窗口，
		 * quit方法不仅关闭窗口，还会彻底的退出webdriver，释放与driver server之间的连接。
		 * 所以简单来说quit是更加彻底的close，quit会更好的释放资源，适合强迫症和完美主义者
		 */
		
		dr.quit();
		dr.close();
		
		
		// 窗口最大化
		dr.manage().window().maximize();
		
		/*
		 * 设置浏览器窗口的大小有下面两个比较常见的用途：
		 * 1. 在统一的浏览器大小下运行用例，可以比较容易的跟一些基于图像比对的工具进行结合，
		 *    提升测试的灵活性及普遍适用性。
		 *    比如可以跟sikuli结合，使用sikuli操作flash；
		 * 2. 在不同的浏览器大小下访问测试站点，对测试页面截图并保存，
		 *    然后观察或使用图像比对工具对被测页面的前端样式进行评测。
		 *    比如可以将浏览器设置成移动端大小(320x480)，然后访问移动站点，对其样式进行评估；
		 */
		
		
		dr.manage().window().setSize(new Dimension(320,240));
		
		
	}

}
