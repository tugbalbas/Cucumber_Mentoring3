package stepDefinition;

import PageObjectModel.myStore_Page;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class myStore_Steps {

    private WebDriver driver;
    myStore_Page myStore_page = new myStore_Page();


    @Given("^Navigate to Website My Store$")
    public void navigate_to_Website_My_Store() {
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("^click on My Account Button$")
    public void click_on_My_Account_Button() {
        myStore_page.clickOnMyAccountButton();
    }

    @Given("^click on Register Button$")
    public void click_on_Register_Button() {
        myStore_page.clickOnRegisterButton();
    }

    @Given("^type firstname$")
    public void type_firstname() {
        myStore_page.typeFirstname();
    }

    @Given("^type lastname$")
    public void type_lastname() {
        myStore_page.typeLastname();
    }

    @Given("^type email$")
    public void type_email() {
        myStore_page.typeEmail();
    }

    @Given("^type telno$")
    public void type_telno() {
        myStore_page.typeTelephone();
    }

    @Given("^type pass$")
    public void type_pass() {
        myStore_page.typePassAndConfirm();
    }
}