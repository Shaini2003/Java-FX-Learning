package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SampleController {
    public Label lblHelloWorld;
    public TextField txtUserName;
    public TextField txtPassword;

    public void btnSubmitOnAction(ActionEvent actionEvent) {
        String userName = txtUserName.getText();
        String password = txtPassword.getText();
        System.out.println("User Name: "+userName);
        System.out.println("Password: "+password);

    }
}
