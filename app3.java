/*
<applet code="app3" height="400" width="400">
</applet> 
*/
import java.applet.*;
import java.awt.*;

public class app3 extends Applet
{
	
	
		int y=0;
		boolean flag=true;
		public void paint(Graphics g)
		{
			g.fillOval(150,y,75,75);
			
			
			if(flag==false&&y!=0)
			{
				y--;
			}
			else if(flag==true&&y<325)
			{
				y++;
			}
			else if(y==325)
			{
				flag=false;
			}
			else if (flag==false&&y==0)
			{
				
				flag=true;
			}
			
			try
			{
				Thread.sleep(30);
			}
			catch(Exception e)
			{}
			repaint();
			
		}
		
}