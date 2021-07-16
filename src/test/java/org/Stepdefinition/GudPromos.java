package org.Stepdefinition;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;


public class GudPromos extends Baseclass{
	Baseclass B= new Baseclass();
	@Given("user is in GudSho App and logged in")
	public void user_is_in_GudSho_App_and_logged_in() throws InterruptedException, MalformedURLException {
		B.GudShologgedin();
	}

	@When("user enters {string} in flicks page search")
	public void user_enters_in_flicks_page_search(String s1) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
		el6.sendKeys(s1);
	}
	

	@When("verify user navigates to the show details page and view the latest promos")
	public void verify_user_navigates_to_the_show_details_page_and_view_the_latest_promos() {
		MobileElement Searchdrop = (MobileElement) driver.findElementById("com.gudsho:id/tv_title");
		Searchdrop.click();
		System.out.println("You are in show detail page");
		B.scrolldown();
	}

	@When("user views the promos and click like for promos")
	public void user_views_the_promos_and_click_like_for_promos() throws InterruptedException {
		MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android."
				+ "widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget."
				+ "FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup[1]/android."
				+ "widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/androidx."
				+ "recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[1]/android.view.ViewGroup/android."
				+ "widget.RelativeLayout/android.widget.ImageView[3]");
		el1.click();
		System.out.println("Promo video is playing");
		Thread.sleep(6000);
		System.out.println("user clicks like for promo");
	}
	
	@When("verify the liked promos is there in My Gud Promos")
	public void verify_the_liked_promos_is_there_in_My_Gud_Promos() throws InterruptedException {
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		B.scrolldown();
		System.out.println("Liked promos are reflecting in my gud promos");
	}

	@Given("user has to there in GudSho App")
	public void user_has_to_there_in_GudSho_App() throws MalformedURLException, InterruptedException {
		B.launchGudSho();
	}

	@When("navigate the user to login and enters the valid credentials")
	public void navigate_the_user_to_login_and_enters_the_valid_credentials() throws InterruptedException {
		B.logindetails();
	}
}