package com.gvn.eb.main;

import com.gvn.service.*;

public class EBMain {

	public static void main(String a[]) { 

	System.out.println(new ConnectionService().generateBill(130,100,"Commercial"));
	System.out.println(new ConnectionService().generateBill(220,100,"Commercial"));
	System.out.println(new ConnectionService().generateBill(220,100,"Domestic"));
	System.out.println(new ConnectionService().generateBill(130,100,"D"));
	System.out.println(new ConnectionService().generateBill(130,100,"C"));

	} 
	
}
