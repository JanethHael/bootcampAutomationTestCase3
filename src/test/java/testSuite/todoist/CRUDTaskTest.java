package testSuite.todoist;

import org.junit.jupiter.api.Test;

import java.util.Date;

public class CRUDTaskTest extends TestBaseTodoIst {
    @Test
    public void verifyCRUDProject() {

        String emailTxt = "janeth.martinez6112@gmail.com";
        String passwordTxt = "123456jhan";
        String nameTask = "TestTask" + new Date().getTime();
        String nameTaskUpdate = "TestTaskUpdate" + new Date().getTime();


        mainPage.startLoginLabel.click();
        //login
        loginSection.emailTxtBox.setText(emailTxt);
        loginSection.pwdTxtBox.setText(passwordTxt);
        loginSection.loginButton.click();
    }
}
