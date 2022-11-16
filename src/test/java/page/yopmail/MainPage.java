package page.yopmail;

import control.Button;
import control.TextBox;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class MainPage {

    public Button newEmailButton= new Button(By.id("newmail"));
    public TextBox msgtoTxt = new TextBox(By.id("msgto"));
    public TextBox msgsubjectTxt = new TextBox(By.id("msgsubject"));
    public TextBox msgbodyTxt = new TextBox(By.id("msgbody"));
    public TextBox msgsendTxt = new TextBox(By.id("msgsend"));
    public Button refreshButton = new Button(By.id("refresh"));
    public TextBox mailTxt = new TextBox(By.id("mail"));

}
