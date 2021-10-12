package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutPage {

    public WebDriver driver;

    public AboutPage (WebDriver driver){
        this.driver = driver;
    }

    public void playAboutVideo(){
        driver.findElement(By.tagName("video"));
    }
}
