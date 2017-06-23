/*
<applet code="app5" height="400" width="400">
</applet> 
*/
import java.applet.*;
import java.awt.*;

public class app5 extends Applet
{
	
		int x=165;
		int y=0;
		int flag=0;
		int R;
		int G;
		int B;
		public void paint(Graphics g)
		{
			g.fillOval(x,y,70,70);
			
			Color c1=new Color(R,G,B);
			if(flag==0&&x==0&&y==165)
			{
				flag=1;
				R=(int)(Math.random()*255);
			G=(int)(Math.random()*255);
			B=(int)(Math.random()*255);
				
			}
			else if(flag==1&&x==165&y==330)
			{
				flag=2;
				R=(int)(Math.random()*255);
			G=(int)(Math.random()*255);
			B=(int)(Math.random()*255);
			}
			else if(flag==2&&x==330&&y==165)
			{
				flag=3;
				R=(int)(Math.random()*255);
			G=(int)(Math.random()*255);
			B=(int)(Math.random()*255);
			}
			else if(flag==3&&x==165&y==0)
			{
				flag=0;
				R=(int)(Math.random()*255);
			G=(int)(Math.random()*255);
			B=(int)(Math.random()*255);
			}
			else if(flag==0)
			{
				x--;
				y++;
				setForeground(c1);
			}
			else if(flag==1)
			{
				x++;
				y++;
				setForeground(c1);
			}
			else if(flag==2)
			{
				x++;
				y--;
			setForeground(c1);
			}
			else if(flag==3)
			{
				x--;
				y--;
				setForeground(c1);
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