package fr.upsay.services;

import fr.upsay.types.AppraisalStatus;
import fr.upsay.types.LoanDetails;

public class HomeAppraisalService {
	public AppraisalStatus validate(LoanDetails details){
		String status;
		if( Double.parseDouble(details.getLoanAmount()) <  Double.parseDouble(details.getHomePrice()) )
			status = "Approved";
		else
			status = "Denied";
		
		AppraisalStatus appraisalStatus = new AppraisalStatus(status, details.getSSN());
		return appraisalStatus;
	}

}
