Feature: Login

  @validData
  Scenario: Login with valid data
    Given User launches Chrome browser
    When User opens iLcarro HomePage
    And User clicks on Login link
    And User enter valid data
    And User clicks on Yalla button
    Then User verify Success message is displayed
    And User quites the browser


  @wrongPassword
  Scenario Outline: Login with valid email and wrong password
    Given User launches Chrome browser
    When User opens iLcarro HomePage
    And User clicks on Login link
    And User enter valid email and wrong password
      | email   | password   |
      | <email> | <password> |
    And User clicks on Yalla button
    Then User verify Error message is displayed
    And User quites the browser
    Examples:
      | email   | password   |
      | as@gmail.com | Aa12345  |
      | as@gmail.com | aa12345!  |
      | as@gmail.com | Пп12345!  |
