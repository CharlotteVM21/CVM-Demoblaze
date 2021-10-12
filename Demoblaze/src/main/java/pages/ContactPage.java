package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage {

    private WebDriver driver;
    private By emailField = By.id("Contact Email:");
    private By nameField = By.id("Contact");
    private By messageField = By.id("Message");
    private By sendMessage = By.cssSelector(".btn btn-primary");

    public ContactPage (WebDriver driver){
        this.driver = driver;
    }

    //Fill out Contact form

        public void setEmail(String email){
            driver.findElement(emailField).sendKeys(email);
        }

        public void setName(String name){
            driver.findElement(nameField).sendKeys(name);
        }

        public void setMessage(String message) {
            driver.findElement(messageField).sendKeys(message);
        }

        public ContactPage clickSendButton(){
            driver.findElement(sendMessage).click();
            return new ContactPage(driver);
        }

    //Confirm sent message alert
    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }

    public void alert_clickToAccept(){
            driver.switchTo().alert().accept();
        }
    }


