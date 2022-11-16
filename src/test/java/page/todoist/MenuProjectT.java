package page.todoist;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class MenuProjectT {

    public Button loadingButton= new Button(By.id("loading"));
    public Button anadirProjectButton = new Button(By.xpath("//button[contains(@aria-label,'Añadir proyecto')]"));
    public TextBox nameProjectTxt= new TextBox(By.id("edit_project_modal_field_name"));
    public Button saveButton = new Button(By.xpath("//button[contains(@class,'ist_button ist_button_red')]"));

    public Button moreActionsButton= new Button(By.xpath("//button[contains(@class,'q-PolHQBMEHmpVzKzPeWWA==')]"));
    public Button editButton = new Button(By.xpath("//div[contains(text(),'Editar proyecto')]"));
    public Button deleteButton = new Button(By.xpath("//div[contains(text(),'Eliminar proyecto')]"));
    public Button deleteModalButton = new Button(By.cssSelector("button[type='submit']"));

}
