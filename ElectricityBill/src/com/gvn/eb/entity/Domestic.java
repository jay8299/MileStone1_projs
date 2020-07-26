package com.gvn.eb.entity;

public class Domestic extends  Connection{

	public Domestic(int currentReading, int previousReading,float slabs[]) {
	   super(currentReading,previousReading,slabs);
	}
	
	public float computeBill(){
		float f= 0;
		float x= currentReading-previousReading;
		if(x>100)
		{
			f=f+50*slabs[0];
			f=f+50*slabs[1];
			x=x-100;
			f=f+x*slabs[2];
		}
		else {
			if(x>50) {
				f=f+50*slabs[0];
				x=x-50;
				f=f+x*slabs[1];
			}
			else {
				f=f+x*slabs[0];
			}
		}
		
		return f;
		
	}
	
}
