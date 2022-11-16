package testSuite.yopmail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import page.yopmail.MainHome;
import session.Session;

public class SendEmailTest extends TestBase {

    @Test
    public void verifyCRUDProject() {
        String emailAdressTemporal ="janeT";
        String emailAdress2 ="janet@yopmail.com";
        String subjectEmail = "Send of Email";
        String messageEmail="Emergency Email";

        loginPage.emailAdress.setText(emailAdressTemporal);
        loginPage.loginButton.click();

        //NewMessage
        WebElement iframeMail= Session.getInstance().getBrowser().findElement(By.xpath("//iframe[@id='ifmail']"));
        WebElement iframeInbox= Session.getInstance().getBrowser().findElement(By.xpath("//iframe[@id='ifmail']"));

        mainHome.newEmailButton.click();
        Session.getInstance().getBrowser().switchTo().frame(iframeMail);
        mainHome.msgtoTxt.setText(emailAdress2);
        mainHome.msgsubjectTxt.setText(subjectEmail);
        mainHome.msgbodyTxt.setText(messageEmail);
        mainHome.msgsubjectTxt.setText(subjectEmail);
        mainHome.msgsendButton.click();
        Session.getInstance().getBrowser().switchTo().defaultContent();
        mainHome.refreshButton.click();
        Session.getInstance().getBrowser().switchTo().frame(iframeMail);
        //Verify
        Session.getInstance().getBrowser().switchTo().frame(iframeInbox);
        String emailReceived= mainHome.subjectReceivedTxt.getText();
        Assertions.assertEquals(emailReceived,subjectEmail,"ERROR!, the email does not arrived");
        Session.getInstance().getBrowser().switchTo().defaultContent();
    }


}
