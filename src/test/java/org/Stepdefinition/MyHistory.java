package org.Stepdefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;

public class MyHistory extends Baseclass {
	Baseclass B= new Baseclass();
	 @Given("^user is in to gudsho with valid credentials$")
	    public void user_is_in_to_gudsho_with_valid_credentials() throws Throwable {
		 B.GudShologgedin();
	    }

	 @When("^search (.+)$")
	    public void search(String moviename) throws Throwable {
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
			el6.sendKeys(moviename);
	   
	    }
	    @And("^verify the user can see the show detail page$")
	    public void verify_the_user_can_see_the_show_detail_page() throws Throwable {
	    	MobileElement Searchdrop = (MobileElement) driver.findElementById("com.gudsho:id/tv_title");
			Searchdrop.click();
			System.out.println("You are in show detail page");
	
	    }

	    @And("^verify the user can play the movie$")
	    public void verify_the_user_can_play_the_movie() throws Throwable {
			MobileElement play = (MobileElement) driver.findElementById("com.gudsho:id/movie_price");
			play.click();
			Thread.sleep(5000);
	    }

	    @And("^verify the movie is getting played$")
	    public void verify_the_movie_is_getting_played() throws Throwable {
	    	System.out.println("Movie is getting played....");
	    }
	    
	    public String Actual;
	    @Then("^verify the played (.+) is in my history$")
	    public void verify_the_played_is_in_my_history(String moviename) throws Throwable {
	    	driver.navigate().back();
	    	driver.navigate().back();
	    	MobileElement el3 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Me\"]/android.view.ViewGroup/android.widget.TextView");
	    	el3.click();
	    	MobileElement el4 = (MobileElement) driver.findElementById("com.gudsho:id/tv_my_history");
	    	el4.click();
	    	List <MobileElement> cmnlocator =(List<MobileElement>) driver.findElementsById("com.gudsho:id/tv_history_title");
			int size=cmnlocator.size();
			for (int i = 0; i < size; i++) {
				String el25 = (String)driver.findElementsById("com.gudsho:id/tv_history_title").get(i).getText();
				System.out.println(el25);
			if (el25.equalsIgnoreCase(moviename)) {
				Actual = (String)driver.findElementsById("com.gudsho:id/tv_history_title").get(i).getText();
				System.out.println(Actual);
		}
			}		
		   System.out.println("Movie name is in my history ");
		   }
	    
	    @When("^user is in me section$")
	    public void user_is_in_me_section() throws Throwable {
	    	B.Mepage();
	    }

	    @And("^user enters my history$")
	    public void user_enters_my_history() throws Throwable {
	    	MobileElement el1 = (MobileElement) driver.findElementById("com.gudsho:id/tv_my_history");
	    	el1.click();
	    }

	    @And("^verify the movie names$")
	    public void verify_the_movie_names() throws Throwable {
	    	System.out.println("List of Sho's name's in My History: ");
			List <MobileElement> cmnlocator =(List<MobileElement>) driver.findElementsById("com.gudsho:id/tv_history_title");
			int size=cmnlocator.size();
			for (int i = 0; i < size; i++) {
				String el25 = (String)driver.findElementsById("com.gudsho:id/tv_history_title").get(i).getText();
				System.out.println(el25);
	    	
	    }
	    }
	    @And("^verify the user can able to clear all my history$")
	    public void verify_the_user_can_able_to_clear_all_my_history() throws Throwable {
	    	MobileElement el2 = (MobileElement) driver.findElementById("com.gudsho:id/tv_delete_all");
	    	el2.click();
	    	MobileElement el3 = (MobileElement) driver.findElementById("android:id/button1");
	    	el3.click();
	        
	    }
	    @Then("^verify the toast messege in my history$")
	    public void verify_the_toast_messege_in_my_history() throws Throwable {
	    	MobileElement el4 = (MobileElement) driver.findElementById("com.gudsho:id/empty_view");
	    	String text = el4.getText();
	    	System.out.println(text);
	    }
	    
	    @And("^verify the user can able to see sho names in my history$")
	    public void verify_the_user_can_able_to_see_sho_names_in_my_history() throws Throwable {
	    	System.out.println("User is in My History");
	    	System.out.println("List of Sho name's in My History: ");
			List <MobileElement> cmnlocator =(List<MobileElement>) driver.findElementsById("com.gudsho:id/tv_history_title");
			int size=cmnlocator.size();
			for (int i = 0; i < size; i++) {
				String el25 = (String)driver.findElementsById("com.gudsho:id/tv_history_title").get(i).getText();
				System.out.println(el25);
			}
	    }

	    @And("^verify the user can able to clear (.+) from my history$")
	    public void verify_the_user_can_able_to_clear_from_my_history(String wantedsho) throws Throwable {
	       List <MobileElement> cmnlocator =(List<MobileElement>) driver.findElementsById("com.gudsho:id/tv_history_title");
			int size=cmnlocator.size();
			for (int i = 0; i < size; i++) {
				String el25 = (String)driver.findElementsById("com.gudsho:id/tv_history_title").get(i).getText();
				if (el25.equalsIgnoreCase(wantedsho)) {
				Actual = (String)driver.findElementsById("com.gudsho:id/tv_history_title").get(i).getText();
				Thread.sleep(2000);
				MobileElement clearsho = (MobileElement) driver.findElementById("com.gudsho:id/iv_clear_text");
				clearsho.click();
				}
				}}
	    
	    @Then("^verify the toast messege for single sho clear$")
	    public void verify_the_toast_messege_for_single_sho_clear() throws Throwable {
	       System.out.println("Sho has been removed from watch History");
	    }
	    }