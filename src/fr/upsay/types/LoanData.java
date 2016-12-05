package fr.upsay.types;

public class LoanData {

	private BorrowerInformation borrowerInformation;
	private String loanAmount;
	private String homePrice;
	private Address homeAddress;
	
	
	public LoanData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoanData(BorrowerInformation borrowerInformation, String loanAmount, String homePrice, Address homeAddress) {
		super();
		this.borrowerInformation = borrowerInformation;
		this.loanAmount = loanAmount;
		this.homePrice = homePrice;
		this.homeAddress = homeAddress;
	}
	public BorrowerInformation getBorrowerInformation() {
		return borrowerInformation;
	}
	public void setBorrowerInformation(BorrowerInformation borrowerInformation) {
		this.borrowerInformation = borrowerInformation;
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
