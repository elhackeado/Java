import java.io.*;
class bank
{
	int account;
	String name;
	int balance;
	int input;
	
	static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	
	void set() throws Exception
	{
		System.out.print("Enter the account number: ");
		account= Integer.parseInt(br.readLine());
		System.out.print("Enter the name: ");
		name= br.readLine();
		System.out.print("Enter the balance: ");
		balance= Integer.parseInt(br.readLine());
	}
	
	void show() throws Exception
	{
		
		System.out.println("Account Number: "+account);
		System.out.println("Name: " + name);
		System.out.println("Balance: " + balance);
		
	}
	
	void deposit() throws Exception
	{
		System.out.println("Enter the account number: ");
		input= Integer.parseInt(br.readLine());
		
	}
	
	
	public static void main(String args[]) throws Exception
	{
		
		bank b[] = new bank[3];
		for(int i=0;i<b.length;i++)
		{
			b[i]= new bank();
			b[i].set();
		}
		while(true)    
		{
		System.out.print("Enter Your Acount Number::");
		int inp= Integer.parseInt(br.readLine());
		for(int i=0;i<b.length;i++)
		{
		if(inp==b[i].account)
			b[i].show();
		
		}
		}
		
	
	}
	
}
