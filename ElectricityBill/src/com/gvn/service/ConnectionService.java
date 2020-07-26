package com.gvn.service;

import com.gvn.eb.exception.*;
import com.gvn.eb.entity.*;

public class ConnectionService {

	public boolean validate(int currentReading, int previousReading, String type) throws InvalidReadingException,InvalidConnectionException 
	{//System.out.println("-2");
		if(currentReading< previousReading ||  previousReading<0 || currentReading<0) {
			throw new InvalidReadingException("InvalidReading");
		}
		else if(!type.equals("Commercial") && !type.equals("Domestic")) {//System.out.println("-3");
			throw new InvalidConnectionException("InvalidConnection");
		}
		else {
			return true;
		}
	}
	
	public float calculateBillAmt(int currentReading, int previousReading, String type) {
		boolean x;
		//System.out.println("-1");
		try {
			//System.out.println("-1");
		x= validate(currentReading,previousReading,type);
		}catch(InvalidReadingException e) {
			return -1;
		}catch(InvalidConnectionException e) {
			return -2;
		}
		
		if(type.equals("Domestic")) {
			
			float[] slabs = {2.3f, 4.2f, 5.5f};
			Domestic d = new Domestic(currentReading,previousReading,slabs);
			return d.computeBill();
		}
		else {
			 
			float[] slabs = {5.2f, 6.8f, 8.3f};
			Commercial c = new Commercial(currentReading,previousReading,slabs);
			return c.computeBill();
		}
	}
	
	public String generateBill(int currentReading, int previousReading, String type) {
		float f;
		f= calculateBillAmt(currentReading,previousReading,type);
		if(f==-1)
			return "Incorrect Reading";
		else if(f==-2)
			return "Invalid Connection Type";
		else
			return "Amount to be paid: "+f;
	}
}
