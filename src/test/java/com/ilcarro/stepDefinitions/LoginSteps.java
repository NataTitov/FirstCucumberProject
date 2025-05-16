package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class LoginSteps {
    @And("User clicks on Login link")
    public void clicksOnLoginLink(){
        new HomePage(driver).clickOnLoginLink();
    }

    @And("User enter valid data")
    public void enterValidData(){
        new LoginPage(driver).enterData("as@gmail.com", "Aa12345!");
    }

    @And("User clicks on Yalla button")
    public void clicksOnYallaButton(){
        new LoginPage(driver).clickOnYallaBtn();
    }

    @Then("User verify Success message is displayed")
    public void verifySuccessMessageIsDisplayed(){
        new LoginPage(driver).isMessageTextPresent("Logged in success");
    }

    @And("User enter valid email and wrong password")
    public void entersValidEmailAndWrongPassword(DataTable table){
        new LoginPage(driver).enterWrongData(table);
    }

    @Then("User verify Error message is displayed")
    public void verifyErrorMessageIsDisplayed(){
        new LoginPage(driver).isMessageTextPresent("Login or Password incorrect");
    }
}