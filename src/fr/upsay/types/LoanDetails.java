package fr.upsay.types;

public class LoanDetails {
	private String SSN;
	private String loanAmount;
	private String homePrice;
	private Address homeAddress;
	
	
	public LoanDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public LoanDetails(String sSN, String loanAmount, String homePrice, Address homeAddress) {
		super();
		SSN = sSN;
		this.loanAmount = loanAmount;
		this.homePrice = homePrice;
		this.homeAddress = homeAddress;
	}

	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public String getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getHomePrice() {
		return homePrice;
	}
	public void setHomePrice(String homePrice) {
		this.homePrice = homePrice;
	}
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	
	
}
