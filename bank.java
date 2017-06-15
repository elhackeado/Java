import java.io.*;
class bank
{
	int account;
	String name;
	int balance;
	
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	
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
	
	
	public static void main(String args[]) throws Exception
	{
		bank a= new bank();
		bank b[] = new bank[3];
		int i;
		for(i=0;i<b.length;i++)
		{
			b[i]= new bank();
			b[i].set();
		}
		    
		System.out.print("Enter any number::");
		int inp= Integer.parseInt(a.br.readLine());
		i=inp;
		b[i].show();
	
	
	}
	
}
