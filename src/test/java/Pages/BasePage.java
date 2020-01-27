package Pages;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class BasePage {
   public WebDriver driver;
   public WebDriverWait wait;

   //To Open Chrome web browser
   public WebDriver OpenChromeBrowser(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("browser executed");
        return driver;
   }
   //This function is used to select an option from  dropdown using Value
    public static void select_Option_In_DropDown_ByValue(
            WebElement element, String value) {
        try {
            Select select = new Select(element);
            select.selectByValue(value);
        } catch (NoSuchElementException e) {
            System.out.println("Option value not in dropdown");
        }
    }
    //Browser Wait
   public void browserwait(int seconds){
       driver.manage().timeouts().implicitlyWait(seconds,TimeUnit.SECONDS);
   }
   //To Close Chrome Web Browser
    public void CloseChromeBrowser(){
        driver.close();
    }
}