package org.Stepdefinition;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;

public class Studiofollow extends Baseclass {
	Baseclass B=new Baseclass();
	@Given("user is logged in to gudsho with valid credentils")
	public void user_is_logged_in_to_gudsho_with_valid_credentils() throws InterruptedException, MalformedURLException {
		B.GudShologgedin();
	}

	@When("^user is in the search tab$")
    public void user_is_in_the_search_tab() throws Throwable {
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
	}
	
	@And("^user enters the (.+)$")
    public void user_enters_the(String wantedstudioname) throws Throwable {
		MobileElement el6 = (MobileElement) driver.findElementById("com.gudsho:id/et_search");
		el6.sendKeys(wantedstudioname);
		MobileElement el1 = (MobileElement) driver.findElementById("com.gudsho:id/tv_title");
		el1.click();
		System.out.println("studio detail page");   
	    }
	
	@When("verify the user navigates to the studio detail page and user clicks follow button")
	public void verify_the_user_navigates_to_the_studio_detail_page_and_user_clicks_follow_button() {
		MobileElement follow = (MobileElement) driver.findElementById("com.gudsho:id/cv_following_state");
		follow.click();
	}

	@When("verify the follow should be changed Following")
	public void verify_the_follow_should_be_changed_Following() {
		MobileElement follow = (MobileElement) driver.findElementById("com.gudsho:id/tv_following_state");
		String Actual = follow.getText();
		Assert.assertNotEquals(Actual, "+ Follow");
		System.out.println("You are following this studio");

	}
	public String Actual;
	@Then("^verify the (.+) in Shocial section$")
    public void verify_the_in_shocial_section(String wantedstudioname) throws Throwable {
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		B.scrolldown();
		MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget."
				+ "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget."
				+ "LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget."
				+ "FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup/android.widget."
				+ "RelativeLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx."
				+ "recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView");
		el1.click();
//		List <MobileElement> cmnlocator =(List<MobileElement>) driver.findElementsById("com.gudsho:id/tv_title");
//		int size=cmnlocator.size();
//		for (int i = 0; i < size; i++) {
//			String el25 = (String)driver.findElementsById("com.gudsho:id/tv_title").get(i).getText();
//		if (el25.equalsIgnoreCase(wantedstudioname)) {
//			Actual = (String)driver.findElementsById("com.gudsho:id/tv_title").get(i).getText();
//			System.out.println(Actual);
//		}
//		}
//		assertEquals(Actual, wantedstudioname);
//	   System.out.println("Movie name is in watch list");
    }
	
	 @Given("user is in the gudsho app")
	public void user_is_in_the_gudsho_app() throws MalformedURLException, InterruptedException {
		B.launchGudSho();
		}

	@When("verify the login popup appears and user enters the valid credentials")
	public void verify_the_login_popup_appears_and_user_enters_the_valid_credentials() throws InterruptedException {
		B.logindetails();
		MobileElement follow = (MobileElement) driver.findElementById("com.gudsho:id/cv_following_state");
		follow.click();
	}
	
	@And("^Trying to enter the invalid (.+) in search bar$")
    public void trying_to_enter_the_invalid_in_search_bar(String studioname) throws Throwable {
		 MobileElement el6 = (MobileElement) driver.findElementById("com.gudsho:id/et_search");
			el6.sendKeys(studioname);
	       
	    }

	@Then("^verify the no search result in studio search$")
    public void verify_the_no_search_result_in_studio_search() throws Throwable {
		Thread.sleep(2000);
		MobileElement empty = (MobileElement) driver.findElementById("com.gudsho:id/tv_empty_search");
		String text = empty.getText();
		System.out.println(text);
		System.out.println("No Search Result Found");
		
	}
	@When("user is in the studios tab")
	public void user_is_in_the_studios_tab() throws InterruptedException {
		Thread.sleep(2000);
		MobileElement el2 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout"
				+ "[@content-desc=\"Studios\"]/android.view.ViewGroup/android.widget.TextView");
		el2.click();
	}
	
	@And("^verify the studio name in the studio tab$")
    public void verify_the_studio_name_in_the_studio_tab() throws Throwable {
		System.out.println("User is in studio section");
    }
	
    @Then("^print the studios name$")
    public void print_the_studios_name() throws Throwable {
    	System.out.println("List of Studio name's in Studio tab");
		List <MobileElement> cmnlocator =(List<MobileElement>) driver.findElementsById("com.gudsho:id/tv_studio_name");
		int size=cmnlocator.size();
		for (int i = 0; i < size; i++) {
			String el25 = (String)driver.findElementsById("com.gudsho:id/tv_studio_name").get(i).getText();
			System.out.println(el25);
		}
    }
    
    @And("^verify the studio name in the studio section$")
    public void verify_the_studio_name_in_the_studio_section() throws Throwable {
    	System.out.println("User is in studio section");
    	System.out.println("List of Studio name's in Studio tab: ");
		List <MobileElement> cmnlocator =(List<MobileElement>) driver.findElementsById("com.gudsho:id/tv_studio_name");
		int size=cmnlocator.size();
		for (int i = 0; i < size; i++) {
			String el25 = (String)driver.findElementsById("com.gudsho:id/tv_studio_name").get(i).getText();
			System.out.println(el25);
		}
    }
    
    @And("^verify the user can able to Follow the (.+) in studio tab$")
    public void verify_the_user_can_able_to_follow_the_in_studio_tab(String wantedstudioname) throws Throwable {
    	   List <MobileElement> cmnlocator =(List<MobileElement>) driver.findElementsById("com.gudsho:id/tv_studio_name");
      		int size=cmnlocator.size();
      		for (int i = 0; i < size; i++) {
      			String el25 = (String)driver.findElementsById("com.gudsho:id/tv_studio_name").get(i).getText();
      			if (el25.equalsIgnoreCase(wantedstudioname)) {
      				Actual = (String)driver.findElementsById("com.gudsho:id/tv_studio_name").get(i).getText();
      				MobileElement followloc = (MobileElement)driver.findElementsById("com.gudsho:id/tv_following_info").get(i);
      				followloc.click();
      				break;
      			}
      		}
    	    }
       
       @Then("^verify the (.+) in me section following studios$")
       public void verify_the_in_me_section_following_studios(String wantedstudioname) throws Throwable {
    	   MobileElement el2 = (MobileElement) driver.findElementByXPath("//android.widget."
    	   		+ "FrameLayout[@content-desc=\"Me\"]/android.view.ViewGroup/android.widget.TextView");
    	   el2.click();
    	   MobileElement el3 = (MobileElement) driver.findElementById("com.gudsho:id/tv_following_studio");
    	   el3.click();
    	   List <MobileElement> cmnlocator =(List<MobileElement>) driver.findElementsById("com.gudsho:id/tv_studio_name");
   		int size=cmnlocator.size();
   		for (int i = 0; i < size; i++) {
   			String el25 = (String)driver.findElementsById("com.gudsho:id/tv_studio_name").get(i).getText();
   		if (el25.equalsIgnoreCase(wantedstudioname)) {
   			Actual = (String)driver.findElementsById("com.gudsho:id/tv_studio_name").get(i).getText();
   		}
   		}
   	 System.out.println("The studio which you followed in studio tab is reflecting in following studio");
   	 System.out.println("And the name of the studio is: "+wantedstudioname);
   		assertEquals(Actual, wantedstudioname);
   	   }
       	}