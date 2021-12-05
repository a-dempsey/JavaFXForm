package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    private static final TextField userField = new TextField();
    private final TextField passwordField = new TextField();
    private final Text errorMessage = new Text();

    GridPane grid = new GridPane();
    Label email = new Label("Email:");
    Label password = new Label("Password:");

    @Override
    public void start(Stage stage) throws Exception{
      //  Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        stage.setTitle("Join Us Today!");
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(5);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        Scene scene = new Scene(grid, 400, 375);

        Text title = new Text("Sign Up For Free");
        title.setFont(Font.font("Times New Roman", 22));

        grid.add(title, 0, 0, 3, 1);
        grid.add(email, 0, 1);
        grid.add(userField, 1, 1);
        grid.add(password,0,2);
        grid.add(passwordField, 1, 2);

        Button createAccountButton = new Button("Create Account");
        HBox box = new HBox(20);
        box.getChildren().add(createAccountButton);
        box.setAlignment(Pos.BOTTOM_RIGHT);
        grid.add(box, 1, 4);
        grid.add(errorMessage, 1, 6);


        stage.setScene(scene);
        stage.show();

    }

    public static boolean emailChecker(){
        String username = userField.getText();
        final String emailFormat = "^[[a-z][A-Z][0-9]-_+]*[[a-z][A-Z][0-9]-_]@([[a-z][A-Z][0-9]]+.)+[[a-z][A-Z][0-9]]+[[a-z][A-Z][0-9]]$";

        return username.matches(emailFormat);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
