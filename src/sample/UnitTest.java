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
        String email3 = "example.com";
        String email4 = "emample@example";
        String email5 = "exam2_ple@example.com";
        assertTrue(email1, Main.emailChecker());
        assertFalse(email2, Main.emailChecker());
        assertFalse(email3, Main.emailChecker());
        assertFalse(email4, Main.emailChecker());
        assertTrue(email5, Main.emailChecker());
    }


    @org.junit.Test
    public void testPasswordChecker(){
        String password1 = "example1!";
        String password2 = "ex1!";
        String password3 = "example";
        String password4 = "example1";
        String password5 = "example@!";
        String password6 = "EXAMPLE65$$$";

        assertTrue(password1, Main.passwordChecker());
        assertFalse(password2, Main.passwordChecker());
        assertFalse(password3, Main.passwordChecker());
        assertFalse(password4, Main.passwordChecker());
        assertFalse(password5, Main.passwordChecker());
        assertTrue(password6, Main.passwordChecker());

    }
}