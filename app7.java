/*
<applet code="app7" height="400" width="400">
</applet> 
*/
import java.applet.*;
import java.awt.*;

public class app7 extends Applet
{
	int x;
	int y;
		
		public void paint(Graphics g)
		{
			g.drawOval(x,y,70,70);
			g.fillOval(x+12,y+15,15,15);
			g.fillOval(x+45,y+15,15,15);
			g.fillOval(x+29,y+29,12,12);
			g.fillOval(x+18,y+45,35,12);
			x=(int)(Math.random()*299);
			y=(int)(Math.random()*349);
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{}
			repaint();
		}
		
}