package gui;

import java.net.URL;
import java.util.ResourceBundle;

import application.App;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Department;

public class DepartmentListController implements Initializable {

    @FXML
    private TableView<Department> tableViewDepartmentTableView;

    @FXML
    private TableColumn<Department, Integer> TableColumnId;

    @FXML
    private TableColumn<Department, String> TableColumnName;

    @FXML
    private Button btNew;

    @FXML
    public void onBtNewAction() {
        System.out.println("Botao: Novo");

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initializeNodes();
    }

    private void initializeNodes() {
        TableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
        TableColumnName.setCellValueFactory(new PropertyValueFactory<>("name"));

        Stage stage = (Stage) App.getMainScene().getWindow();
        tableViewDepartmentTableView.prefHeightProperty().bind(stage.heightProperty());

    }

}
