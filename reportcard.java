import java.io.*;
class reportcard
{
	int physics;
	int chemistry;
	int math;
	int total;
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
	
	void set() throws Exception
	{
		System.out.print("Enter the marks of Physics: ");
		physics=Integer.parseInt(br.readLine());
		System.out.print("Enter the marks of Chemistry: ");
		chemistry=Integer.parseInt(br.readLine());
		System.out.print("Enter the marks of maths: ");
		math=Integer.parseInt(br.readLine());
		total=physics+chemistry+math;
		
	}
	
	void show()
	{
		System.out.println("SUBJECT        MARKS");
		System.out.println("====================");
		System.out.println("PHYSICS        " + physics);
		System.out.println("CHEMISTRY      " + chemistry);
		System.out.println("MATHS          " + math);
		System.out.println("--------------------");
		System.out.println("TOTAL          " + total);
		System.out.println("--------------------");
	}
	
	public static void main(String args[]) throws Exception
	{
		reportcard b[]=new reportcard[3];
		for (int i=0;i<b.length;i++)
		{
			b[i]=new reportcard();
			b[i].set();
		}
		
		for(int i=0;i<b.length;i++)
		{
			b[i].show();
		}
	}
}