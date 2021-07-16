package org.Stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class HomepageSmoke {
	public static AndroidDriver<MobileElement> driver;
	Baseclass B= new Baseclass();
      @Given("^User in Gudsho as a logged in user$")
	    public void user_in_gudsho_as_a_logged_in_user() throws Throwable {
    	  B.launchGudSho();
    	  System.out.println("Gudsho is getting Launched");
	    }

	    @When("^Verify the user can able to see the banner$")
	    public void verify_the_user_can_able_to_see_the_banner() throws Throwable {
	    	System.out.println("User is in Homepage");
	    	MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget."
	    			+ "LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx."
	    			+ "drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view."
	    			+ "ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view."
	    			+ "ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.RelativeLayout[1]/android.view.View[2]");
	    	  el1.click();
	    }
	    
	    
	    @And("^Verify the user can able to click on the banner$")
	    public void verify_the_user_can_able_to_click_on_the_banner() throws Throwable {
	    	System.out.println("User clicks on the Banner");	
	    	}


	    @Then("^Verify the app takes the user to the sho detail page$")
	    public void verify_the_app_takes_the_user_to_the_sho_detail_page() throws Throwable {
	        System.out.println("User is in sho detail page");
	    }

	    
	    @When("^Verify the user can able to view the promo contents$")
	    public void verify_the_user_can_able_to_view_the_promo_contents() throws Throwable {
	    	MobileElement el2 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Search\"]/android.view.ViewGroup/android.widget.TextView");
	    	el2.click();
	    	MobileElement el3 = (MobileElement) driver.findElementById("com.gudsho:id/et_search");
	    	el3.sendKeys("Aadukalam");
	    	MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup");
	    	el4.click();
	    	MobileElement el5 = (MobileElement) driver.findElementById("com.gudsho:id/tv_coin_count");
	    	el5.click();
	    	MobileElement el6 = (MobileElement) driver.findElementById("com.gudsho:id/tv_coin_count");
	    	el6.click();
	    	MobileElement el7 = (MobileElement) driver.findElementById("com.gudsho:id/login_google_btn");
	    	el7.click();
	    	MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[1]");
	    	el8.click();
	    	MobileElement el9 = (MobileElement) driver.findElementById("com.gudsho:id/tv_coin_count");
	    	el9.click();
	    	MobileElement el10 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ImageView[2]");
	    	el10.click();
	    	MobileElement el11 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ImageView[3]");
	    	el11.click();
	    	MobileElement el12 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.ListView/android.view.View[1]");
	    	el12.click();
	    	MobileElement el13 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.ListView[2]/android.view.View[3]");
	    	el13.click();
	    	MobileElement el14 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View");
	    	el14.click();
	    	MobileElement el15 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View");
	    	el15.click();
	    	MobileElement el16 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View/android.view.View");
	    	el16.click();
	    	MobileElement el17 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");
	    	el17.click();
	    }

	    @Then("^Verify the app takes the user to player and promo is getting played$")
	    public void verify_the_app_takes_the_user_to_player_and_promo_is_getting_played() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^Verify the user can able to click on the promo$")
	    public void verify_the_user_can_able_to_click_on_the_promo() throws Throwable {
	        throw new PendingException();
	    }
	    
	}

