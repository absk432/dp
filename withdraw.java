
import java.util.Scanner;


public class withdraw implements TransInterface
{
	 
	public void trans() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Amount to be Withdrawn");
		int amount=sc.nextInt();
		Account a=new Account();
		int r=(a.balance) - amount;
		a.setbalance(r);
		int z=a.getbalance();
		System.out.println("Current Balance is"+ z);
	}
}	