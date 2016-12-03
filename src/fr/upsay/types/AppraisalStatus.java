package fr.upsay.types;

public class AppraisalStatus {
	
	private String status;
	private String SSN;
	
	public AppraisalStatus(){
		
	}
	public AppraisalStatus(String status, String sSN) {
		super();
		this.status = status;
		SSN = sSN;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
