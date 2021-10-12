import org.junit.Test;
import org.testng.Assert;
import pages.*;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class ContactTests extends BaseTests{

//Fill form
    @Test
    public void testSendMessage(String s){
        var contactPage = homepage.clickContactPage();
        contactPage.setEmail("a.a.@a.com");
        contactPage.setName("Anita");
        contactPage.setMessage("Hello");
        contactPage.clickSendButton();
        String text = contactPage.alert_getText();
        assertEquals(text, "Thanks for the message!!");
        contactPage.alert_clickToAccept();

        }


}
