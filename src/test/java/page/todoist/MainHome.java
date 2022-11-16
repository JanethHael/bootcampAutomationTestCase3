package page.todoist;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

import java.util.Date;

public class MainHome {

        public Button addTaskButton = new Button(By.xpath("//li/button[contains(@class,'plus_add_button')]"));
        public TextBox nameTaskTxt = new TextBox(By.xpath("//div[@role='textbox']"));
        public TextBox desTaskTxt = new TextBox(By.xpath("//textarea[@aria-invalid='false']"));


        public Button submitButton = new Button(By.xpath("//button[contains(@data-testid,'task-editor-submit-button')"));

        public Button editTaskButton = new Button(By.xpath("//button[contains(@aria-label,'Editar')]"));
        public TextBox nameTaskUpdTxt = new TextBox(By.xpath("//div[@role='textbox']"));
        public TextBox desTaskUpdTxt = new TextBox(By.xpath("//textarea[@aria-invalid='false']"));




}
