package sample;

import javafx.application.Application;
import javafx.stage.Stage;

import static org.junit.Assert.*;

public class UnitTest extends Application{

    @Override
    public void start(Stage stage) throws Exception {

    }

    @org.junit.Test
    public void testEmailChecker(){
        String email1 = "example@example.com";
        String email2 = "EXAMPLE";
        assertTrue(email1, Main.emailChecker());
        assertFalse(email2, Main.emailChecker());

    }}