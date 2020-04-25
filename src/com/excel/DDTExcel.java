package com.excel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DDTExcel {
WebDriver driver;
 @BeforeMethod()
 public void DemoProject(){
	 System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("http://newtour.demoaut.com/");
	 
	 
 }
 @Test(enabled=true,dataProvider="testdata")
 public void DemoProjects(String username,String password) throws InterruptedException {
	 driver.findElement(By.xpath(" //input[@name='userName']")).sendKeys(username);
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	 driver.findElement(By.xpath("//input[@name='login']")).click();
	 Thread.sleep(3000);
	 Assert.assertTrue(driver.getTitle().matches("Find a Flight a Mercury Tours"), "Invalid Credentials");
	 System.out.println("Login Sucessfull"); 
 }
 @AfterMethod
 public void closeBrowser() {
	//driver.quit(); 
 }
 @DataProvider(name="testdata")
 public Object[][] testDataFeed() throws IOException{
	ReadExcelFile config=new ReadExcelFile("C:\\Users\\Rabin-PC\\workspace\\Selenium\\MyData.xlsx");
	int rows=config.getRowCount(0);
	Object[][] credentials=new Object[rows][2];
	for(int i=0;i<rows;i++) {
		credentials[i][0]=config.getData(0,i,0);
		credentials[i][i]=config.getData(0,i, 1);
	}
	return credentials;
 }
}
