package stepDefinition;

import PageObjectModel.register_Page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class register_Steps {

    private WebDriver driver;


    register_Page rg = new register_Page();

    @Given("^Navigate to Website$")
    public void navigateToWebsite() {
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @And("^click Sign in button$")
    public void clickSignInButton() {
        rg.clickOnSignInButton();
    }

    @And("^type email \"([^\"]*)\"$")
    public void typeEmail(String email) {
        rg.typeEmail(email);
    }

    @And("^click on Create an Account button$")
    public void clickOnCreateAnAccountButton() {
        rg.clickOnSubmitCreateButton();
    }

    @And("^type firstname \"([^\"]*)\" and lastname \"([^\"]*)\"$")
    public void typeFirstnameAndLastname(String firstname, String lastname) {
        rg.typeFirstname(firstname);
        rg.typeLastname(lastname);
    }

    @And("^type password \"([^\"]*)\"$")
    public void typePassword(String password) {
        rg.typePassword(password);
    }

    @And("^type Company \"([^\"]*)\"$")
    public void typeCompany(String company) {
        rg.typeCompany(company);
    }

    @And("^type address \"([^\"]*)\"$")
    public void typeAddress(String address) {
        rg.typeAddress(address);
    }
}
