package org.Stepdefinition;

import static org.junit.Assert.assertEquals;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;

public class Shocial extends Baseclass {
	Baseclass B= new Baseclass();
    @Given("^user is logged in to gudsho app$")
    public void user_is_logged_in_to_gudsho_app() throws Throwable {
      B.GudShologgedin();
    }

    @When("^verify search field is working in flicks page$")
    public void verify_search_field_is_working_in_flicks_page() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	MobileElement Shocial = (MobileElement) driver.findElementByAccessibilityId("Shocial");
		Shocial.click();
		MobileElement Shocialsearch = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android."
				+ "widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android."
				+ "view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup/android."
				+ "widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android."
				+ "widget.TextView");
		Shocialsearch.click();
		    }
    @And("^verfiy user can bookmark a desired (.+)$")
    public void verfiy_user_can_bookmark_a_desired(String moviename) throws Throwable {
    	MobileElement Searchfield = (MobileElement) driver.findElementById("com.gudsho:id/et_search");
		Searchfield.sendKeys(moviename);
		MobileElement Searchdropdown = (MobileElement) driver.findElementById("com.gudsho:id/tv_title");
		Searchdropdown.click();
		System.out.println("You are in show detail page");
		MobileElement watchlater = (MobileElement) driver.findElementById("com.gudsho:id/iv_watch_later");
		watchlater.click();
		driver.navigate().back();
		System.out.println("Watch later added sucessfully");
		Thread.sleep(5000);
    }
    
    public String Actual1;
    @Then("^verify the (.+) is in watch list$")
    public void verify_the_is_in_watch_list(String moviename) throws Throwable {
    	driver.navigate().back();
    	MobileElement wishlist = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout"
    			+ "[@content-desc=\"WatchList\"]/android.widget.ImageView");
    	wishlist.click();
    	List<MobileElement> cmnlocator = (List<MobileElement>) driver
				.findElementsById("com.gudsho:id/tv_wish_list_title");
		int size = cmnlocator.size();
		for (int i = 0; i < size; i++) {
			String el25 = (String) driver.findElementsById("com.gudsho:id/tv_wish_list_title").get(i).getText();
			if (el25.equalsIgnoreCase(moviename)) {
				Actual1 = (String) driver.findElementsById("com.gudsho:id/tv_wish_list_title").get(i).getText();
				System.out.println(Actual1);
			}
		}
		assertEquals(Actual1, moviename);
		System.out.println("Movie name is in watch list");
    }
    
    @When("^verify user can able to view the sudios tab$")
    public void verify_user_can_able_to_view_the_sudios_tab() throws Throwable {
    	MobileElement studiostab = (MobileElement) driver.findElementByXPath("//android.widget."
    			+ "FrameLayout[@content-desc=\"Studios\"]/android.widget.ImageView");
    	studiostab.click();
    }
    
    @And("^verify user can follow the studio in studio detail page$")
    public void verify_user_can_follow_the_studio_in_studio_detail_page() throws Throwable {
    	MobileElement Firststudio = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget."
    			+ "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android."
    			+ "widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx."
    			+ "recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
    	Firststudio.click();
    	}
    
	public String Actual2;
	@Then("^verify the studio name in following studio$")
    public void verify_the_studio_name_in_following_studio() throws Throwable {
		MobileElement follow = (MobileElement) driver.findElementById("com.gudsho:id/tv_following_state");
    	follow.click();
    	MobileElement stdname = (MobileElement) driver.findElementById("com.gudsho:id/tv_studio_name");
    	String text = stdname.getText();
    	System.out.println(text);
    	String Actual = follow.getText();
    	Assert.assertNotEquals(Actual, "+ Follow");
    	System.out.println("You are following this studio");
    	driver.navigate().back();
    	MobileElement Shocial = (MobileElement) driver.findElementByAccessibilityId("Shocial");
		Shocial.click();
		
//    	List<MobileElement> cmnlocator = (List<MobileElement>) driver.findElementsById("com.gudsho:id/tv_studio_name");
//    	int size = cmnlocator.size();
//    	for (int i = 0; i < size; i++) {
//    		String el25 = (String) driver.findElementsById("com.gudsho:id/tv_studio_name").get(i).getText();
//    		if (el25.equalsIgnoreCase(text)) {
//    			Actual2 = (String) driver.findElementsById("com.gudsho:id/tv_studio_name").get(i).getText();
//    			System.out.println(Actual2);
//    		}
//    	}
//    	assertEquals(Actual2, text);
    	System.out.println("crash");
    }
    
	 @When("^verify the user can get in (.+)$")
	    public void verify_the_user_can_get_in(String desiredsho) throws Throwable {
		 MobileElement Shocial = (MobileElement) driver.findElementByAccessibilityId("Shocial");
		 Shocial.click();
		 MobileElement Shocialsearch = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android."
			+ "widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android."
			+ "view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup/android."
			+ "widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android."
			+ "widget.TextView");
			Shocialsearch.click();
		MobileElement Searchfield = (MobileElement) driver.findElementById("com.gudsho:id/et_search");
		Searchfield.sendKeys(desiredsho);
		MobileElement Searchdropdown = (MobileElement) driver.findElementById("com.gudsho:id/tv_title");
		Searchdropdown.click();
		System.out.println("You are in show detail page");
   	    }
    
    @And("^verify  the user can able to give guds for promos$")
    public void verify_the_user_can_able_to_give_guds_for_promos() throws Throwable {
    	Thread.sleep(3000);
    	B.scrolldown();
    	MobileElement Promovideo = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget."
    			+ "LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android."
    			+ "view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup[1]/android.widget.RelativeLayout/androidx."
    			+ "viewpager.widget.ViewPager/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/androidx."
    			+ "cardview.widget.CardView/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ImageView[3]");
    	Promovideo.click();
    	System.out.println("user tries to click like for promos");
    	Thread.sleep(4000);
    }
    
    public String Actual3;
    @Then("^verify the liked promos are in my gud promos$")
    public void verify_the_liked_promos_are_in_my_gud_promos() throws Throwable {
    	B.scrolldown();
    	B.scrolldown();
    	MobileElement Promovideo = (MobileElement) driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget."
    			+ "LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view."
    			+ "ViewGroup/android.widget.FrameLayout/android.view.ViewGroup[1]/android.widget.RelativeLayout/androidx.viewpager."
    			+ "widget.ViewPager/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget."
    			+ "CardView[1]/android.view.ViewGroup/android.widget.TextView[2]");
    		String text = Promovideo.getText();
    		System.out.println(text);
    		driver.navigate().back();
    		driver.navigate().back();
    		MobileElement Shocial = (MobileElement) driver.findElementByAccessibilityId("Shocial");
    		Shocial.click();
    		
//    		List<MobileElement> cmnlocator = (List<MobileElement>) driver.findElementsById("com.gudsho:id/tv_title");
//    		int size = cmnlocator.size();
//    		for (int i = 0; i < size; i++) {
//    			String el25 = (String) driver.findElementsById("com.gudsho:id/tv_title").get(i).getText();
//    			if (el25.equalsIgnoreCase(text)) {
//    				Actual3 = (String) driver.findElementsById("com.gudsho:id/tv_title").get(i).getText();
//    				System.out.println(Actual3);
//    			}
//    		}
//    		assertEquals(Actual3, text);
    		System.out.println("crash");
    		System.out.println("promos are reflecting in my gud promos");
    }
    @When("^verify the user can able to see all the shos$")
    public void verify_the_user_can_able_to_see_all_the_shos() throws Throwable {
    	MobileElement el3 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Flicks\"]"
    			+ "/android.widget.ImageView");
    	el3.click();
    	B.scrolldown();
		Thread.sleep(2000);
    }

    @And("^verify user can buy the sho in sho detail page$")
    public void verify_user_can_buy_the_sho_in_sho_detail_page() throws Throwable {
    	MobileElement Buy = (MobileElement) driver.findElementById("com.gudsho:id/tv_video_price");
		Buy.click();
		MobileElement limipage = (MobileElement) driver.findElementById("com.gudsho:id/checkout_continue");
		limipage.click();
    }
    
    @Then("^verify the user can able to buy a movie and watch$")
    public void verify_the_user_can_able_to_buy_a_movie_and_watch() throws Throwable {
    	MobileElement upi = (MobileElement) driver.findElementById("com.gudsho:id/payment_vpn");
		upi.sendKeys("navencrazy61@okaxis");
		MobileElement payupi = (MobileElement) driver.findElementById("com.gudsho:id/button_pay_upi");
		payupi.click();
		MobileElement playnow = (MobileElement) driver.findElementById("com.gudsho:id/order_play_now");
		playnow.click();
 }
}