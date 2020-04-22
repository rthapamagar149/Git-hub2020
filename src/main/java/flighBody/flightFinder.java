package flighBody;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class flightFinder {
   WebDriver driver;
   public flightFinder(WebDriver driver) {
	   this.driver=driver;
   }
   @FindBy(how=How.XPATH,using="//*[@id=\'toggle-roundtrip\']")
   @CacheLookup WebElement roundTrip;
   @FindBy(how=How.XPATH,using="//*[@id=\'toggle-oneway\']")
   @CacheLookup WebElement singleTrip;
   @FindBy(how=How.XPATH,using="passCount")
   @CacheLookup WebElement passCount;
   @FindBy(how=How.XPATH,using="fromPort")
   @CacheLookup WebElement fromPort;
   @FindBy(how=How.XPATH,using="fromMonth")
   @CacheLookup WebElement fromMonth;
   @FindBy(how=How.XPATH,using="fromDay")
   @CacheLookup WebElement fromDay;
   @FindBy(how=How.XPATH,using="toPort")
   @CacheLookup WebElement toPort;
   @FindBy(how=How.XPATH,using="toMonth")
   @CacheLookup WebElement toMonth;
   @FindBy(how=How.XPATH,using="toDay")
   @CacheLookup WebElement toDay;
   @FindBy(how=How.XPATH,using="airline")
   @CacheLookup WebElement airline;
   @FindBy(how=How.XPATH,using="findflights")
   @CacheLookup WebElement findflights;
   @FindBy(how=How.XPATH,using="")
   @CacheLookup WebElement serviceClass;
   public void continueWordPress(String pCount ,String fPort,String fMonth,String fDay,String tPort,String tMonth,String tDay,String aline,String serClass)
   {
	   try {
		   Thread.sleep(2000);
		   roundTrip.click();
		   Thread.sleep(2000);
		   passCount.sendKeys(pCount);
		   Thread.sleep(2000);
		   fromPort.sendKeys(fPort);
		   Thread.sleep(2000);
		   fromMonth.sendKeys(fMonth);
		   Thread.sleep(2000);
		   fromDay.sendKeys(fDay);
		   Thread.sleep(2000);
		   toPort.sendKeys(tPort);
		   Thread.sleep(2000);
		   toMonth.sendKeys(tMonth);
		   Thread.sleep(2000);
		   toDay.sendKeys(tDay);
		   Thread.sleep(2000);
		   airline.sendKeys(aline);
		   Thread.sleep(2000);
		   serviceClass.sendKeys(serClass);
		   Thread.sleep(2000);
		   findflights.click();
		   Thread.sleep(2000);
	   }
	   catch(InterruptedException e) {
		   e.printStackTrace();
	   }
   }
}
