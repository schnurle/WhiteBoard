package Logic;

public class Customer extends CustomerList {

	private int CustomerNR;
	private String CustomerName;
	
	
	
	public Customer(int customerNR, String customerName) {
		super();
		this.CustomerNR = customerNR;
		this.CustomerName = customerName;
	}
	public int getCustomerNR() {
		return CustomerNR;
	}
	public void setCustomerNR(int customerNR) {
		CustomerNR = customerNR;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	
	
	
}
