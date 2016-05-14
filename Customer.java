import java.util.*;
public class Customer implements User
{
	int password;
	
	public void setPassword(int password)
	{
		this.password=password;
	}
	
	Scanner sc=new Scanner(System.in);
	Account a=new Account();
	public void update()
	{
		if((a.balance) < 100)
		{
			System.out.println("Minimum Balance should be 100rs");
		}
	}

	public int ResetRequest()
	{
		System.out.println("If you want to reset password,Enter 1");
		int s=sc.nextInt();
		return s;
	}


}


