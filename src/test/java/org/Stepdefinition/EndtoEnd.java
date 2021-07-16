package org.Stepdefinition;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;


public class EndtoEnd extends Baseclass {
	Baseclass B= new Baseclass();
	
	 @Given("^user is not logged in to gudsho app$")
	    public void user_is_not_logged_in_to_gudsho_app() throws Throwable {
		 B.launchGudSho();
		System.out.println("Gudsho is Getting Launched");
	    }
	 
	@When("^Verify the user can search a desired (.+)$")
    public void verify_the_user_can_search_a_desired(String shoname) throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el1 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Search\"]/android.widget.ImageView");
		el1.click();
		MobileElement el2 = (MobileElement) driver.findElementById("com.gudsho:id/et_search");
		el2.sendKeys(shoname);
    }
	
	@When("verify the user can able to see the show detail page")
	public void verify_the_user_can_able_to_see_the_show_detail_page() throws InterruptedException {
		MobileElement el2 = (MobileElement) driver.findElementById("com.gudsho:id/tv_search_title");
		el2.click();
		System.out.println("User is in sho detail page");
	}

	@When("user clicks buy options")
	public void user_clicks_buy_options() {
		MobileElement el2 = (MobileElement) driver.findElementById("com.gudsho:id/tv_coin_count");
		el2.click();
		System.out.println("Login Popup is Displayed");
	}

	@And("^Verify the login poup is shown and user can login$")
    public void verify_the_login_poup_is_shown_and_user_can_login() throws Throwable {
		MobileElement el3 = (MobileElement) driver.findElementById("com.gudsho:id/login_google_btn");
		el3.click();
		MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget."
				+ "LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget."
				+ "LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget."
				+ "LinearLayout/android.widget.TextView[2]");
		el4.click();
		System.out.println("User is Logged in To Gudsho");
    }
	
	@When("verify the user navigates to the payment detail page and enter the payment details")
	public void verify_the_user_navigates_to_the_payment_detail_page_and_enter_the_payment_details() {
		MobileElement el1 = (MobileElement) driver.findElementById("com.gudsho:id/tv_coin_count");
		el1.click();
		MobileElement Proceedtopay = (MobileElement) driver.findElementById("com.gudsho:id/divider_1");
		Proceedtopay.click();
		MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget."
				+ "FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android."
				+ "view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android."
				+ "widget.ListView/android.view.View[3]");
		el3.click();
		MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget."
				+ "FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android."
				+ "view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View/android."
				+ "view.View[1]/android.view.View[1]/android.view.View/android.view.View/android.view.View");
		el4.click();
		MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget."
				+ "FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android."
				+ "view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.Button");
		el5.click();
		MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget."
				+ "FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[6]/android.widget.Button[1]");
		el6.click();
		System.out.println("Payment Validation is complete");
	}

	@Then("After the payment verify the movie is getting played")
	public void after_the_payment_verify_the_movie_is_getting_played() {
		MobileElement el1 = (MobileElement) driver.findElementById("com.gudsho:id/order_play_now");
		el1.click();
	}
}