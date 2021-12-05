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
        String email = "example@example.com";
        assertTrue(email, Main.emailChecker());

    }}