package controller;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class DashFormController {

    @FXML
    void btnAddCustomerOnAction(ActionEvent event) {

    }

    @FXML
    void btnViewAllOnAction(ActionEvent event) {

    }

    public void btnAddCustomerOnAction(javafx.event.ActionEvent actionEvent) {
        Stage stage=new Stage();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/add_customer_form.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void btnViewAllOnAction(javafx.event.ActionEvent actionEvent) {
        Stage stage=new Stage();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/viewCustomer.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

