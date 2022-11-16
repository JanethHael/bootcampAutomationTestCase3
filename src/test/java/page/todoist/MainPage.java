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
}
