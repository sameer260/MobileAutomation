package org.Stepdefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;

public class StudioDetails extends Baseclass {
	
	Baseclass B=new Baseclass();
	    @Given("^user is in to gudsho$")
	    public void user_is_in_to_gudsho() throws Throwable {
		 B.launchGudSho();
	    }

	    @When("^(.+) for studio details scenario$")
	    public void for_studio_details_scenario(String studioname) throws Throwable {
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
			el6.sendKeys(studioname);
	    }
	    @And("^user is in the studio detail page$")
	    public void user_is_in_the_studio_detail_page() throws Throwable {
	    	MobileElement Searchdrop = (MobileElement) driver.findElementById("com.gudsho:id/tv_title");
			Searchdrop.click();
			System.out.println("You are in Studio detail page");
	    }

	    @Then("^verify the user can able to see the (.+) studio info$")
	    public void verify_the_user_can_able_to_see_the_studio_info(String studioname) throws Throwable {
	    	MobileElement infobutton = (MobileElement) driver.findElementById("com.gudsho:id/iv_studio_info");
	    	infobutton.click();
	    	MobileElement info = (MobileElement) driver.findElementById("com.gudsho:id/tv_studio_info_description");
	    	String text = info.getText();
	    	System.out.println("The studio info of " + studioname +text);
	    }
}