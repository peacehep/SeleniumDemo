## Selenium WebDriver API 的基础用法 
###### 均整理自网络，仅供学习参考


+  [Open Browser](https://github.com/peacehep/SeleniumDemo/blob/Selenium/OpenBrowser.java) 

>Default Path 
>
>Specified Path

+  [Other Browser Action](https://github.com/peacehep/SeleniumDemo/blob/Selenium/OtherBrowserAction.java)
	
>close() or quit()
>
>maximize()
>
>SetSize()

+  [Navigate URL](https://github.com/peacehep/SeleniumDemo/blob/Selenium/NavURL.java)

>get()
>
>navigate().to() and navigate().to().back()/forward()

+  [Locate Object](https://github.com/peacehep/SeleniumDemo/blob/Selenium/LocateObject.java)
	
>Locate one object
>
>Locate multiple objects

+  [Operate Element](https://github.com/peacehep/SeleniumDemo/blob/Selenium/ElementOperate.java)

>sendKeys()
>
>clear()
>
>click()

+  [Group Buttons](https://github.com/peacehep/SeleniumDemo/blob/Selenium/ButtonGroup.java)
	
>Locate father div tag and then to locate all the following objects

+  [BreadCrumb](https://github.com/peacehep/SeleniumDemo/blob/Selenium/BreadCrumb.java)

>Hiberarchy

+  [Popup Windows](https://github.com/peacehep/SeleniumDemo/blob/Selenium/PopupWindow.java)

>Alert Class
> 
>Alert, Confirm and Prompt
> 
>switchTo().alert()
> 
>getText()
> 
>accept() and dismiss()

+  [iframe](https://github.com/peacehep/SeleniumDemo/blob/Selenium/iframe.java)

>switchTo().frame()
>
>switchTo().defaultContent()

+  [Dropdown List](https://github.com/peacehep/SeleniumDemo/blob/Selenium/DropdownList.java)

>Class:Select
>
>select.selectByIndex("index");
>
>select.selectByValue("value");


+  [Cookies](https://github.com/peacehep/SeleniumDemo/blob/Selenium/CookiesTest.java)

> domain,name,value,expriy,path
> 
> driver.manage().addCookie();
> 
> driver.manage().getCookie();
> 
> dr.manage().deleteCookieNamed("Cookies Name");
> 
> dr.manage().deleteCookie("CookieName");
> 
> dr.manage().deleteAllCookies();

+  [Take Screenshot](https://github.com/peacehep/SeleniumDemo/blob/Selenium/TakeScreenshot.java)

		import org.openqa.selenium.TakesScreenshot;
		File screenshotFile = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);

+  [Firefox Profile](https://github.com/peacehep/SeleniumDemo/blob/Selenium/FFProfile.java)

>add new profile
>
>use existing profile
>
>temporary sepecified plug-in
>
>enable function
>
>firefox proxy setting

+  [Element Attribute](https://github.com/peacehep/SeleniumDemo/blob/Selenium/ElementAttribute.java)

>getAttribute();
>getText();
>getCssValue();

+  [Element Status Check](https://github.com/peacehep/SeleniumDemo/blob/Selenium/ElementStatusCheck.java)

>isDisplayed();
>isSelected();
>isEnabled();


+  [Execute JavaScript](https://github.com/peacehep/SeleniumDemo/blob/Selenium/ExecuteJS.java)

		JavascriptExecutor)dr).executeScript("alert(\"hello,this is a alert!\")");
		((JavascriptExecutor)dr).executeScript("$(arguments[0]).fadeOut();", button);

+  [Drag and Drop](https://github.com/peacehep/SeleniumDemo/blob/Selenium/DragDrop.java)

		(new Actions(dr)).dragAndDrop(from,to).perform();
>Other operations in Action Class (KeyDown, KeyUp, Click,sendKeys,doubleClick,clickAndHold, release,moveToElement, contextClick)

+  [Download and Upload](https://github.com/peacehep/SeleniumDemo/blob/Selenium/DownloadUpload.java)

>File Class
>
>sendKeys
>
>setPreference

+  [WaitElement](https://github.com/peacehep/SeleniumDemo/blob/Selenium/WaitElement.java)

>explicit wait

			explicit_wait.until(new ExpectedCondition<WebElement>(){
			
			@Override
			public WebElement apply(WebDriver d){
				
				return d.findElement(By.id("b"));
			}
			}).click();


>implicit wait

		dr.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
