package com.ilcarro.stepDefinitions;


import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LetCarWorkPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.Arrays;
import java.util.List;

import static com.ilcarro.pages.BasePage.driver;


public class LetCarWorkSteps {

    @And("User clicks on add car to work")
    public void clickOnAddCarToWorkLink() {
        new HomePage(driver).clickOnAddCarToWork();
    }
    @And("User enters valid location")
    public void enterLocation() {
        new LetCarWorkPage(driver).enterLocation("Tel Aviv");
    }
    @And("User enters valid data in Manufacture field")
    public void enterManufactureField() {
        new LetCarWorkPage(driver).enterManufacture("BMW");
    }
    @And("User enters valid data in Model field")
    public void enterModelField() {
        new LetCarWorkPage(driver).enterModel("X5");
    }

    @And("User enters valid data in Year field")
    public void enterYearField() {
        new LetCarWorkPage(driver).enterYear("2020");
    }
    @And("User selects Fuel")
    public void selectFuel() {
        new LetCarWorkPage(driver).selectFuel("Hybrid");
    }

    @And("User enters valid data in Seats field")
    public void enterSeatsField() {
        new LetCarWorkPage(driver).enterSeats("5");
    }
    @And("User enters valid data in CarClass field")
    public void enterCarClassField() {
        new LetCarWorkPage(driver).enterCarClass("Premium");
    }
    @And("User enters valid data in CarRegistrationNumber field")
    public void enterCarRegistrationNumberField() {
        new LetCarWorkPage(driver).enterCarRegistrationNumber("M GF9386E");
    }

    @And("User enters valid data in Price field")
    public void enterPriceField() {
        new LetCarWorkPage(driver).enterPrice("999");
    }
    @And("User enters valid data in About field")
    public void enterAboutField() {
        new LetCarWorkPage(driver).enterAbout("Test");
    }

    @And("User uploads photo of car")
    public void uploadPhoto() {
        List<String> photos = Arrays.asList(
                "src/test/resources/images/bmvx5.jpg",
                "src/test/resources/images/bmvx51.jpg"
        );
        new LetCarWorkPage(driver).uploadPhotos(photos);
    }
    @And("User clicks on Submit button")
    public void clickOnSubmitButton() {
        new LetCarWorkPage(driver).clickOnSubmit();
    }
    @Then("Car is added successfully")
    public void carIsAddedSuccessfully() {
        new LetCarWorkPage(driver).verifyCarAddedSuccessfully("BMW X5 added successful");
    }

}
