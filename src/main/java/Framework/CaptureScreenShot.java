package Framework;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;




public class CaptureScreenShot {
   public CaptureScreenShot() {
	   
   }
   public static void getScreenShot(WebDriver driver,String filepath) {
	   try {
		   System.out.println("In getScreenShot method");
		   TakesScreenshot ts=(TakesScreenshot)driver;
		   System.out.println("before getScreenshotAS");
		   File source=ts.getScreenshotAs(OutputType.FILE);
		   System.out.println("After getScreenShotAS");
		  // FileUtils.copyfile(source,new File(filepath);
		   
	   }
	   catch(WebDriverException e) {
		   e.printStackTrace();
	   }
   }
   public static String getDateTimeStam() {
	   Date oDate;
	   String[] sDatePart;
	   String sDateStamp;
	   oDate=new Date();
	   System.out.println(oDate.toString());
	   sDatePart=oDate.toString().split(" ");
	   sDateStamp=sDatePart[5]+ "_" +
			      sDatePart[1]+ "_" +
			      sDatePart[2]+ "_" +
			      sDatePart[2];
	   sDateStamp=sDateStamp.replace(":", "_");
	   	System.out.println(sDateStamp);	
	   return sDateStamp;
   }
}
