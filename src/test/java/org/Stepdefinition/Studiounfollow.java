package org.Stepdefinition;

import static org.junit.Assert.assertTrue;
import java.util.List;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;

public class Studiounfollow extends Baseclass {

	Baseclass B=new Baseclass();
	 @Given("^user is logged in to gudsho with valid data$")
	    public void user_is_logged_in_to_gudsho_with_valid_data() throws Throwable {
		 B.GudShologgedin();
	    }

	    @When("^user is in the me tab$")
	    public void user_is_in_the_me_tab() throws Throwable {
	        B.Mepage();
	    }

	    @And("^user is in the following studio$")
	    public void user_is_in_the_following_studio() throws Throwable {
	    	MobileElement el1 = (MobileElement) driver.findElementById("com.gudsho:id/tv_following_studio");
	    	el1.click();
	    }
	    
	    public String Actual;
	    @And("^verify the user can able to unfollow a (.+)$")
	    public void verify_the_user_can_able_to_unfollow_a(String wantedstudioname) throws Throwable {
	    	System.out.println("List of Studio name's in Studio tab: ");
			List <MobileElement> cmnlocator =(List<MobileElement>) driver.findElementsById("com.gudsho:id/tv_studio_name");
			int size=cmnlocator.size();
			for (int i = 0; i < size; i++) {
				String el25 = (String)driver.findElementsById("com.gudsho:id/tv_studio_name").get(i).getText();
				System.out.println(el25);
				if (el25.equalsIgnoreCase(wantedstudioname)) {
					Actual = (String)driver.findElementsById("com.gudsho:id/tv_studio_name").get(i).getText();
					MobileElement followloc = (MobileElement)driver.findElementsById("com.gudsho:id/tv_following_info").get(i);
					followloc.click();
					MobileElement el2 = (MobileElement) driver.findElementById("android:id/button1");
					el2.click();
					break;
					
				}
				}
				}
			
	    @Then("^verify the (.+) after unfollowing the studio$")
	    public void verify_the_after_unfollowing_the_studio(String wantedstudioname) throws Throwable {
	    	System.out.println("The studio which ou have unfollowed is: "+ wantedstudioname);
	    	assertTrue(Actual.equalsIgnoreCase(wantedstudioname));
}
}