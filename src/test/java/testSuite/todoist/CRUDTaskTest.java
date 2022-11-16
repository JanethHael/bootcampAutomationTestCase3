package testSuite.todoist;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.util.Date;

public class CRUDTaskTest extends TestBaseTodoIst {
    @Test
    public void verifyCRUDProject() {

        String emailTxt = "janeth.martinez6112@gmail.com";
        String passwordTxt = "123456jhan";
        String nameTask = "TestTask" + new Date().getTime();
        String nameTaskUpdate = "TestTaskUpdate" + new Date().getTime();
        String descriptionTask="First Task Description 1";
        String nameTaskUpd="FirstTaskUpdate"+new Date().getTime();
        String descriptionTaskUpd="First Task Description 1 Update";

        mainPage.startLoginLabel.click();
        //login
        loginSection.emailTxtBox.setText(emailTxt);
        loginSection.pwdTxtBox.setText(passwordTxt);
        loginSection.loginButton.click();

        //create
        mainHome.addTaskButton.click();
        mainHome.nameTaskTxt.setText(nameTask);
        mainHome.desTaskTxt.setText(descriptionTask);
        mainHome.submitButton.click();

        //update
        mainHome.editTaskButton.click();
        mainHome.nameTaskTxt.setText(nameTaskUpdate);
        mainHome.desTaskUpdTxt.setText(descriptionTask);
        mainHome.submitButton.click();



    }
}
