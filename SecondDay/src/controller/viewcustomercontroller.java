package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Customer;

public class viewcustomercontroller {
    public TableView tblCustomer;
    public TableColumn colUserName;
    public TableColumn colPassword;
    public TableColumn colEmail;
    public TableColumn colContactNumber;

    public void btnReloadOnAction(ActionEvent actionEvent) {
        colUserName.setCellValueFactory(new PropertyValueFactory<>("userName"));
        colPassword.setCellValueFactory(new PropertyValueFactory<>("password"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colContactNumber.setCellValueFactory(new PropertyValueFactory<>("contactNumber"));

        ObservableList<Customer> customerObservableList = FXCollections.observableArrayList();
        customerObservableList.add(new Customer("Shaini","1234","shini@gmail.com","0713514360"));
        tblCustomer.setItems(customerObservableList);
    }
}
