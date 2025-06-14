package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.ilcarro.pages.BasePage.driver;

public class HomePageSteps {

    @Given("User launches Chrome browser")
    public void launches_Chrome_browser() {
        new HomePage(driver).launchBrowser();
    }

    @When("User opens iLcarro HomePage")
    public void opens_iLcarro_HomePage() {
        new HomePage(driver).openURL();
    }

    @Then("User verifies HomePage title")
    public void verifies_HomePage_title() {
        new HomePage(driver).isHomePageTitleDisplayed();
    }
    @And("User quites the browser")
    public void user_quites_the_browser() {
        new HomePage(driver).tearDown();
    }

}
