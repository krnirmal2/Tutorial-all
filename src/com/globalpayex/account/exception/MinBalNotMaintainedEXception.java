package com.globalpayex.account.exception;

// USER DEFINE EXCEPTION FOR HANDLING COMPILE TIME EXCEPTION

//create compile time exception which force to you try catch block 
// to handle the exception but runtime exception will not force by compiler
public class MinBalNotMaintainedEXception  extends Exception {
	public MinBalNotMaintainedEXception( String Message) {
	
	super(Message);
	}

}
