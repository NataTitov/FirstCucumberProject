package com.ilcarro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.List;

public class LetCarWorkPage extends BasePage {
    public LetCarWorkPage(WebDriver driver) {
        super(driver);
    }

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @FindBy(id = "pickUpPlace")
    WebElement pickUpPlace;
    @FindBy(css = ".pac-item")
    List<WebElement> suggestions;

    public LetCarWorkPage enterLocation(String city) {
        pickUpPlace.clear();
        pickUpPlace.sendKeys(city);
        wait.until(ExpectedConditions.visibilityOfAllElements(suggestions));
        for (WebElement suggestion : suggestions) {
            if (suggestion.getText().contains(city)) {
                suggestion.click();
                break;
            }
        }
        return this;
    }

    @FindBy(id = "make")
    WebElement make;

    public LetCarWorkPage enterManufacture(String manufacture) {
        type(make, manufacture);
        return this;
    }

    @FindBy(id = "model")
    WebElement modelAuto;

    public LetCarWorkPage enterModel(String model) {
        type(modelAuto, model);
        return this;
    }

    @FindBy(id = "year")
    WebElement yearAuto;

    public LetCarWorkPage enterYear(String year) {
        type(yearAuto, year);
        return this;
    }

    @FindBy(id = "fuel")
    WebElement selectFuel;

    public LetCarWorkPage selectFuel(String fuel) {
        new Select(selectFuel).selectByVisibleText(fuel);
        return this;
    }

    @FindBy(id = "seats")
    WebElement seats;

    public LetCarWorkPage enterSeats(String number) {
        type(seats, number);
        return this;
    }

    @FindBy(id = "class")
    WebElement classField;

    public LetCarWorkPage enterCarClass(String classAuto) {
        type(classField, classAuto);
        return this;
    }

    @FindBy(id = "serialNumber")
    WebElement serialNumber;

    public LetCarWorkPage enterCarRegistrationNumber(String registrationNumber) {
        type(serialNumber, registrationNumber);
        return this;
    }

    @FindBy(id = "price")
    WebElement price;

    public LetCarWorkPage enterPrice(String priceAuto) {
        type(price, priceAuto);
        return this;
    }

    @FindBy(id = "about")
    WebElement about;

    public LetCarWorkPage enterAbout(String text) {
        type(about, text);
        return this;
    }

    @FindBy(id = "photos")
    WebElement uploadPhoto;

    public LetCarWorkPage uploadPhotos(List<String> filePaths) {
        for (String fp : filePaths) {
            String path = new File(fp).getAbsolutePath();
            uploadPhoto.sendKeys(fp);
            uploadPhoto.clear();
        }
        return this;
    }

    @FindBy(css = "button[type='submit']")
    WebElement submitButton;

    public LetCarWorkPage clickOnSubmit() {
        click(submitButton);
        return this;
    }

    @FindBy(className = "message")
    WebElement successMessage;

    public LetCarWorkPage verifyCarAddedSuccessfully(String message) {
        assert successMessage.getText().contains(message);
        return this;
    }
}
