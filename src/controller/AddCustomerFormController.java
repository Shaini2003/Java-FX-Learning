package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class AddCustomerFormController {

    @FXML
    private TextField txtUserName;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtContactNumber;

    List<Customer> customerList = new ArrayList<>();

    @FXML
    void btnAdd(ActionEvent event) {


        customerList.add(
                new Customer(txtUserName.getText(),
                        txtPassword.getText(),
                        txtEmail.getText(),
                        txtContactNumber.getText()

                )
        );
        System.out.println("-------------------------------------------------------------------------");
        customerList.forEach(cus ->{
            System.out.println(cus);

        });
        System.out.println("-------------------------------------------------------------------------");


    }

    @FXML
    void btnDelete(ActionEvent event) {

    }

    @FXML
    void btnSubmit(ActionEvent event) {

    }

    @FXML
    void btnUpdate(ActionEvent event) {

    }

}

