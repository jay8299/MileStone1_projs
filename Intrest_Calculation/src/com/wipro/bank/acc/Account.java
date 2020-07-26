package com.wipro.bank.acc;

public abstract class Account {

	int tenure;
	float principal;
	float rateOfIntrest;
	
	public void setIntrest(int age, String gender)
	{
		if(gender.equals("Male"))
		{
            if(age<60)
            {
            	rateOfIntrest = 9.8f;
            }else {
            	rateOfIntrest = 10.5f;
            }
		}
		else
		{
			if(age<58)
			{
				rateOfIntrest = 10.2f;
			}else {
				rateOfIntrest = 10.8f;	
			}
		}
	}
	
	public float calculateMaturityAmount(float totalPrincipalDeposited, float maturityIntrest)
	{
		return totalPrincipalDeposited+maturityIntrest;
	}
	
	public abstract float calculateIntrest();
	
	public abstract float calculateAmountDeposited();
}
