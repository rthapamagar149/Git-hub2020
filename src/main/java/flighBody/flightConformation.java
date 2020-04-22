package flighBody;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class flightConformation {
   WebDriver driver;
   public  flightConformation(WebDriver driver){
	  this.driver=driver; 
   }
   @FindBy(how=How.XPATH,using="")
   @CacheLookup WebElement logout;
   public void LogOutPress() {
	 logout.click();  
   }
}
