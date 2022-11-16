package testSuite.todoist;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import page.yopmail.LoginPage;
import session.Session;
import session.SessionTodoist;
import util.GetPropertiesTodoist;

public class TestBaseTodoIst {


    @BeforeEach
    public void openBrowser(){
        SessionTodoist.getInstance().getBrowser().get(GetPropertiesTodoist.getInstance().getHost());
    }

    @AfterEach
    public void closeBrowser(){
        SessionTodoist.getInstance().closeSession();
    }
}
