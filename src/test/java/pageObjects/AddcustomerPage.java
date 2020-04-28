package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddcustomerPage {
	 public WebDriver  driver;
	    public AddcustomerPage(WebDriver  rdriver) {
	    	driver=rdriver;
	    	PageFactory.initElements(rdriver, this);
	    }
	   By linkCustomers_menu=By.xpath("//a[@href='#']//span[contains(text(),'Customers')]") ;
	   By  linkCustomers_menuitem=By.xpath("//span[@class='menu-item-title'][contains(text(),'Customers')] ");
	   By btnAddnew=By.xpath("//a[@class='btn bg-blue']");
	   By txtEmail=By.xpath("//input[@id='Email']");
	   By txtPassword=By.xpath("//input[@id='Password']");
	   By txtFirstName=By.xpath(" //input[@id='FirstName']");
	   By txtLastName=By.xpath("//input[@id='LastName']");
	   
	   By rdMaleGender=By.xpath("//input[@id='Gender_Male']");
	   By rdFemaleGender=By.xpath("//input[@id='Gender_Female']");
	   By txtCustomerRoles=By.xpath(" //div[@class='k-multiselect-wrap k-floatwrap']");
	   By lstitemsAdminstration=By.xpath("//li[@role='option'][contains(text(),'Administrators')] ");   
	   By lstitemRegistered=By.xpath("//li[@role='option'][contains(text(),'Registered')]");
	   By lstGuests=By.xpath("//li[@role='option'][contains(text(),'Guests')] ");
	   By dropofVender=By.xpath("//select[@id='VendorId']");
	   
	   By txtDob=By.xpath(" //input[@id='DateOfBirth']");
	   By txtCompanyName=By.xpath("//input[@id='Company']");
	   By txtAdminContent=By.xpath("//textarea[@id='AdminComment']");
	   By btnSave=By.xpath("//button[@name='save']");
	   
	   //Action Method
	   public void clickOnCustomerMenu() {
		  driver.findElement(linkCustomers_menu).click();
	   }
	   public void clickOnCustomerMenuItem() {
           driver.findElement(linkCustomers_menuitem).click();
	   }
	   public void clickOnAddNew() {
		   driver.findElement(btnAddnew).click();
	   }
	   public void setEmail(String email) {
		   driver.findElement(txtEmail).sendKeys(email);
	   }
	   public void setPassword(String password) {
		   driver.findElement(txtPassword).sendKeys(password);
	   }
	   public void setFirstName() {
		   driver.findElement(txtFirstName).click();
	   }
	   public void setLastName() {
		   driver.findElement(txtLastName).click();
	   }
	   public void setCustomerRoles(String role) throws InterruptedException {
		   if(!role.equals("Venders")) {
			   driver.findElement(By.xpath(""));
		   }
		   driver.findElement(txtCustomerRoles).click();
		   WebElement listitem;
		   Thread.sleep(3000);
		   if(role.equals("Administrators")) {
			   listitem=driver.findElement(lstitemsAdminstration);
		   }
		   else if(role.equals("Guests")) {
			   listitem=driver.findElement(lstGuests);
		   }
		   else if(role.equals("Registered")) {
			   listitem=driver.findElement(lstitemRegistered);
		   }
		   else if(role.equals("Vendors")) {
			   listitem=driver.findElement(dropofVender);
		   }
		   else
		   {
			   listitem=driver.findElement(lstGuests);
		   }
		   listitem.click();
		   //type name = new type();Thread.sleep(3000);
		    JavascriptExecutor js=(JavascriptExecutor)driver;
		    js.executeScript("arguments[0].click();", listitem);
	   }
	   
	   public void setManagerofVendor(String value) {
		   Select drp=new Select(driver.findElement(dropofVender));
		   drp.selectByVisibleText(value);
	   }
	   public void setGender(String gender) {
		   if(gender.equals("Male")) {
		   driver.findElement(rdMaleGender);
		   }
		   else if(gender.equals("Female")) {
			   driver.findElement(rdFemaleGender);
		   }
		   else {
			   driver.findElement(rdMaleGender).click();
		   }
	   }
	   public void setcompanyName(String comname) {
		   driver.findElement(txtCompanyName).sendKeys(comname);
		  
	   }
	   public void setDob(String dob) {
		   driver.findElement(txtDob).sendKeys(dob);
	   }
	   public void setAdminContent(String content) {
		   driver.findElement(txtAdminContent).sendKeys(content);
	   }
	   public void clickOnSave() {
		   driver.findElement(btnSave).click();
	   }
}
