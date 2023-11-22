Feature: To test Login Functionality

  #Background: Below are the common steps for each scenario
  #Given browser is open
  #And user is on login page
  #When user enters username and password
  #And user clicks on login button
  #Then user is navigated to homepage
  Scenario: Check login is successful with valid credentials
    Given browser is open
    When user enters username as "sureshbabuemp@gmail.com" and password as "ZPMHQHIA"
    And user clicks on login button
    Then user is navigated to homepage
  #Scenario Outline: Check login is successful with valid credentials
    #Given browser is open
    #When user enters username as "<username>" and password as "<password>"
    #And user clicks on login button
    #Then user is navigated to homepage
#
    #providing parameters
    #Examples: 
      #| username                | password |
      #| sureshbabuemp@gmail.com | ZPMHQHIA |
