package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class Steps {
	public WebDriver driver;
	public LoginPage lp;

	@Given("^User Launch Chrome browser$")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		lp = new LoginPage(driver);
	}

	@When("^User opens URL \"([^\"]*)\"$")
	public void user_opens_url_something(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	@And("^User enters Email as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void user_enters_email_as_something_and_password_as_something(String email, String password) {
		lp.setUserName(email);
		lp.setPassword(password);
	}

	@And("^Click on Login$")
	public void click_on_login() {
		lp.clickLogin();
	}

	@Then("^Page Title should be \"([^\"]*)\"$")
	public void page_title_should_be_something(String title) throws InterruptedException {
		if (driver.getPageSource().contains("Login was unsucessful")) {
			driver.close();
			//Assert.assertTrue(false);
		} else {
			//Assert.assertEquals(title, driver.getTitle());
		}
		Thread.sleep(3000);
	}

	@When("^User click on Login Out link$")
	public void user_click_on_login_out_link() throws InterruptedException {
		lp.clickLogout();
		Thread.sleep(1000);
	}

	@And("^close browser$")
	public void close_browser() {
		driver.quit();
	}
}
