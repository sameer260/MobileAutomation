Feature: To check the end to end functionality of GudSho

@NewEnd2End
Scenario Outline: To check the Reg user can able to buy and watch a movie
Given user is not logged in to gudsho app
When Verify the user can search a desired <shoname>
And verify the user can able to see the show detail page
And user clicks buy options
And Verify the login poup is shown and user can login
And verify the user navigates to the payment detail page and enter the payment details
Then After the payment verify the movie is getting played

Examples:
|shoname|
|Transcode|