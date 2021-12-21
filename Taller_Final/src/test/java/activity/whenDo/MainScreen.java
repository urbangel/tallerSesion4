package activity.whenDo;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class MainScreen {
    public Button addTask= new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
    public Label firstTak= new Label(By.id("com.vrproductiveapps.whendo:id/home_list_item_text"));

    public MainScreen(){}

    public boolean isDisplayedTask(String nameTask){
        Label task= new Label(By.xpath("//android.widget.TextView[@text='"+nameTask+"']"));
        return task.isDisplayedControl();
    }
}