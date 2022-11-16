package testSuite.todoist;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Date;

public class CRUDProjectTest extends TestBaseTodoIst{

    @Test
    public void verifyCRUDProject() {

        String emailTxt = "janeth.martinez6112@gmail.com";
        String passwordTxt = "123456jhan";
        String nameProject="TestProject"+new Date().getTime();
        String nameProjectUpdate="TestProjectUpdate"+new Date().getTime();


        mainPage.startLoginLabel.click();
        //login
        loginSection.emailTxtBox.setText(emailTxt);
        loginSection.pwdTxtBox.setText(passwordTxt);
        loginSection.loginButton.click();

        //Create
        menuProjectT.anadirProjectButton.click();
        menuProjectT.nameProjectTxt.setText(nameProject);
        menuProjectT.saveButton.click();

        //Update
        menuProjectT.moreActionsButton.click();
        menuProjectT.editButton.click();
        menuProjectT.nameProjectTxt.setText(nameProjectUpdate);
        menuProjectT.saveButton.click();

        //Delete
        menuProjectT.moreActionsButton.click();
        menuProjectT.deleteButton.click();
        menuProjectT.deleteModalButton.click();


    }
}
