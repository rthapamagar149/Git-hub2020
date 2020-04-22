package flighBody;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class selectFlightPage {
	WebDriver driver;
	public selectFlightPage(WebDriver driver) {
		this.driver=driver;
	}
    @FindBy(how=How.XPATH,using="")
    @CacheLookup WebElement BlueSkiesAirlies100_D;
    @FindBy(how=How.XPATH,using="")
    @CacheLookup WebElement BlueSkiesAirlies200_D;
    @FindBy(how=How.XPATH,using="")
    @CacheLookup WebElement BlueSkiesAirlies300_D;
    @FindBy(how=How.XPATH,using="")
    @CacheLookup WebElement AmericanAirlies100_D;
    @FindBy(how=How.XPATH,using="")
    @CacheLookup WebElement BlueSkiesAirlies100_T;
    @FindBy(how=How.XPATH,using="")
    @CacheLookup WebElement BlueSkiesAirlies200_T;
    @FindBy(how=How.XPATH,using="")
    @CacheLookup WebElement BlueSkiesAirlies300_T;
    @FindBy(how=How.XPATH,using="")
    @CacheLookup WebElement AmericanAirlies100_T;
    @FindBy(how=How.XPATH,using="")
    @CacheLookup WebElement con;
    public void  departAirlinesPress(String departAirline) {
    	try {
    		if(departAirline.equalsIgnoreCase("Blue Skies Airlies 100_D")) {
    			BlueSkiesAirlies100_D.click();
    			Thread.sleep(2000);
    		}
    		if(departAirline.equalsIgnoreCase("Blue Skies Airlies 200_D")) {
    			BlueSkiesAirlies200_D.click();
    			Thread.sleep(2000);
    		}
    		if(departAirline.equalsIgnoreCase("Blue Skies Airlies 300_D")) {
    			BlueSkiesAirlies300_D.click();
    			Thread.sleep(2000);
    		}
    		if(departAirline.equalsIgnoreCase("American Airlies 100_D")) {
    			AmericanAirlies100_D.click();
    			Thread.sleep(2000);
    		}
    	}
    	 catch(InterruptedException e) {
  		   e.printStackTrace();
    	 }
    }
    public void returnAirlinePress(String returnAirline) {
    	try {
    		if(returnAirline.equalsIgnoreCase("Blue Skies Airlies 100_T")) {
    			BlueSkiesAirlies100_T.click();
    			Thread.sleep(2000);
    		}
    		if(returnAirline.equalsIgnoreCase("Blue Skies Airlies 200_T")) {
    			BlueSkiesAirlies200_T.click();
    			Thread.sleep(2000);
    		}
    		if(returnAirline.equalsIgnoreCase("Blue Skies Airlies 300_T")) {
    			BlueSkiesAirlies300_T.click();
    			Thread.sleep(2000);
    		}
    		if(returnAirline.equalsIgnoreCase("American Airlies 100_T")) {
    			AmericanAirlies100_T.click();
    			Thread.sleep(2000);
    		}
    		
    	}
   	 catch(InterruptedException e) {
		   e.printStackTrace();
  	 }
    }
    public void continu() {
    	con.click();
    	try {
    		Thread.sleep(2000);
    	}
    	catch(InterruptedException e) {
    		e.printStackTrace();
    	}
    }
}
    
