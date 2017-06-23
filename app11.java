/*
<applet code="app10" height="400" width="400">
</applet>
*/
import java.applet.*;
import java.awt.*;

public class app10 extends Applet
{
	String msg1="HELLO";
	String msg2="HII";
	String msg3="WELCOME";
	int x1=10;
	int x2=10;
	int x3=10;
	int y=150;
	int flag=0;
	public void paint(Graphics g)
	{
		
		
		
		
		
		
		if(flag==0&&x1==350)
		{
			flag=1;
			
		}
		else if(flag==1&&x2==350)
		{
			flag=2;
		}
		else if(flag==2&x3==350)
		{}
		else if(flag==0)
		{
		
			
			g.drawString(msg1,x1,y);
			
			g.drawString(msg2,x2,y+30);
			g.drawString(msg3,x3,y+60);
			x1++;
		}
		else if(flag==1)
		{
			
			g.drawString(msg2,x2,y+30);
			
			g.drawString(msg3,x3,y+60);
			
			x2++;
		}
		else if(flag==2)
		{
			
			
			g.drawString(msg3,x3,y+60);
			
			x3++;
		}
		try
		{
			Thread.sleep(10);
		}
		catch(Exception e)
		{
			
		}

		repaint();	
		
		
		
	}
	
}