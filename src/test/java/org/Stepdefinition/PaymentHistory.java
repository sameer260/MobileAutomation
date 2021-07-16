package org.Stepdefinition;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;

public class PaymentHistory extends Baseclass {
       Baseclass B=new Baseclass();
	  @Given("^user is in gudsho with valid credentials$")
	    public void user_is_in_gudsho_with_valid_credentials() throws Throwable {
		  B.GudShologgedin();
	    }

	  @When("^(.+) for payments history scenario$")
	    public void for_payments_history_scenario(String shoname) throws Throwable {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			MobileElement Shocial = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc="
					+ "\"SHOCIAL\"]/android.view.ViewGroup/android.widget.TextView");
			Shocial.click();
			try {
				MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget."
						+ "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget."
						+ "LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget."
						+ "FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup/android.widget."
						+ "FrameLayout/android.widget.TextView");
				el1.click();
			} catch (Exception e) {
				MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget."
						+ "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget."
						+ "LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget."
						+ "FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup/android.widget."
						+ "LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.widget."
						+ "FrameLayout/android.widget.TextView");
				el2.click();
			}
			MobileElement el6 = (MobileElement) driver.findElementById("com.gudsho:id/et_search");
			el6.sendKeys(shoname);
	    }
	  
	    @And("^user is in the show detail page$")
	    public void user_is_in_the_show_detail_page() throws Throwable {
	    	MobileElement Searchdrop = (MobileElement) driver.findElementById("com.gudsho:id/tv_title");
			Searchdrop.click();
			System.out.println("You are in show detail page");
	      
	    }

	    @And("^user buys a movie$")
	    public void user_buys_a_movie() throws Throwable {
	    	MobileElement buy = (MobileElement) driver.findElementById("com.gudsho:id/tv_video_price");
	    	buy.click();
	    	MobileElement limipage = (MobileElement) driver.findElementById("com.gudsho:id/checkout_continue");
	    	limipage.click();
	    }

	    @And("^user navigates to the payment page and enter the details$")
	    public void user_navigates_to_the_payment_page_and_enter_the_details() throws Throwable {
	    	MobileElement card = (MobileElement) driver.findElementByXPath("//android.widget.LinearLayout"
	    			+ "[@content-desc=\"Debit/Credit Card\"]/android.widget.TextView");
	    	card.click();
	    	MobileElement cardnumber = (MobileElement) driver.findElementById("com.gudsho:id/card_number");
	    	cardnumber.sendKeys("4111111111111111");
	    	MobileElement expdate = (MobileElement) driver.findElementById("com.gudsho:id/expiry_date");
	    	expdate.sendKeys("01");
	    	MobileElement expyear = (MobileElement) driver.findElementById("com.gudsho:id/expiry_year");
	    	expyear.sendKeys("25");
	    	MobileElement cvv = (MobileElement) driver.findElementById("com.gudsho:id/cvv");
	    	cvv.sendKeys("123");
	    	MobileElement paycontinue = (MobileElement) driver.findElementById("com.gudsho:id/payment_continue");
	    	paycontinue.click();
	    	MobileElement playnow = (MobileElement) driver.findElementById("com.gudsho:id/order_play_now");
	    	playnow.click();
	    	
	    }

	    @And("^movie is getting played$")
	    public void movie_is_getting_played() throws Throwable {
	    	Thread.sleep(3000);
	    	System.out.println("Movie is getting played");
	   }
	    
	    public String Actual;
	    @Then("^verify the played (.+) is in payment history$")
	    public void verify_the_played_is_in_payment_history(String shoname) throws Throwable {
	    	Thread.sleep(1000);
	    	driver.navigate().back();
	    	Thread.sleep(1000);
	    	driver.navigate().back();
	    	Thread.sleep(1000);
	    	driver.navigate().back();
	    	MobileElement el2 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout"
	    			+ "[@content-desc=\"Me\"]/android.view.ViewGroup/android.widget.TextView");
	    	el2.click();
	    	MobileElement el3 = (MobileElement) driver.findElementById("com.gudsho:id/tv_transaction_history");
	    	el3.click();
	    	List <MobileElement> cmnlocator =(List<MobileElement>) driver.findElementsById("com.gudsho:id/tv_title");
			int size=cmnlocator.size();
			for (int i = 0; i < size; i++) {
				String el25 = (String)driver.findElementsById("com.gudsho:id/tv_title").get(i).getText();
			if (el25.equalsIgnoreCase(shoname)) {
				Actual = (String)driver.findElementsById("com.gudsho:id/tv_title").get(i).getText();
				System.out.println(Actual);
			}
			}
			assertEquals(Actual, shoname);
		   System.out.println("Movie name is in payment history");
	    }}