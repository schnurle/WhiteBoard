package Logic;

import java.util.ArrayList;


public class CustomerList{
	
	//Customer customer = new Customer();
	private ArrayList<Customer> customerArray = new ArrayList<Customer>();
	public void customer() {
		
		Customer VSP = new Customer(1 ,"VSP");
		Customer Kantonsspital = new Customer (2, "Kantonsspital");
		
		
		customerArray.add(VSP);
		customerArray.add(Kantonsspital);
	}
	
	public ArrayList<Customer> getCustomerArray(){
		return customerArray;
	}
}	
	

