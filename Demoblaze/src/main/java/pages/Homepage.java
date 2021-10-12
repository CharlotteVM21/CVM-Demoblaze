package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

    private WebDriver driver;

    public Homepage (WebDriver driver){
        this.driver = driver;
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }


    public Homepage clickHomePage(){
        clickLink("Home");
        return new Homepage(driver);
    }

    public ContactPage clickContactPage(){
        clickLink("Contact");
        return new ContactPage(driver);
    }

    public AboutPage clickAboutPage(){
        clickLink("About us");
        return new AboutPage(driver);
    }

    public CartPage clickCartPage(){
        clickLink("Cart");
        return new CartPage(driver);
    }

    public LoginPage clickLoginPage(){
        clickLink("Log in");
        return new LoginPage(driver);
    }

    public SignupPage clickSignupPage(){
        clickLink("Sign up");
        return new SignupPage(driver);
    }

    public PhonePage clickPhonePage(){
        clickLink("Phones");
        return new PhonePage(driver);
    }

    public LaptopPage clickLaptopPage(){
        clickLink("Laptops");
        return new LaptopPage(driver);
    }

    public MonitorPage clickMonitorPage(){
        clickLink("Monitors");
        return new MonitorPage(driver);
    }
}
