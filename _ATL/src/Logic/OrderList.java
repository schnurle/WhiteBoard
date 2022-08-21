package Logic;

import java.util.ArrayList;

public class OrderList {
	
	private ArrayList<Order> orderEntries = new ArrayList<Order>();
	
	public void addOrder(String value2, int value1) {
		Order order = new Order(value2, value1);
		this.orderEntries.add(order);
	}

	public ArrayList<Order> getOrder() {
		return orderEntries;
	}

	

		

	
}
