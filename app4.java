/*
<applet code="app4" height="400" width="400">
</applet> 
*/
import java.applet.*;
import java.awt.*;

public class app4 extends Applet
{
	
		int y=0;
		int x=165;
		int flag=1;
		public void paint(Graphics g)
		{
			g.fillOval(x,y,70,70);
			
			
			if(flag==1&&y<165&&x>0)
			{	
				y++;
				x--;
			}
			
			else if(flag==1&&x==0&&y==165)
			{
				flag=2;
			
			}
			else if(flag==2&&x<165&&y<330)
			{
				x++;
				y++;
			}
			else if(flag==2&&x==165&&y==330)
			{
				flag=3;
			}
			else if (flag==3&&x<330&&y<165)
			{
				y--;
				x++;
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