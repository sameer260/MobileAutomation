package org.Stepdefinition;

import java.util.concurrent.TimeUnit;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;

public class ShocialPaywall extends Baseclass {
	Baseclass B=new Baseclass(); 
	@Given("^user is in gudsho app$")
    public void user_is_in_gudsho_app() throws Throwable {
		B.launchGudSho();
    }
	
    @When("^verify search field is working$")
    public void verify_search_field_is_working() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	MobileElement Shocial = (MobileElement) driver.findElementByAccessibilityId("Shocial");
		Shocial.click();
		MobileElement ShocialSearch = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget."
				+ "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget."
				+ "LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget."
				+ "FrameLayout[1]/android.widget.RelativeLayout/android.widget.ScrollView/android."
				+ "view.ViewGroup/android.widget.FrameLayout/android.widget.TextView");
		ShocialSearch.click();
      }
    
    @And("^verfiy user enter a (.+)$")
    public void verfiy_user_enter_a(String moviename) throws Throwable {
    	MobileElement Searchfield = (MobileElement) driver.findElementById("com.gudsho:id/et_search");
		Searchfield.sendKeys(moviename);
		MobileElement el12 = (MobileElement) driver.findElementById("com.gudsho:id/tv_title");
		el12.click();
		System.out.println("You are in show detail page");
		MobileElement watchlater = (MobileElement) driver.findElementById("com.gudsho:id/iv_watch_later");
		watchlater.click();
    }
    
    @Then("^verify the login popup is appearing for watchlist$")
    public void verify_the_login_popup_is_appearing_for_watchlist() throws Throwable {
    	MobileElement loginpouup = (MobileElement) driver.findElementById("com.gudsho:id/dummy_text");
    	String text = loginpouup.getText();
    	System.out.println(text);
    	System.out.println("Please login to continue");
       }
    
    @When("^verify user can able to see the trending studio$")
    public void verify_user_can_able_to_see_the_trending_studio() throws Throwable {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		MobileElement Studiostab = (MobileElement) driver.findElementByXPath("//android.widget."
				+ "FrameLayout[@content-desc=\"Studios\"]/android.widget.ImageView");
		Studiostab.click();
    }
    
    @And("^verify user can to follow the studio$")
    public void verify_user_can_to_follow_the_studio() throws Throwable {
    	MobileElement Followbtn = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget."
    			+ "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget."
    			+ "LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget."
    			+ "FrameLayout[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view."
    			+ "ViewGroup[1]/android.widget.FrameLayout/android.widget.TextView");
    	Followbtn.click();
    }
    
    @Then("^verify the login popup is appearing for following studio$")
    public void verify_the_login_popup_is_appearing_for_following_studio() throws Throwable {
    	MobileElement loginpouup = (MobileElement) driver.findElementById("com.gudsho:id/dummy_text");
    	String text = loginpouup.getText();
    	System.out.println(text);
    	System.out.println("Please login to continue");
       }
    
    @When("^verify the user able to search a (.+)$")
    public void verify_the_user_able_to_search_a(String wantedsho) throws Throwable {
    	MobileElement Shocial = (MobileElement) driver.findElementByAccessibilityId("Shocial");
		Shocial.click();
		MobileElement ShocialSearch = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget."
				+ "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget."
				+ "LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget."
				+ "FrameLayout[1]/android.widget.RelativeLayout/android.widget.ScrollView/android."
				+ "view.ViewGroup/android.widget.FrameLayout/android.widget.TextView");
		ShocialSearch.click();
		MobileElement Searchfield = (MobileElement) driver.findElementById("com.gudsho:id/et_search");
		Searchfield.sendKeys(wantedsho);
		MobileElement el12 = (MobileElement) driver.findElementById("com.gudsho:id/tv_title");
		el12.click();
		System.out.println("You are in show detail page");
	    }

    @And("^verify the user can able click guds for promos$")
    public void verify_the_user_can_able_click_guds_for_promos() throws Throwable {
    	Thread.sleep(3000);
    	MobileElement Promovideo = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget."
    			+ "LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android."
    			+ "view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup[1]/android.widget.RelativeLayout/androidx."
    			+ "viewpager.widget.ViewPager/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/androidx."
    			+ "cardview.widget.CardView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ImageView[3]");
    	Promovideo.click();
    	System.out.println("user tries to click like for promos");
    	Thread.sleep(4000);
    }
    
    @Then("^verify the login popup is appearing for gud promos$")
    public void verify_the_login_popup_is_appearing_for_gud_promos() throws Throwable {
    	MobileElement loginpouup = (MobileElement) driver.findElementById("com.gudsho:id/dummy_text");
    	String text = loginpouup.getText();
    	System.out.println(text);
    	System.out.println("Please login to continue");
    }
    
    @When("^user search (.+)$")
    public void user_search(String desiredsho) throws Throwable {
    	MobileElement Shocial = (MobileElement) driver.findElementByAccessibilityId("Shocial");
		Shocial.click();
		MobileElement shocialsearch = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget."
				+ "LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget."
				+ "FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android."
				+ "view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android."
				+ "widget.FrameLayout/android.widget.TextView");
		shocialsearch.click();
		MobileElement Searchfield = (MobileElement) driver.findElementById("com.gudsho:id/et_search");
		Searchfield.sendKeys(desiredsho);
		MobileElement el12 = (MobileElement) driver.findElementById("com.gudsho:id/tv_title");
		el12.click();
		System.out.println("You are in show detail page");
		
    	}
    
    @And("^verify user can buy the sho$")
    public void verify_user_can_buy_the_sho() throws Throwable {
    	MobileElement el1 = (MobileElement) driver.findElementById("com.gudsho:id/tv_video_price");
    	el1.click();
		
    }
    @Then("^verify the login popup is appearing for buying a movie$")
    public void verify_the_login_popup_is_appearing_for_buying_a_movie() throws Throwable {
    	MobileElement loginpouup = (MobileElement) driver.findElementById("com.gudsho:id/dummy_text");
    	String text = loginpouup.getText();
    	System.out.println(text);
    	System.out.println("Please login to continue");
    }
       }