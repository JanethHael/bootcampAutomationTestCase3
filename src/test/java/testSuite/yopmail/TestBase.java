package testSuite.yopmail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.todoly.LoginSection;
import page.yopmail.LoginPage;
import page.yopmail.MainHome;
import session.Session;
import session.SessionTodoist;
import util.GetProperties;
import util.GetPropertiesYopmail;

import java.time.Duration;

public class TestBase {

    LoginPage loginPage = new LoginPage();
    MainHome mainHome = new MainHome();

    @BeforeEach
    public void openBrowser(){
        Session.getInstance().getBrowser().get(GetPropertiesYopmail.getInstance().getHost());
    }

    @AfterEach
    public void closeBrowser(){
       // Session.getInstance().closeSession();
    }
}
