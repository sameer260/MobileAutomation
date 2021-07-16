Feature: To check the functionality of studio unfollow

@Regunfollow
  Scenario Outline: To check whether the user can able to unfollow the studio
    Given user is logged in to gudsho with valid data
     When user is in the me tab
      And user is in the following studio
      And verify the user can able to unfollow a <wantedstudioname>
     Then verify the <wantedstudioname> after unfollowing the studio
     
     Examples:
     |wantedstudioname|
     |Sameer|
