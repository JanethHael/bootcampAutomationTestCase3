package page.todoist;

import control.Button;
import control.Label;
import control.TextBox;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Date;

public class MainPage {

    public Label startLoginLabel = new Label(By.xpath("//a[contains(text(),'Iniciar') and @class='Z2j5FoeQ_umI7vX0SmxF Y5eL4cjJHcHaCQ8EbL7V']"));

   /* public Button loadingButton= new Button(By.id("loading"));
    public Button anadirProjectButton = new Button(By.xpath("//button[contains(@aria-label,'Añadir proyecto')]"));
    public TextBox nameProjectTxt= new TextBox(By.id("edit_project_modal_field_name"));
    public Button saveButton = new Button(By.xpath("//button[contains(@class,'ist_button ist_button_red')]"));*/



    /*  driver.findElement(By.xpath("//button[contains(@class,'q-PolHQBMEHmpVzKzPeWWA==')]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Editar proyecto')]")).click();
        driver.findElement(By.id("edit_project_modal_field_name")).sendKeys(nameProject);
        driver.findElement(By.xpath("//button[contains(@class,'ist_button ist_button_red')]")).click();


        driver.findElement(By.xpath("//button[contains(@class,'q-PolHQBMEHmpVzKzPeWWA==')]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Eliminar proyecto')]")).click();

        driver.findElement(By.cssSelector("button[type='submit']")).click();*/
}
