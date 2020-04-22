package TestPackage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Framework.BrowserFactory;
import Framework.CaptureScreenShot;
import flighBody.BookFlightPage;
import flighBody.LoginPage;
import flighBody.flightConformation;
import flighBody.flightFinder;
import flighBody.selectFlightPage;

public class TestCaseClass extends HelperClass {
  
	  public TestCaseClass() {
		  
	  }
	  
  @Test
  public void returnTicket() {
	  try {
	  System.out.println("In returnTicket");
	  driver.get("http://newtours.demoaut.com/");
	  LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
	  loginPage.loginWordPress("mercury" , "mercury");
	  flightFinder FlightFinder=PageFactory.initElements(driver, flightFinder.class);
	  FlightFinder.continueWordPress("1", "German", "July", "12", "Norway", "May", "16", "AmericanAirlies100_T", "Business Class");
	  selectFlightPage selectflightpage=PageFactory.initElements(driver, selectFlightPage.class);
	  selectflightpage.departAirlinesPress("BlueSkiesAirlies100_D");
	  selectflightpage.returnAirlinePress("BlueSkiesAirlies200_D");
	  selectflightpage.continu();
	  BookFlightPage bookflightpage=PageFactory.initElements(driver, BookFlightPage.class);
	  bookflightpage.continueWordPress("Rabin", "Thapa", "Hindu", "MasterCard", "123456789", "12", "2020", "Rabin", "Thapa", "Magar");
	  flightConformation flightconformation=PageFactory.initElements(driver, flightConformation.class);
	  String bookingDetailsFile=System.getProperty("user.dir")+"\\"+"ScreenShots\\FlightConformation"+CaptureScreenShot.getDateTimeStam()+".png";
	  try {
		  CaptureScreenShot.getScreenShot(BrowserFactory.getDriver(), bookingDetailsFile); 
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  flightconformation.LogOutPress();  
  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
  }
}
