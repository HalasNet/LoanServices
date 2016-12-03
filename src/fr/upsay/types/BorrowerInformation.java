package fr.upsay.types;

public class BorrowerInformation {

	private String name="";
	private String SSN="";
	private Address address;
	
	public BorrowerInformation(){
		
	}
	
	public BorrowerInformation(String name, String sSN, Address address) {
		super();
		this.name = name;
		SSN = sSN;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public Address getAdress() {
		return address;
	}
	public void setAdress(Address address) {
		this.address = address;
	}
	
	
}
