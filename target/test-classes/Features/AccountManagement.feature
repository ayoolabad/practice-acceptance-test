@AccountManagement
Feature: Account Management

  Scenario Outline: Create An Account
    Given user is on create an account page
    When user inputs their "<FirstName>"
    And user enter the "<LastName>"
    And user adds the "<Email>" Address
    And user enters a "<Password>" on create account page
    And user reenters to confirm that "<ConfirmPassword>"
    And user now clicks on the CreateAnAccount
    Then user MyAccount page is displayed.


      | FirstName | LastName | Email               | Password    | ConfirmPassword |
      | Sayo      | Adeayo   | sayoade@hotmail.com | shortshorT04 | shortshorT04    |