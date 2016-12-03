package fr.upsay.types;

public class Address {
	private String addr1="";
	private String cityState="";
	private String zip="";
	private String telephone="";
	
	
	public Address(){
		
	}
	public Address(String addr1, String cityState, String zip, String telephone) {
		super();
		this.addr1 = addr1;
		this.cityState = cityState;
		this.zip = zip;
		this.telephone = telephone;
	}
	public String getAddr1() {
		return addr1;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public String getCityState() {
		return cityState;
	}
	public void setCityState(String cityState) {
		this.cityState = cityState;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	
	
}
