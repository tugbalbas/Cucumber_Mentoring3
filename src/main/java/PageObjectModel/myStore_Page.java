package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class myStore_Page extends AbstractClass{

    WebDriver driver;

    // FindBy lar için boş const. içinde PageFactory
    public myStore_Page(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[text()='My Account']")
    private WebElement myAccountButton;

    public void clickOnMyAccountButton(){
        clickFunction(myAccountButton);
    }

    @FindBy(xpath = "//a[text()='Register']")
    private WebElement registerButton;

    public void clickOnRegisterButton(){
        clickFunction(registerButton);
    }

    @FindBy (css = "#input-firstname")
    private WebElement firstname;

    public void typeFirstname(){
        sendKeysFunction(firstname,"Ömer");
    }

    @FindBy(css = "#input-lastname")
    private WebElement lastname;
    public void typeLastname(){
        sendKeysFunction(lastname,"Özdemir");
    }

    @FindBy(css = "#input-email")
    private WebElement email;
    public void typeEmail(){
        sendKeysFunction(email,"omerozdemir724@gmail.com");
    }

    @FindBy(css = "#input-telephone")
    private WebElement telephone;
    public void typeTelephone(){
        sendKeysFunction(telephone,"053543341");
    }

    @FindBy(css = "#input-password")
    private WebElement pass;
    @FindBy(css = "#input-confirm")
    private WebElement passConfirm;
    public void typePassAndConfirm(){
        sendKeysFunction(pass,"omerozdemir12");
        sendKeysFunction(passConfirm,"omerozdemir12");
    }
}