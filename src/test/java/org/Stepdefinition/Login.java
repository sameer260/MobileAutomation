package org.Stepdefinition;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Login {
	public static AndroidDriver<MobileElement> driver;

	@Given("user has to be there in GudSho app")
	public void user_has_to_be_there_in_GudSho_app() throws MalformedURLException, InterruptedException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Galaxy A70");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "10");
		caps.setCapability("appPackage", "com.gudsho");
		caps.setCapability("appActivity", "com.gudsho.SplashActivity");
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		Thread.sleep(3000);
		System.out.println("GudSho is getting launched.....");
		Thread.sleep(3000);
	}

	@When("user has to click signin in me section")
	public void user_has_to_click_signin_in_me_section() {
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		MobileElement MeBtn = (MobileElement) driver.findElementByXPath(
		"//android.widget.FrameLayout[@content-desc=\"Me\"]/android.view.ViewGroup/android.widget.TextView");
		MeBtn.click();
		MobileElement SignIn = (MobileElement) driver.findElementById("com.gudsho:id/tv_user_name");
		SignIn.click();
	}

	@When("user has to enter {string}")
	public void user_has_to_enter(String s1) {
		System.out.println("User enters phonenumber.....");
		MobileElement Phonenum = (MobileElement) driver.findElementById("com.gudsho:id/user_phone");
		Phonenum.sendKeys(s1);
	}

	@When("user has to click the get otp field")
	public void user_has_to_click_the_get_otp_field() throws InterruptedException {
		MobileElement GetOtp = (MobileElement) driver.findElementById("com.gudsho:id/get_otp");
		GetOtp.click();
		Thread.sleep(25000);
	}

	@When("verify user navigates to otp page and enters the otp")
	public void verify_user_navigates_to_otp_page_and_enters_the_otp() {
		System.out.println(("User Enters otp......"));
	}

	@Then("verify the user can able to login")
	public void verify_the_user_can_able_to_login() throws InterruptedException {
		MobileElement VfyyOtp = (MobileElement) driver.findElementById("com.gudsho:id/button_verify_otp");
		VfyyOtp.click();
		Thread.sleep(3000);
		MobileElement SignIn = (MobileElement) driver.findElementById("com.gudsho:id/tv_user_name");
		String Actual = SignIn.getText();
		Assert.assertNotEquals(Actual, "Sign In");
		System.out.println("You are logged in to GudSho");
	}

	@When("user has to click use mail id and enter the {string}")
	public void user_has_to_click_use_mail_id_and_enter_the(String s2) {
		MobileElement usemailid = (MobileElement) driver.findElementById("com.gudsho:id/mail_otp_toggle");
		usemailid.click();
		MobileElement mail = (MobileElement) driver.findElementById("com.gudsho:id/toggle_phone_email_parent_tv");
		mail.sendKeys(s2);
	}

	@When("user has to click Google logo")
	public void user_has_to_click_Google_logo() {
		MobileElement goglogo = (MobileElement) driver.findElementById("com.gudsho:id/login_google_btn");
		goglogo.click();
		MobileElement newaccount = (MobileElement) driver.findElementById("com.google.android.gms:id/add_account_chip_title");
		newaccount.click();
	}

	@When("verify user navigates to accounts page and user enters the {string} and {string}")
	public void verify_user_navigates_to_accounts_page_and_user_enters_the_and(String s3, String s4) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		MobileElement gmail = (MobileElement) driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android."
				+ "widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget."
				+ "FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget."
				+ "LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android."
				+ "view.View/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[2]/android."
				+ "view.View");
		gmail.sendKeys(s3);
		MobileElement next = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android."
				+ "widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget."
				+ "FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget."
				+ "LinearLayout/android.widget.LinearLayout/android.widget.Button");
		next.click();
		MobileElement password = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android."
				+ "widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget."
				+ "FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget."
				+ "LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android."
				+ "view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view."
				+ "View/android.view.View[2]/android.view.View");
		password.sendKeys(s4);
		MobileElement Agree = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android"
				+ ".widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget."
				+ "FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android."
				+ "widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view."
				+ "View[4]/android.view.View/android.widget.Button");
		Agree.click();
	}

	@Then("verify the user can able to login with google account")
	public void verify_the_user_can_able_to_login_with_google_account() {
		MobileElement SignIn = (MobileElement) driver.findElementById("com.gudsho:id/tv_user_name");
		String Actual = SignIn.getText();
		Assert.assertNotEquals(Actual, "Sign In");
		System.out.println("You are logged in to GudSho with gmail account");
	}
	
	@When("user has to click facebook logo")
	public void user_has_to_click_facebook_logo() {
		MobileElement fblogo = (MobileElement) driver.findElementById("com.gudsho:id/login_fb_btn");
		fblogo.click();
	}

	@When("verify user navigates to facebook login page and enters the {string} and {string}")
	public void verify_user_navigates_to_facebook_login_page_and_enters_the_and(String s5, String s6) {
		MobileElement fbid = (MobileElement) driver.findElementByAccessibilityId("Username");
		fbid.sendKeys(s5);
		MobileElement fbpass = (MobileElement) driver.findElementByAccessibilityId("Password");
		fbpass.sendKeys(s6);
		MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("Log In");
		el5.click();
	}

	@Then("verify the user can able to login with facebook account")
	public void verify_the_user_can_able_to_login_with_facebook_account() {
		MobileElement SignIn = (MobileElement) driver.findElementById("com.gudsho:id/tv_user_name");
		String Actual = SignIn.getText();
		Assert.assertNotEquals(Actual, "Sign In");
		System.out.println("You are logged in to GudSho with facebook account");
		}
	
    @And("^user has to enter mail id field and enter (.+) and (.+)$")
    public void user_has_to_enter_mail_id_field_and_enter_and(String newid, String newnumber) throws Throwable {
    	MobileElement el3 = (MobileElement) driver.findElementById("com.gudsho:id/mail_otp_toggle");
    	el3.click();
    	MobileElement el4 = (MobileElement) driver.findElementById("com.gudsho:id/toggle_phone_email_parent_tv");
    	el4.sendKeys("naveen667788@yopmail.com");
    	MobileElement el5 = (MobileElement) driver.findElementById("com.gudsho:id/get_otp");
    	el5.click();
    	MobileElement el6 = (MobileElement) driver.findElementById("com.gudsho:id/user_phone");
    	el6.sendKeys("9025481560");
    	MobileElement el7 = (MobileElement) driver.findElementById("com.gudsho:id/get_otp");
    	el7.click();
    }

    @And("^Verify the system takes the ser to login registration page and enter the valid credentails $")
    public void verify_the_system_takes_the_ser_to_login_registration_page_and_enter_the_valid_credentails() throws Throwable {
        
    }
    
    @Then("^verify the user can able to login with new credentails$")
    public void verify_the_user_can_able_to_login_with_new_credentails() throws Throwable {
    	MobileElement SignIn = (MobileElement) driver.findElementById("com.gudsho:id/tv_user_name");
		String Actual = SignIn.getText();
		Assert.assertNotEquals(Actual, "Sign In");
		System.out.println("You are logged in to GudSho with new mail id and phone number");
    }
}