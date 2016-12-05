package fr.upsay.services;

import fr.upsay.services.composeccs.CreditCheckServiceStub;
import fr.upsay.services.composehas.HomeAppraisalServiceStub;

public class LoanApprovalService {
	
	
	public static void main(String args[]) {
		try{
			
			//Credit Check Service Invocation
			CreditCheckServiceStub checkServiceStub = new CreditCheckServiceStub();
			CreditCheckServiceStub.Ckeck ckeck = new CreditCheckServiceStub.Ckeck();
			CreditCheckServiceStub.BorrowerInformation borrowerInformation = new  CreditCheckServiceStub.BorrowerInformation();
			borrowerInformation.setSSN("66645");
			ckeck.setInformation(borrowerInformation);
			CreditCheckServiceStub.CkeckResponse ckeckResponse = checkServiceStub.ckeck(ckeck);
			String cCStatus = ckeckResponse.get_return().getStatus();
			
			
			
			//Home Appraisal Service invocation
			HomeAppraisalServiceStub appraisalServiceStub = new HomeAppraisalServiceStub();
			HomeAppraisalServiceStub.Ckeck ckeck2 = new HomeAppraisalServiceStub.Ckeck();
			HomeAppraisalServiceStub.LoanDetails loanDetails = new HomeAppraisalServiceStub.LoanDetails();
			loanDetails.setSSN("6645");
			loanDetails.setHomePrice("10000");
			loanDetails.setLoanAmount("90000");
			ckeck2.setDetails(loanDetails);
			HomeAppraisalServiceStub.CkeckResponse ckeckResponse2 = appraisalServiceStub.ckeck(ckeck2);
			String hASStatus = ckeckResponse2.get_return().getStatus();
			
			if(cCStatus.equals("Approved") && hASStatus.equals("Approved") )
				System.out.println("Bail Accepté pour Monsieur : "+loanDetails.getSSN());
			else
				System.out.println("Bail Refusé pour Monsieur : "+loanDetails.getSSN());
			
		}catch(Exception e){e.printStackTrace();}
		
	}

/*	public String getLoan(LoanData loanData) {
		String status="";
		try{
			
			//Credit Check Service Invocation
			CreditCheckServiceStub checkServiceStub = new CreditCheckServiceStub();
			CreditCheckServiceStub.Ckeck ckeck = new CreditCheckServiceStub.Ckeck();
			CreditCheckServiceStub.BorrowerInformation borrowerInformation = new  CreditCheckServiceStub.BorrowerInformation();
			borrowerInformation.setSSN(loanData.getBorrowerInformation().getSSN());
			//borrowerInformation.setAdress(loanData.getBorrowerInformation().getAdress());
			borrowerInformation.setName(loanData.getBorrowerInformation().getName());
			
			ckeck.setInformation(borrowerInformation);
			CreditCheckServiceStub.CkeckResponse ckeckResponse = checkServiceStub.ckeck(ckeck);
			String cCStatus = ckeckResponse.get_return().getStatus();
			
			
			
			//Home Appraisal Service invocation
			HomeAppraisalServiceStub appraisalServiceStub = new HomeAppraisalServiceStub();
			HomeAppraisalServiceStub.Ckeck ckeck2 = new HomeAppraisalServiceStub.Ckeck();
			HomeAppraisalServiceStub.LoanDetails loanDetails = new HomeAppraisalServiceStub.LoanDetails();
			loanDetails.setSSN(loanData.getBorrowerInformation().getSSN());
			loanDetails.setHomePrice(loanData.getHomePrice());
			loanDetails.setLoanAmount(loanData.getLoanAmount());
			
			HomeAppraisalServiceStub.CkeckResponse ckeckResponse2 = appraisalServiceStub.ckeck(ckeck2);
			String hASStatus = ckeckResponse2.get_return().getStatus();
			
			if(cCStatus.equals("Approved") && hASStatus.equals("Approved") )
				status = "Monsieur : "+loanData.getBorrowerInformation().getName()+"Votre demande a été approuvée";
			else
				status = "Monsieur : "+loanData.getBorrowerInformation().getName()+"Votre demande a été rejetée";
			
		}catch(Exception e){e.printStackTrace();}
		
		return status;
		
	}
	
	public static void main(String args[]) {
		Address address = new Address("adr1", "Paris", "75019", "0605797650");
		BorrowerInformation borrowerInformation =new BorrowerInformation("Will Smith", "66645", address);
		LoanData  loanData = new LoanData(borrowerInformation, "100000", "100000", address);
		
	}
*/	
}
