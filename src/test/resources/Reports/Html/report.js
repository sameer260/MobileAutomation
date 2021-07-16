$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/EndtoEnd.feature");
formatter.feature({
  "name": "To check the end to end functionality of GudSho",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To check the Reg user can able to buy and watch a movie",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@NewEnd2End"
    }
  ]
});
formatter.step({
  "name": "user is not logged in to gudsho app",
  "keyword": "Given "
});
formatter.step({
  "name": "Verify the user can search a desired \u003cshoname\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "verify the user can able to see the show detail page",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks buy options",
  "keyword": "And "
});
formatter.step({
  "name": "Verify the login poup is shown and user can login",
  "keyword": "And "
});
formatter.step({
  "name": "verify the user navigates to the payment detail page and enter the payment details",
  "keyword": "And "
});
formatter.step({
  "name": "After the payment verify the movie is getting played",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "shoname"
      ]
    },
    {
      "cells": [
        "Transcode"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To check the Reg user can able to buy and watch a movie",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@NewEnd2End"
    }
  ]
});
formatter.step({
  "name": "user is not logged in to gudsho app",
  "keyword": "Given "
});
formatter.match({
  "location": "EndtoEnd.user_is_not_logged_in_to_gudsho_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the user can search a desired Transcode",
  "keyword": "When "
});
formatter.match({
  "location": "EndtoEnd.verify_the_user_can_search_a_desired(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the user can able to see the show detail page",
  "keyword": "And "
});
formatter.match({
  "location": "EndtoEnd.verify_the_user_can_able_to_see_the_show_detail_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks buy options",
  "keyword": "And "
});
formatter.match({
  "location": "EndtoEnd.user_clicks_buy_options()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the login poup is shown and user can login",
  "keyword": "And "
});
formatter.match({
  "location": "EndtoEnd.verify_the_login_poup_is_shown_and_user_can_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the user navigates to the payment detail page and enter the payment details",
  "keyword": "And "
});
formatter.match({
  "location": "EndtoEnd.verify_the_user_navigates_to_the_payment_detail_page_and_enter_the_payment_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "After the payment verify the movie is getting played",
  "keyword": "Then "
});
formatter.match({
  "location": "EndtoEnd.after_the_payment_verify_the_movie_is_getting_played()"
});
formatter.result({
  "status": "passed"
});
});