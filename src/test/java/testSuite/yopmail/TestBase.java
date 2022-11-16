package testSuite.yopmail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.todoly.LoginSection;
import page.yopmail.LoginPage;
import session.Session;
import util.GetProperties;
import util.GetPropertiesYopmail;

import java.time.Duration;

public class TestBase {

    LoginPage loginPage = new LoginPage();
    WebDriver driver;

    @BeforeEach
    public void openBrowser(){
        Session.getInstance().getBrowser().get(GetPropertiesYopmail.getInstance().getHost());
    }

    @AfterEach
    public void closeBrowser(){
        driver.quit();
    }
}
