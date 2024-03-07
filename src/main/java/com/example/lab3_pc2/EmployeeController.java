package com.example.lab3_pc2;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

public class EmployeeController implements Initializable {
    @FXML
    private TableView<employee> tableView;
    @FXML
    private TableColumn<employee,Integer > id;
    @FXML
    private TableColumn<employee, String> name;
    @FXML
    private TableColumn<employee,Integer> Salary;
    ObservableList<employee> list = FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        id.setCellValueFactory(new
                PropertyValueFactory<employee,Integer>("id"));
        name.setCellValueFactory(new
                PropertyValueFactory<employee,String>("name"));
        room.setCellValueFactory(new
                PropertyValueFactory<employee,Integer>("Salary"));
        tableView.setItems(list);
    }
    @FXML
    protected void onHelloButtonClick() {
    }