/*
<applet code="app8" height="400" width="400">
</applet>
*/
import java.applet.*;
import java.awt.*;
public class app8 extends Applet
{
	
 public void paint(Graphics g)
 {
	int a=100;
	int b=100;
	int c=30;
	int d=30;
	for(int i=1;i<=20;i++)
	{
	g.drawOval(a,b,c,d);
	a=a-2;
	b=b-2;
	c=c+4;
	d=d+4;
	try
	{
		Thread.sleep(500);
	}
	catch(Exception e)
	{}
	}
	repaint();
	
 }
}