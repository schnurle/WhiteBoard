package application;

import Logic.CustomerList;

import java.net.URL;
import java.util.ResourceBundle;

import Logic.Customer;
import Logic.Order;
import Logic.OrderList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Labeled;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;

public class AddOrderController implements Initializable{

    @FXML
    private TextField addAmount;

    @FXML
    private PasswordField addItem;

    @FXML
    private Button addToList;

    @FXML
    private ChoiceBox<CustomerList> chooseCustomer;
    
    private OrderList orderList = new OrderList();
    @FXML
    void handleAddToList(ActionEvent event) {
    	String v1 = addAmount.getText();
    	String v2 = addItem.getText();
    	//String v3 = chooseCustomer.getText();
    	int value1 = Integer.parseInt(v1);
    	String value2 = String.valueOf(v2);
    	//String value3 = String.valueOf(v3);
    	this.orderList.addOrder(value2, value1);
    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}


/*Order orderEntries = new Order(addItem.getText(),
Integer.parseInt(addAmount.getText(),
Integer.parseInt(chooseCustomer.getAccessibleText())));
orderEntries.add(orderEntries);

*/

