package page.yopmail;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class MainHome {

    public Button newEmailButton= new Button(By.id("newmail"));
    public TextBox msgtoTxt = new TextBox(By.id("msgto"));
    public TextBox msgsubjectTxt = new TextBox(By.id("msgsubject"));
    public TextBox msgbodyTxt = new TextBox(By.id("msgbody"));
    public Button msgsendButton = new Button(By.id("msgsend"));
    public Button homeButton = new Button(By.xpath("//a[@target='_top' and @class='hlink bl']"));
    public Button refreshButton = new Button(By.id("refresh"));
    public TextBox subjectReceivedTxt = new TextBox(By.xpath("//div/button/div[2]"));
    public TextBox mailTxt = new TextBox(By.id("mail"));

}
