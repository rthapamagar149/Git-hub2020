package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
  public static WebDriver driver;
  public BrowserFactory() {
	  
  }
  
  
  public static WebDriver getDriver() {
	if(driver==null)  {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable --notifications");
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver.manage().window().maximize();
		driver=new  ChromeDriver(options);
	}
	return driver;
  }
  public static WebDriver getDriver(String browserName) {
	 if(driver==null) {
		if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver.manage().window().maximize();
			driver=new  FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		}
		else if(browserName.equalsIgnoreCase("chrome")) {
			System.out.println("in chrome");
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver.manage().window().maximize();
			driver=new  ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		}
	 }
	 return driver;
  }
}
