/*
<applet code="app1" height="400" width="400">
</applet> 
*/
import java.applet.*;
import java.awt.*;

public class app1 extends Applet
{
	int x;
	int y;
		
		public void paint(Graphics g)
		{
			g.drawOval(x,y,100,50);
			x=(int)(Math.random()*299);
			y=(int)(Math.random()*349);
			try
			{
				Thread.sleep(300);
			}
			catch(Exception e)
			{}
			repaint();
		}
		
}