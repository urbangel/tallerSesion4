package testClean;

import activity.whenDo.CreateTaskScreen;
import activity.whenDo.MainScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import session.Session;

import java.net.MalformedURLException;

public class CreateTaskWhenDo {
    MainScreen mainScreen = new MainScreen();
    CreateTaskScreen createTaskScreen= new CreateTaskScreen();
    @BeforeEach
    public void openApp(){}

    @Test
    public void createTask() throws MalformedURLException {
        mainScreen.addTask.click();
        createTaskScreen.titleTextBox.typeText("Nota1");
        createTaskScreen.noteTextBox.typeText("esta es una description de nota");
        createTaskScreen.saveButton.click();

        String expectedResult="Nota1";
        String actualResult=mainScreen.firstTak.getValue();
        Assertions.assertEquals(expectedResult,actualResult,"NO se creo la tarea");
    }

    @AfterEach
    public void closeApp() throws MalformedURLException {
        Session.getSession().closeSession();
    }
}

