package page.todoist;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginSection {

    public TextBox emailTxtBox= new TextBox(By.id("element-0"));
    public TextBox pwdTxtBox= new TextBox(By.id("element-3"));
    public Button loginButton= new Button(By.cssSelector("button[type='submit']"));

    public LoginSection(){}
}
