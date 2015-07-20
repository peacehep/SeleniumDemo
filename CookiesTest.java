package testAPI;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CookiesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Cookies 主要属性有
		 * 	domain
		 * 	name
		 * 	value
		 * 	expiry
		 * 	path
		 */

		WebDriver dr = new FirefoxDriver();
		
		Cookie cookie = new Cookie("name", "value");
		
		dr.manage().addCookie(cookie);
		
		
		Set<Cookie> cookies = dr.manage().getCookies();
		
		System.out.println(String.format("Dmain->name->value->expiry->path"));
		
		for(Cookie c : cookies){
			
			System.out.println(String.format("%s -> %s -> %s -> %s-> %s", c.getDomain(), c.getName(),c.getValue(),c.getExpiry(),c.getPath()));
		
		}
		
		/*
		 * Delete Cookie
		 */
		
		dr.manage().deleteCookieNamed("Cookies Name");
		
		dr.manage().deleteCookie(cookie);
		
		dr.manage().deleteAllCookies();
		
		
	}

}
