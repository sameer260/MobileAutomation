Feature: To check ain functionality are working on Home page 

@BannertoDetailpage
Scenario: To check user can enter in to sho detail page from Banner
Given User in Gudsho as a logged in user
When Verify the user can able to see the banner
And Verify the user can able to click on the banner
Then Verify the app takes the user to the sho detail page

@Homepagetopromo
Scenario: To check user can play promo from the Home page
Given User in Gudsho as a logged in user
When Verify the user can able to view the promo contents
And Verify the user can able to click on the promo
Then Verify the app takes the user to player and promo is getting played