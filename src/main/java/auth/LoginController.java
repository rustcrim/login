package auth;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    protected void onLoginButtonClick() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // TODO: Authenticate the user
    }

    @FXML
    protected void onSignUpClick() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/login/signup-view.fxml")); // Note the path
            Scene scene = new Scene(fxmlLoader.load());
            Stage signUpStage = new Stage();
            signUpStage.setTitle("Sign Up");
            signUpStage.setScene(scene);
            signUpStage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Always good to print stack trace for exceptions
        }
    }
}
