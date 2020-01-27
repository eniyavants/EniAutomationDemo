package Pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.RegisterObjects;



public class RegisterPage extends BasePage{
    WebDriver driver = OpenChromeBrowser();

    RegisterObjects RegObj = new RegisterObjects(driver);
    @Given("User is on login page")
    public void user_is_on_login_page() throws InterruptedException {
        RegisterObjects RegObj = new RegisterObjects(driver);
        RegObj.login.click();
    }

    @Given("User enter valid email address")
    public void user_enter_valid_email_address() {
        browserwait(200);
        RegObj.login.click();
        //For testing  purpose, create random Email address
        String Email = "EniTest0"+Math.random()+"@gmail.com";
        System.out.println("Email Account = "+Email);
        RegObj.email.sendKeys(Email);
        RegObj.Email_Create_Btn.click();
    }

    @When("all information entered")
    public void all_information_entered() {
       RegObj.id_gender1.click();
       RegObj.customer_firstname.sendKeys("Eni");
       RegObj.customer_lastname.sendKeys("TS");
       RegObj.passwd.sendKeys("Enitest2020");
       select_Option_In_DropDown_ByValue(RegObj.days,"14" );
       select_Option_In_DropDown_ByValue(RegObj.months,"8" );
       select_Option_In_DropDown_ByValue(RegObj.years,"1990" );
      // RegObj.firstname.sendKeys("eni2");
      // RegObj.lastname.sendKeys("TS2");
       RegObj.address1.sendKeys("10, queen street");
       RegObj.address2.sendKeys("Alaska CBD");
       RegObj.city.sendKeys("Alaska");
       RegObj.id_state.sendKeys("Alaska");
       RegObj.postcode.sendKeys("12345");
       RegObj.other.sendKeys("this is test  from eni");
        RegObj.phone.sendKeys("02912113454");
       RegObj.phone_mobile.sendKeys("02912113454");
       RegObj.alias.sendKeys("Test Eni");
    }
    @Then("account created")
    public void account_created() {
        RegObj.submitAccount.click();
        CloseChromeBrowser();
    }
}
