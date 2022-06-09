import com.globalpayex.account.BankAccount;
import com.globalpayex.account.exception.MinBalNotMaintainedEXception;

public class RunBank {
	
	public static void main(String[] args) {
		BankAccount b = new BankAccount(345, "saving", 10000);
//		System.out.println(b.withdrawl(9500));
//		System.out.println(b.deposite(4555));
		
		
		// if the user not define the catch block for every exception then 
		// JVM will return throw the exception from his side
		
		// if we want to differentiate between JVM and catch thrown by the user
		// just commented the statements that user have written in the exception
		// in JVM user comment or print will not display but user cathc block
		// they will run
		// also we can write in a single catch block using Exception general class
		// which help to catch all the exception but readability of debugging will 
		// decrease
		
		/*try {
			System.out.println(b.withdrawl(900));
		}catch(IllegalStateException e) {
			//getMessage help to print the massage that you have write in thrown block
			// for user 
			System.out.println(e.getMessage());
			
			//this below stack trace will show from where the problem has been started
			e.printStackTrace();
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}*/
		
		
		// this try catch block will force by the compiler to handle the compile time 
		// exception handling unlike the above try catch which was the define by the 
		// user in runtime exception like(illegalstateexception, illegalargumentexception)
		try {
			System.out.println(b.withdrawl(900));
		} catch (MinBalNotMaintainedEXception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
