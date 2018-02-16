public class Transaction {
	protected String Date;
	protected Part part;
	protected Customer customer;

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public Part getPart() {
		return part;
	}

	public void setPart(Part part) {
		this.part = part;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
