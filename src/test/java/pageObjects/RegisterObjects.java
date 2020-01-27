package pageObjects;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegisterObjects extends BasePage {
    WebDriver driver;

//Using PageFactory to locate element.
    @FindBy(how = How.ID, using = "contact-link")
    public WebElement contact;
    @FindBy(how = How.CLASS_NAME, using = "login")
    public WebElement login;
    @FindBy(how = How.ID, using = "email_create")
    public WebElement email;
    //Another way to locate page element in pagefactory
    @FindBy(id = "SubmitCreate")
    public WebElement Email_Create_Btn;
    @FindBy(id = "id_gender1")
    public WebElement id_gender1;
    @FindBy(id = "customer_firstname")
    public WebElement customer_firstname;
    @FindBy(id = "customer_lastname")
    public WebElement customer_lastname;
    @FindBy(id = "passwd")
    public WebElement passwd;
    @FindBy(id = "days")
    public WebElement days;
    @FindBy(id = "months")
    public WebElement months;
    @FindBy(id = "years")
    public WebElement years;
    @FindBy(how = How.ID, using = "firstname")
    public WebElement firstname;
    @FindBy(how = How.ID, using = "lastname")
    public WebElement lastname;
    @FindBy(how = How.ID, using = "company")
    public WebElement company;
    @FindBy(how = How.ID, using = "address1")
    public WebElement address1;
    @FindBy(how = How.ID, using = "address2")
    public WebElement address2;
    @FindBy(how = How.ID, using = "city")
    public WebElement city;
    @FindBy(how = How.ID, using = "id_state")
    public WebElement id_state;
    @FindBy(how = How.ID, using = "postcode")
    public WebElement postcode;
    @FindBy(how = How.ID, using = "other")
    public WebElement other;
    @FindBy(how = How.ID, using = "phone")
    public WebElement phone;
    @FindBy(how = How.ID, using = "phone_mobile")
    public WebElement phone_mobile;
    @FindBy(how = How.ID, using = "alias")
    public WebElement alias;
    @FindBy(how = How.ID, using = "submitAccount")
    public WebElement submitAccount;

    //Constructor to initialize webdriver
    public RegisterObjects(WebDriver Newdriver){
        this.driver = Newdriver;
        PageFactory.initElements(Newdriver, this);
    }
}
