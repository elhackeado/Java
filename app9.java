/*
<applet code="app9" height="400" width="400">
</applet>
*/
import java.applet.*;
import java.awt.*;

public class app9 extends Applet
{
	int flag=0;
	int x=62;
	int y=250;
	
	public void paint(Graphics g)
	{
		g.drawLine(50,200,50,300);
		g.drawLine(50,300,120,300);
		g.drawLine(120,300,120,200);
		g.drawLine(280,300,280,200);
		g.drawLine(280,300,350,300);
		g.drawLine(350,200,350,300);
		
		
		
		g.fillOval(x,y,50,50);
		if(flag==0&&y==150)
		{
			flag=1;
		}
		else if(flag==1&&x==290)
		{
			flag=2;
		}
		else if(flag==2&&y==250)
		{
			flag=4;
		}
		else if(flag==0)
		{
			y--;
		}
		
		else if(flag==1)
		{
			x++;
		}
		
		else if(flag==2)
		{
			y++;
		}
		try 
		{
			Thread.sleep(5);
		}
		catch(Exception e)
		{
			
		}
		repaint();
	}
}