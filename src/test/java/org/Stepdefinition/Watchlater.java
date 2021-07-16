package org.Stepdefinition;

import static org.junit.Assert.assertEquals;
import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;

public class Watchlater extends Baseclass{
	Baseclass B= new Baseclass();
	@Given("user is logged in to gudsho with valid credentials")
	public void user_is_logged_in_to_gudsho_with_valid_credentials() throws MalformedURLException, InterruptedException{
		B.GudShologgedin();
	}
	
	 @When("^verify the user can enter a (.+) in search box$")
	    public void verify_the_user_can_enter_a_in_search_box(String wantedmoviename) throws Throwable {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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
		el6.sendKeys(wantedmoviename);
	}
	
	@When("verify the user navigates to the show detail page")
	public void verify_the_user_navigates_to_the_show_detail_page() {
		MobileElement Searchdrop = (MobileElement) driver.findElementById("com.gudsho:id/tv_title");
		Searchdrop.click();
		System.out.println("You are in show detail page");
	}

	@When("user bookmark the movie")
	public void user_bookmark_the_movie() {
		MobileElement el1 = (MobileElement) driver.findElementById("com.gudsho:id/iv_watch_later");
		el1.click();
		System.out.println("Watchlater added sucessfully");
	}
	
	@And("^user click the my watch list$")
    public void user_click_the_my_watch_list() throws Throwable {
		Thread.sleep(1000);
    	driver.navigate().back();
    	Thread.sleep(1000);
    	driver.navigate().back();
		MobileElement el1 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc="
				+ "\"WatchList\"]/android.view.ViewGroup/android.widget.TextView");
		el1.click();
	}
	
	public String Actual;
	 @Then("^verify the (.+) is in the watch list$")
	    public void verify_the_is_in_the_watch_list(String wantedmoviename) throws Throwable {
		List <MobileElement> cmnlocator =(List<MobileElement>) driver.findElementsById("com.gudsho:id/tv_wish_list_title");
		int size=cmnlocator.size();
		for (int i = 0; i < size; i++) {
			String el25 = (String)driver.findElementsById("com.gudsho:id/tv_wish_list_title").get(i).getText();
		if (el25.equalsIgnoreCase(wantedmoviename)) {
			Actual = (String)driver.findElementsById("com.gudsho:id/tv_wish_list_title").get(i).getText();
			System.out.println(Actual);
		}
		}
		assertEquals(Actual, wantedmoviename);
	   System.out.println("Movie name is in watch list");
	   }
	 
	 @And("^verify the user can able to click edit option on my watch history$")
	    public void verify_the_user_can_able_to_click_edit_option_on_my_watch_history() throws Throwable {
		 MobileElement el1 = (MobileElement) driver.findElementById("com.gudsho:id/edit_watchlist");
		 el1.click();
		 
	    }
	 
	 @Then("^verify the user can able to delete the (.+) from the watch list$")
	    public void verify_the_user_can_able_to_delete_the_from_the_watch_list(String wantedmoviename) throws Throwable {
	    	List <MobileElement> cmnlocator =(List<MobileElement>) driver.findElementsById("com.gudsho:id/tv_wish_list_title");
			int size=cmnlocator.size();
			for (int i = 0; i < size; i++) {
			String el25 = (String)driver.findElementsById("com.gudsho:id/tv_wish_list_title").get(i).getText();
			System.out.println(el25);
			if (el25.equalsIgnoreCase(wantedmoviename)) {
			Actual = (String)driver.findElementsById("com.gudsho:id/tv_wish_list_title").get(i).getText();
			MobileElement el2 = (MobileElement) driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget."
					+ "LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view."
					+ "ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android."
					+ "view.ViewGroup[1]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.ImageView").get(i);
				el2.click();
			MobileElement el3 = (MobileElement) driver.findElementById("android:id/button1");
			el3.click();
			System.out.println("The movie name which you have unfollowed: " +wantedmoviename);
					break;
				}
				}
				}
}