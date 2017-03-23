Feature: Show a user's information on a page, given a user ID

  Scenario: A user types his id in the browser URL
    Given a user with id 1
    When we go to the /user/1 URL
    Then we get the user's information