Feature:  Login Action
Login fuctionality
  Scenario: Successfully login
    Given user open the chrome browser
    And user open TestMeApp
    And user click SingIn link
    And user enter the username "Lalitha" and password "Password123" 
    And user click the login button
    And user verify login and pageTitle
    Then message login successfully