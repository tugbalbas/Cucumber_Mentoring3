package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class register_Page extends AbstractClass {
    private WebDriver driver;

    public register_Page() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this); // @FindByları kullanabilmek için bu gerekli
    }

    @FindBy(css = ".login") // classda .kullan
    private WebElement signInButton;

    @FindBy(css = "#email_create") // id de #kullan
    private WebElement emailBox; // parametreli deger göndericez

    @FindBy(css = "#SubmitCreate")
    private WebElement createAnAccountButton;

    @FindBy(css = "#customer_firstname")
    private WebElement firstname;

    @FindBy(css = "#customer_lastname")
    private WebElement lastname;

    @FindBy(css = "#passwd")
    private WebElement password;

    @FindBy(css = "#company")
    private WebElement company;

    @FindBy(css = "#address1")
    private WebElement address;


    public void clickOnSignInButton() {
        clickFunction(signInButton); // abstracttan çağırdık
    }

    public void typeEmail(String email) {
        sendKeysFunction(emailBox, email);
    }

    public void clickOnSubmitCreateButton() {
        clickFunction(createAnAccountButton);
    }

    public void typeFirstname(String firstname1) {
        sendKeysFunction(firstname, firstname1);
    }

    public void typeLastname(String lastname1) {
        sendKeysFunction(lastname, lastname1);
    }

    public void typePassword(String password1) {
        sendKeysFunction(password, password1);
    }

    public void typeCompany(String company1) {
        sendKeysFunction(company, company1);
    }

    public void typeAddress(String address1) {
        sendKeysFunction(address, address1);
    }

}
