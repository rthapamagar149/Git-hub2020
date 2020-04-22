package flighBody;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
   WebDriver driver;
   public LoginPage(WebDriver driver) {
	   this.driver=driver;
   }
   @FindBy(how=How.NAME,using="userName")
   @CacheLookup WebElement username;
   @FindBy(how=How.NAME,using="password")
   @CacheLookup WebElement password;
   @FindBy(how=How.NAME,using="login")
   @CacheLookup WebElement login;
   public void loginWordPress(String use,String pass) {
	   try {
		   username.sendKeys(use); 
		   Thread.sleep(3000);
		   password.sendKeys(pass); 
	   }
	   catch(InterruptedException e) {
		   e.printStackTrace();
	   }
	   
   }
}
