import java.io.*;
class converter
{
	int inp;
	int hours;
	int minutes;
	int seconds;	
	int temp;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	void conv() throws Exception
	{
		System.out.print("Enter the number of seconds: ");
		inp=Integer.parseInt(br.readLine());
		if(inp<60 && inp>0)
		{
			System.out.println(inp + "Sec");
		}

		else if(inp>=60 && inp<3600)
		{
			minutes=inp/60;
			seconds=inp%60;
			System.out.println(minutes + "Min " + seconds + "Sec ");
		}
		
		else if(inp>=3600)
		{
		hours=inp/3600;
		temp=inp%3600;
		minutes=temp/60;
		seconds=temp%60;
		System.out.println(hours + "H " + minutes +"Min " + seconds + "Sec " );
		}
	}
	public static void main(String args[]) throws Exception
	{
		converter c=new converter();
		c.conv();

	}
}
