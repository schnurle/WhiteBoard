package Logic;

import java.util.ArrayList;

import javafx.collections.ObservableList;

public class OrderList {
	
	private ArrayList<Order> orderEntries = new ArrayList<Order>();
	
	public void addOrder(String value2, int value1) {
		Order order = new Order(value2, value1);
		this.orderEntries.add(order);
	}

	public ArrayList<Order> getOrder() {
		return orderEntries;
	}

	public void setOrder(ObservableList<Order> orderEntries) {
		return;
		
	}

	

		

	
}
