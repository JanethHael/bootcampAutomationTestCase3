package testSuite.yopmail;

import org.junit.jupiter.api.Test;

public class SendEmailTest extends TestBase {

    @Test
    public void verifyCRUDProject() {
        String emailAdressTemporal ="janeT";
        String emailAdress2 ="janet@yopmail.com";
        String subjectEmail = "Send of Email";
        String messageEmail="Emergency Email";

        //loginPage.login(emailAdressTemporal);
        loginPage.emailAdress.setText(emailAdressTemporal);
        loginPage.loginButton.click();




    }


}
