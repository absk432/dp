
public class Transactions extends Account
{
	
	TransInterface deposit = new Deposit();
	TransInterface withdraww = new withdraw();
	
	
	public void getdeposit()
	{
		 deposit.trans();
	}
	public void getwithdraw()
	{
		 withdraww.trans();
	}
	
}
