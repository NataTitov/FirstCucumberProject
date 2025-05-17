Feature: addCarToWork

  @addCarToWork
  Scenario: Add car to work
    Given User launches Chrome browser
    When User opens iLcarro HomePage
    And User clicks on Login link
    And User enter valid data
    And User clicks on Yalla button
    And User clicks on add car to work
    And User enters valid location
    And User enters valid data in Manufacture field
    And User enters valid data in Model field
    And User enters valid data in Year field
    And User selects Fuel
    And User enters valid data in Seats field
    And User enters valid data in CarClass field
    And User enters valid data in CarRegistrationNumber field
    And User enters valid data in Price field
    And User enters valid data in About field
    And User uploads photo of car
    And User clicks on Submit button
    Then Car is added successfully

