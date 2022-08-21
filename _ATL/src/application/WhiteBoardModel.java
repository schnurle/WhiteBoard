package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import Logic.Order;
import Logic.OrderList;
import Logic.CustomerList;
import Logic.Customer;

public class WhiteBoardModel {

	private ObservableList<Order> orderEntries = FXCollections.observableArrayList();
	
	public void setOrderList(OrderList orderList)  {
		this.orderEntries.addAll(orderList.getOrder());
	}
	
	public ObservableList<Order> getOrderEntries() {
		return orderEntries;
	}

	
}
