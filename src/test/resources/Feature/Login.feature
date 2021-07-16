Feature: To check the login functionality of Gudsho

@Phone
Scenario Outline: Trying to login with Phone number and otp
Given user has to be there in GudSho app
When  user has to click signin in me section
And user has to enter "<Phone Number>" 
And  user has to click the get otp field 
And verify user navigates to otp page and enters the otp 
Then  verify the user can able to login

Examples:
|Phone Number|
|9566139321|
|1234567890|
|9894658162|



@Mail
Scenario Outline: Trying to login with mail id and otp
Given user has to be there in GudSho app
When  user has to click signin in me section
And user has to click use mail id and enter the "<Mail Id>" 
And  user has to click the get otp field 
And verify user navigates to otp page and enters the otp 
Then  verify the user can able to login 

Examples:
|Mail Id|
|naveen.l@contus.in|
|123@gmail.com|
|naveenlaks94@gmail.com|

@Google
Scenario Outline: Trying to login with Google account and password
Given user has to be there in GudSho app
When user has to click signin in me section
And user has to click Google logo  
And verify user navigates to accounts page and user enters the "<Username>" and "<Password>"
Then verify the user can able to login with google account

Examples:
|Username|Password|
|naveenlaks94@gmail.com|12345|
|abc@gmail.com|78910|


@Facebook 
Scenario Outline: Trying to login with Facebook account and password
Given user has to be there in GudSho app
When  user has to click signin in me section
And user has to click facebook logo 
And verify user navigates to facebook login page and enters the "<Username>" and "<Password>"
Then  verify the user can able to login with facebook account 

Examples:
|Username|Password|
|naveen123@gmaail.com|123456|
|abc@gmail.com|78910|

@LoginRegistration
Scenario Outline: Trying to login with new mail id and phone number
Given user has to be there in GudSho app
When  user has to click signin in me section
And user has to enter mail id field and enter <newid> and <newnumber>
And Verify the system takes the ser to login registration page and enter the valid credentails 
Then verify the user can able to login with new credentails

Examples:
|newid|newnumber|
|naveen887766@yopmail.com|9025481560|

@SkipLoginRegistration
Scenario Outline: Trying to login with new mail id and phone number and skip the datas
Given user has to be there in GudSho app
When  user has to click signin in me section
And user has to enter mail id field and enter <newid> and <newnumber>
And Verify the system takes the ser to login registration page and skip the datas 
Then verify the user can able to login with new credentails

Examples:
|newid|newnumber|
|naveen887766@yopmail.com|9025481560|
