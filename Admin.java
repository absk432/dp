import java.util.ArrayList;


public class Admin 
{
	

public ArrayList <Customer> users;
Account d=new Account();
public void Create(Customer c)
{
	c.setPassword(12345);
	d.balance=0;
	//c.update();
	//c.ResetRequest();
	users.add(c);
	System.out.println("List of users is"+ users);
}

public void Delete(User d)
{
	int userIndex = users.indexOf(d);
	System.out.println("User " + (userIndex+1) + " deleted");
	        users.remove(userIndex);
	        System.out.println("List of users is"+ users);
}

public void ResetPassword(Customer c)
{
	if(c.ResetRequest() == 1)
	{
		c.setPassword(0);
		System.out.println("Password is"+ users);
	}
}

public void NotifyUser()
{

	for(User user : users)
	{
		user.update();
	}
}



}







