package basicSelenium;

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

public class BasicSeleniumTestProject {

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

        String nameProject="TestExample"+new Date().getTime();
        driver.findElement(By.xpath("//button[contains(@aria-label,'Añadir proyecto')]")).click();
        driver.findElement(By.id("edit_project_modal_field_name")).sendKeys(nameProject);
        driver.findElement(By.xpath("//button[contains(@class,'ist_button ist_button_red')]")).click();

        //update
        driver.findElement(By.xpath("//button[contains(@class,'q-PolHQBMEHmpVzKzPeWWA==')]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Editar proyecto')]")).click();
        driver.findElement(By.id("edit_project_modal_field_name")).sendKeys(nameProject);
        driver.findElement(By.xpath("//button[contains(@class,'ist_button ist_button_red')]")).click();

        //delete
        driver.findElement(By.xpath("//button[contains(@class,'q-PolHQBMEHmpVzKzPeWWA==')]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Eliminar proyecto')]")).click();
        //driver.findElement(By.xpath("//button[contains(@class,'a8af2163 _3d1243b2 _352995bd f9408a0e _56a651f6')]")).click();
        driver.findElement(By.cssSelector("button[type='submit']")).click();

    }
}
