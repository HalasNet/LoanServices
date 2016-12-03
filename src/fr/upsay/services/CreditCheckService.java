package fr.upsay.services;

import fr.upsay.types.BorrowerInformation;
import fr.upsay.types.CreditCheckStatus;

public class CreditCheckService {
	public CreditCheckStatus ckeck(BorrowerInformation information){
		String status;
		if(information.getSSN().startsWith("6"))
			status = "Approved";
		else
			status = "Denied";
		
		CreditCheckStatus checkStatus = new CreditCheckStatus(status, information.getSSN());
		return checkStatus;
	}
}
