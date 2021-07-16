Feature: To check the functionality of payment history

  Scenario Outline: To check the buyed movies are reflecting in payment history
    Given user is in gudsho with valid credentials
     When <shoname> for payments history scenario
      And user is in the show detail page
      And user buys a movie
      And user navigates to the payment page and enter the details
      And movie is getting played
     Then verify the played <shoname> is in payment history
     
Examples:
|shoname|
|Qwerty|