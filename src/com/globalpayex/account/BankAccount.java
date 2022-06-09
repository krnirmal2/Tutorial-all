package com.globalpayex.account;

import com.globalpayex.account.exception.MinBalNotMaintainedEXception;

public class BankAccount {

	int accountNum;
	String account_type;
	double balance;

	public BankAccount(int accountNum, String account_type, double balance) {
		this.accountNum = accountNum;
		this.account_type = account_type;
		this.balance = balance;

		// TODO Auto-generated constructor stub

	}

	public  double withdrawl(double amount) throws MinBalNotMaintainedEXception {// throws will declare by the compiler if there is
		// compile time exception create by the user and then 
		// we have to define the class of user exception in other class and create a constructor
		//
		
		// to execute some statement for every time below cases we need to put
		// all this to try and that particular statement in side finally block
		
		try{
			if(amount<=0) {
		
			throw new IllegalArgumentException("the value you have enter is "
					+ "illegal try some other value");
		}
        
		   if (this.balance- amount <1000) {
			   // throw an exception to the caller
			   // throw new IllegalStateException("Balance cannot go below 1000");
			   
			   //compiler check exception
			   throw new MinBalNotMaintainedEXception("balace cannot on bleow 100");
			    
		} 
		   // this below statement will run if above if condition fail
			this.balance -= amount;
			return this.balance;
		}finally {
//			
			System.out.println("Trancaction end");
			
		}

	}

	public   double deposite(double amount) {
		 this.balance+=amount;
		 return  this.balance;

	}

}
