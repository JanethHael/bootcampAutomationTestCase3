package testPage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Date;

public class CRUDTaskTest {

    WebDriver driver;

    @BeforeEach
    public void setup(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver");
        driver = new ChromeDriver();
        // implicit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // page load wait
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.get("https://todoist.com/auth/login");



    }

    @AfterEach
    public void cleanup(){

        //driver.quit();
    }

    @Test
    public void verifyCRUDProject() throws InterruptedException {
        // login
        driver.findElement(By.id("element-0")).sendKeys("janeth.martinez6112@gmail.com");
        driver.findElement(By.id("element-3")).sendKeys("123456jhan");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        explicitWait.until(ExpectedConditions.elementToBeClickable(By.id("loading")));

        Assertions.assertTrue(driver.findElement(By.id("loading")).isDisplayed()
                ,"ERROR login was incorrect");
        //create
        String nameTask="FirstTask"+new Date().getTime();
        String descriptionTask="First Task Description 1";
        driver.findElement(By.xpath("//li/button[contains(@class,'plus_add_button')]")).click();
        driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys(nameTask);
        driver.findElement(By.xpath("//textarea[@aria-invalid='false']")).sendKeys(descriptionTask);
        driver.findElement(By.xpath("//button[contains(@data-testid,'task-editor-submit-button')]")).click();

        //update

        String nameTaskUpd="FirstTaskUpdate"+new Date().getTime();
        String descriptionTaskUpd="First Task Description 1 Update";
        /*driver.findElement(By.xpath("//button[contains(@aria-label,'Editar')]")).click();
        driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys(nameTaskUpd);
        driver.findElement(By.xpath("//textarea[@aria-invalid='false']")).sendKeys(descriptionTaskUpd);
        driver.findElement(By.xpath("//button[contains(@data-testid,'task-editor-submit-button')]")).click();*/

        //delete
        driver.findElement(By.xpath("//li[1]/div[1]/div[4]/button[contains(@aria-label,'Más acciones de tarea')]")).click();


    }
}
