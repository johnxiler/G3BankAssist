package BankAccount;

public class Account 
{
    private double balance;
    private long accNum;
    private String accHolder;
     
     public Account(String name, long num)
     {
         setAccHolder(name);
         setAccNum(num);
         balance = 0.00;
    	 System.out.println("Account Created");
   
    }
     
     
     public void deposit(double amt)
     {
    	 balance = balance + amt;
    	 System.out.println("Amount Deposited.");
     }
     
     public void withdraw(double amt) throws BankAccountException
     {
    	 try
    	 { 
    	    if(balance >= amt)
    	    {
    		    balance = balance - amt;
        	    System.out.println("Amount Withdrawn");
    	    }
    	    else
    	    {
    		    throw new BankAccountException("Could not Withdraw: Insufficent Amount.");
    	    }
    	 }
    	 catch(BankAccountException bae)
    	 {
              bae.printStackTrace();
         }
     }
     
     public void printBalance()
     {
    	 System.out.println("Current balance: " + balance);    	 
     }
     public double getBalance()
     {
         return balance;
     }

	/**
	 * @return the accNum
	 */
	public long getAccNum() {
		return accNum;
	}

	/**
	 * @param accNum the accNum to set
	 */
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	/**
	 * @return the accHolder
	 */
	public String getAccHolder() {
		return accHolder;
	}

	/**
	 * @param accHolder the accHolder to set
	 */
	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}
}

