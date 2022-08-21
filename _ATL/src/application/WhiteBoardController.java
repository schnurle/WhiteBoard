package application;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

import Logic.Order;
import Logic.OrderList;
import Logic.CustomerList;
import Logic.Customer;

public class WhiteBoardController implements Initializable {

    @FXML
    private Button AddOrderButton;

    @FXML
    private TableView<Order> OrderList;

    @FXML
    private TableColumn<Order, Integer> amount;

    @FXML
    private TableColumn<Order, Integer> customerNR;

    @FXML
    private TableColumn<Order, String> customerName;

    @FXML
    private TableColumn<Order, String> item;

    @FXML
    void handleAddOrderButton(ActionEvent event) {
    	try {
    		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/application/AddOrder.fxml"));
    		Parent root1 = (Parent) fxmlLoader.load();
    		Stage stage = new Stage();
    		stage.setScene(new Scene(root1));  
    		stage.show();
    	} catch(Exception e) {
			e.printStackTrace();

    	}

    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		amount.setCellValueFactory(data -> new SimpleObjectProperty<Integer>(data.getValue().getAmount()));
		customerNR.setCellValueFactory(data -> new SimpleObjectProperty<Integer>(data.getValue().getAmount()));
		customerName.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getCustomerName()));
		item.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getItem()));

	}
    
}
