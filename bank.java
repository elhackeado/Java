class bank
{
int accountno;
String name;
int balance;
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

void set()
{
System.out.print("Enter the account new number : ");
accountno= Integer.parseInt(br.readLine());
System.out.print("Enter the name: ");
name=br.readLine();
System.out.print("Enter the balance: ");
balance= Integer.parseInt(br.readLine);

}



void show() throws Exception

{
System.out.print("Enter your Account number: ");
int a= Integer.parseInt(br.readLine());
if(a==accountno)
{
System.out.println("The account number is" + accountno);
System.out.println("Name: " + name);
System.out.println("balance");
else
{
System.out.print("Invalid Account number !!");
}
}

public static void main(String args[])
{

Bank b1= new ban();
while(true)
{
System.out.println("Welcome to our banking services")
System.out.prinln("=============================")
System.out.println("1. SET");
System.out.println("2. SHOW");
System.out.println(3. EXIT);
System.out.print("CHOOSE ANY ONE OPTION: ");


}






}



}






}
