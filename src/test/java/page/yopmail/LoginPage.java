package page.yopmail;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginPage {
    public TextBox emailAdress = new TextBox(By.id("login"));
    public Button loginButton = new Button(By.xpath("//button[contains(@title,'Revisa el correo @yopmail.com')]"));

    public void login(String emailAd){
        emailAdress.setText(emailAd);
        loginButton.click();
    }

}
