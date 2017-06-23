/*
<applet code="app" height="400" width="400">
</applet> 
*/
import java.applet.*;
import java.awt.*;

public class app extends Applet
{
	String msg;
	int x;
		public void init()
		{
			msg="Hello World";
			x=10;
			Font f1 = new Font("arial",Font.BOLD,25);
			setFont(f1);
		}
		public void paint(Graphics g)
		{
			g.drawString(msg,x,100);
			x++;
			setBackground(Color.black);
			setForeground(Color.white);
			if(x>400)
			{
				x=0;
			}
			try
			{
				Thread.sleep(30);
			}
			catch(Exception e)
			{
				
			}
			repaint();
		}
		
}