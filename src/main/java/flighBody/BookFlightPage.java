package flighBody;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BookFlightPage {
WebDriver driver;
public BookFlightPage(WebDriver driver) {
	this.driver=driver;
  }
  @FindBy(how=How.NAME,using="passfirst0")
  @CacheLookup WebElement firstname;
  @FindBy(how=How.NAME,using="passlast0")
  @CacheLookup WebElement lastName;
  @FindBy(how=How.NAME,using="pass.0.meal")
  @CacheLookup WebElement meal;
  @FindBy(how=How.NAME,using="creditcard")
  @CacheLookup WebElement cardtype;
  @FindBy(how=How.NAME,using="creditNumber")
  @CacheLookup WebElement cardNumber;
  @FindBy(how=How.NAME,using="cc_exp_dt_mn")
  @CacheLookup WebElement expMonth;
  @FindBy(how=How.NAME,using="cc_exp_dt_yr")
  @CacheLookup WebElement expYears;
  @FindBy(how=How.NAME,using="cc_first-name")
  @CacheLookup WebElement cardFirstName;
  @FindBy(how=How.NAME,using="cc_mid-name")
  @CacheLookup WebElement cardmidName;
  @FindBy(how=How.NAME,using="cc_last-name")
  @CacheLookup WebElement cardlastName;
  @FindBy(how=How.NAME,using="")
  @CacheLookup WebElement purchase;
  public void continueWordPress(String fname ,String lname,String meal1,String ctype,String cnumber,String emonth,String eyear,String cfirstname,String cmidname,String clastname)
  {
	   try {
		   Thread.sleep(2000);
		   firstname.sendKeys(fname);
		   Thread.sleep(2000);
		   lastName.sendKeys(lname);
		   Thread.sleep(2000);
		   meal.sendKeys(meal1);
		   Thread.sleep(2000);
		   cardtype.sendKeys(ctype);
		   Thread.sleep(2000);
		   cardNumber.sendKeys(cnumber);
		   Thread.sleep(2000);
		   expMonth.sendKeys(emonth);
		   Thread.sleep(2000);
		   expYears.sendKeys(eyear);
		   Thread.sleep(2000);
		   cardFirstName.sendKeys(cfirstname);
		   Thread.sleep(2000);
		   cardmidName.sendKeys(cmidname);
		   Thread.sleep(2000);
		   cardlastName.sendKeys(clastname);
		   Thread.sleep(2000);
		   purchase.click();
		   Thread.sleep(2000);
	   }
	   catch(InterruptedException e) {
		   e.printStackTrace();
	   }
  }
  
}
