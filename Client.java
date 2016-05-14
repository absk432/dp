import java.util.*;
public class Client 
{
 public static void main(String args[])
 {
	 Admin a=new Admin();
	 User b=new Customer();
	 Customer c=new Customer();
	 Account d=new Account();
	 Transactions t=new Transactions();
	 int option=0;
	 do{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("1. Customer login   2.Admin login");
	 
	 option = sc.nextInt();
	 int cust=0;
	 int adminn=0;
	 switch(option)
	 {
	 case 1: c.setPassword(12345);
	 
	 		do{
	 		System.out.println("1. Check Password \n 2.Balance \n 3.Deposit \n 4.withdraw");
	 		
	 		cust=sc.nextInt();
	 		switch(cust)
	 		{
	 		case 1: System.out.println("Current Password is"+ c.password);
	 				break;
	 		
	 		case 2: System.out.println("Balance is"+ d.balance);
	 			   break;
	 			  
	 		case 3: t.getdeposit();
	 			   break;
	 			   
	 	    case 4: t.getwithdraw();
	 			   break;
	 		}
	 		}while(cust < 5);
	 		
	 		break;
	 		
	 
	 
	 
	 
	 		 
	 case 2:
		 
		 do{
		 	System.out.println("1. Create User \n 2. Delete User \n 3.List of users");
	 		
		 	adminn=sc.nextInt();
	 		 switch(adminn)
	 		 {
	 		 case 1: //c.setPassword(12345);
	 		 
	 			 	 a.Create(c);
	 		 			break;
	 		 case 2: a.Delete(c);
	 		 			break;
	 		 
	 		 case 3: System.out.println("List of users is:" + a.users);
	 		 			break;
	 		 			
	 		 
	 		 }
	 		 }while(adminn < 4);
	 		 a.NotifyUser();
	 		 break;
	 			
	 }
	 }while(option < 3);
	 
 }
	
}
