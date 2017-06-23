/*
<applet code="app2" height="400" width="400">
</applet> 
*/
import java.applet.*;
import java.awt.*;

public class app2 extends Applet
{
	
	
		int y=0;
		
		public void paint(Graphics g)
		{
			g.fillOval(150,y,75,75);
			
			y++;
			if(y>400)
			{
				y=-50;
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