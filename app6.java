/*
<applet code="app6" height="400" width="400">
</applet> 
*/
import java.applet.*;
import java.awt.*;

public class app6 extends Applet
{
	
		int x=165;
		int y=0;
		int flag=0;
		
		public void paint(Graphics g)
		{
			g.drawOval(x,y,70,70);
			g.fillOval(x+12,y+15,15,15);
			g.fillOval(x+45,y+15,15,15);
			g.fillOval(x+29,y+29,12,12);
			g.fillOval(x+18,y+45,35,12);
			if(flag==0&&x==0&&y==165)
			{
				flag=1;
							
			}
			else if(flag==1&&x==165&y==330)
			{
				flag=2;
			}
			else if(flag==2&&x==330&&y==165)
			{
				flag=3;
			}
			else if(flag==3&&x==165&y==0)
			{
				flag=0;
			}
			else if(flag==0)
			{
				x--;
				y++;
			}
			else if(flag==1)
			{
				x++;
				y++;
			}
			else if(flag==2)
			{
				x++;
				y--;
			}
			else if(flag==3)
			{
				x--;
				y--;
			}
			
			try
			{
				Thread.sleep(5);
			}
			catch(Exception e)
			{}
			repaint();
			
		}
		
}