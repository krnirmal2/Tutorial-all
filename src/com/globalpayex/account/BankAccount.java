package com.globalpayex.account;

import java.util.Optional;

import com.globalpayex.account.exception.MinBalNotMaintainedEXception;

public class BankAccount {


	// if we need storp the inheritance of the subclasses 
	//that no one can extends the sublclass then use
	// "final " keyword infront of the class
	// also if u want to strop the inheritance class can be override then
	// again use final keywork infront of the method that u want to strop the overridding
	protected int accountNum;// so in  protected member can be access from the subclass of 
	//can be accesesd fro a class withoin the same package (need not be drerived class)
	// ccan be accessed from a class outside the package provided its the derivved class
	private String account_type;
	private double balance;
	public Object getDetails;

	public BankAccount(int accountNum, String account_type, double balance) {
		this.accountNum = accountNum;
		this.account_type = account_type;
		this.balance = balance;

		// TODO Auto-generated constructor stub
		// setBalance(balance);

	}

	//as a convention and to ensure that your javac
	//classes work seamlessly with the frameworks/libraires use
	//1. all instance attributes must have pulbic getter/setter


	// setter method to use the private memeber variable 
	// take value by the user input from the main class

	public void setAccountType(String accountType){
		if(accountType.equals("saving")){
			this.account_type = accountType;
		}
		else{
			throw new IllegalArgumentException("account type must be			             saving or current ");
		}
	}

	// get details of accounttype
	public String getAccountType(){
		return this.account_type;
	}


	

	public void setBalance(double balance) {
		if(balance< 1000){
			throw new IllegalArgumentException("balance must be 1000 or not a negative value");

		}
		else{
		this.balance = balance;
	}
}

	

	public double getBalance() {
		return this.balance;
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
// this below class give null value which may arise null pointer 
// exception 
	// public String getDetails(){
	// 	if (this.accountNum!= null && !this.accountNum.equals("") && this.account_type ! =NullPointerException
	// 	    && this.account_type.equals("")){

	// 			return String.format(("Acc no."), this.accountNum);
	// 		}
	// 		return null;
	// }

	
// solution of the above problem
//optional interface never return null so 
	public Optional<String> getDetails(){
		if (this.accountNum != 0 &&  this.account_type != null
		    && !this.account_type.equals("")){

				return Optional.of(String.format(("%s Acc no. %s"), this.accountNum,this.account_type));
			}
			return Optional.empty();
	}

}
