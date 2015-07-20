package testAPI;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;



public class FFProfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//add new perference
		FirefoxProfile profile = new FirefoxProfile();
		
		profile.setPreference("aaa", "bbbb");
		WebDriver dr = new FirefoxDriver(profile);
		
		/*
		 *use existing profile
		 * already existed in Firefox's profile manager
		 */
		ProfilesIni allProfiles = new ProfilesIni();
		
		FirefoxProfile profile_2 = allProfiles.getProfile("WebDriver");
		
		WebDriver dr_2 = new FirefoxDriver(profile_2);
		
		/*
		 *use existing profile
		 * not registered in Firefox's profile manager
		 */
		
		File profileDir = new File("--PATH--");
		
		FirefoxProfile profile_3 = new FirefoxProfile(profileDir);
		
		WebDriver dr_3 = new FirefoxDriver(profile_3);
		
		
		// temporary specified plug-in
		
		File file = new File("path/to/your/</SPAN>firebug-1.8.1.xpi");
		
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		
		firefoxProfile.addExtension(file);
		
		firefoxProfile.setPreference("extensions.firebug.currentVersion","1.8.1"); //避免启动画面
		
		WebDriver driver = new FirefoxDriver(firefoxProfile);
		
		//启用默认情况下被firefox 禁用的功能
		
		FirefoxProfile profile_4 = new FirefoxProfile();
		
		profile.setEnableNativeEvents(true);
		
		WebDriver dr_4 = new FirefoxDriver(profile_4);
		
		//其它设置见selenium webdriver API 中的org.openqa.selenium.firefox.FirefoxProfile.
		
		
		//启用firefox 代理
		
		String PROXY = "localhost:8080";//如果不是本机，localhost 替换成IP地址
		org.openqa.selenium.Proxy proxy = new org.openqa.selenium.Proxy();
		proxy.setHttpProxy(PROXY)
			.setFtpProxy(PROXY)
			.setSslProxy(PROXY);
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.PROXY, proxy);
	
		WebDriver dr_5 = new FirefoxDriver(cap);
		
	}

}