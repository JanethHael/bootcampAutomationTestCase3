package testSuite.todoly;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.todoly.*;
import session.Session;
import util.GetProperties;

import java.time.Duration;

public class TestBase {
     MainPage mainPage= new MainPage();
     LoginSection loginSection = new LoginSection();
     MenuSection menuSection = new MenuSection();
     ProjectSection projectSection= new ProjectSection();

     SettingsSection settingsSection = new SettingsSection();

     SignUpSection signUpSection= new SignUpSection();
     // todo property file
     String user=GetProperties.getInstance().getUser();
     String password =GetProperties.getInstance().getPwd();
     WebDriver driver;


     @BeforeEach
     public void openBrowser(){
          // todo create property file

               System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver");
               driver = new ChromeDriver();
               // implicit
               driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
               // page load wait
               driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
               driver.manage().window().maximize();
               driver.get("http://todo.ly/");

     }

     @AfterEach
     public void closeBrowser(){
          Session.getInstance().closeSession();
     }

}
