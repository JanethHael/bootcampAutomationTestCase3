package basicSelenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import session.Session;

import java.time.Duration;
import java.util.function.BooleanSupplier;

public class BasicSeleniumTestYopMail {

    WebDriver driver;

    @BeforeEach
    public void setup(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver");
        driver = new ChromeDriver();
        // implicit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // page load wait
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.get("https://yopmail.com/es/");
    }

    @AfterEach
    public void cleanup(){

        //driver.quit();
    }

    @Test
    public void verifitySendEmail() throws InterruptedException {
        String emailAdressTemporal ="janeT";
        String emailAdress2 ="janet@yopmail.com";
        String subjectEmail = "Send of Email";
        String messageEmail="Emergency Email";

        driver.findElement(By.id("login")).sendKeys(emailAdressTemporal);
        driver.findElement(By.xpath("//button[contains(@title,'Revisa el correo @yopmail.com')]")).click();

        //NewMessage
        driver.findElement(By.id("newmail")).click();
        driver.switchTo().frame("ifmail");
        driver.findElement(By.id("msgto")).sendKeys(emailAdress2);
        driver.findElement(By.id("msgsubject")).sendKeys(subjectEmail);
        driver.findElement(By.id("msgbody")).sendKeys(messageEmail);
        driver.findElement(By.id("msgsend")).click();
        driver.switchTo().defaultContent();
        Thread.sleep(1000);
        driver.findElement(By.id("refresh")).click();

        driver.switchTo().frame("ifmail");
       //Verify
        String actualResult= driver.findElements(By.id("mail")).toString();
        Assertions.assertEquals(actualResult,messageEmail);


    }
}
