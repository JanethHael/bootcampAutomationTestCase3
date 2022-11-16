package testSuite.todoist;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import page.todoist.LoginSection;
import page.todoist.MainHome;
import page.todoist.MainPage;
import page.todoist.MenuProjectT;
import session.Session;
import session.SessionTodoist;
import util.GetPropertiesTodoist;

public class TestBaseTodoIst {

    MainPage mainPage=new MainPage();
    LoginSection loginSection = new LoginSection();
    MenuProjectT menuProjectT = new MenuProjectT();
    MainHome mainHome = new MainHome();
    @BeforeEach
    public void openBrowser(){
        Session.getInstance().getBrowser().get(GetPropertiesTodoist.getInstance().getHost());
    }

    @AfterEach
    public void closeBrowser(){

        //Session.getInstance().closeSession();
    }
}
