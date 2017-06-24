/*<applet code="app12" height="800" width="800">
</applet>
*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*; 

public class app12 extends Applet implements MouseListener
{
	int x1=100;
	int flag1=0;
	int t1=130;
	int t2=130;
	int t3=150;
	int y=0;
	String msg="SCORE";
	int score=0;
	boolean flag2=true;
	public void init()
	{
		addMouseListener(this);	
	}
	
	public void mouseClicked(MouseEvent me)
	{       
			int xpos=me.getX();
			int ypos=me.getY();
			if(xpos>=0&&xpos<=100&&ypos>=350&&ypos<=450)
			{
				flag1=1;
			}
			
	}
	public void mousePressed(MouseEvent me)
	{
		
	}
	
	public void mouseEntered(MouseEvent me)
	{
		
	}
	public void mouseExited(MouseEvent me)
	{
		
	}
	public void mouseReleased(MouseEvent me)
	{
		
	}
	public void paint(Graphics g)
	{   g.setColor(Color.red); 
		g.fillRect(0,350,100,100);
		g.setColor(Color.yellow);
		g.fillRect(100,375,50,50);
		g.setColor(Color.blue);

		g.fillRect(x1,385,30,30);
		int xpoints[] = {t1, t2, t3};
        int ypoints[] = {385, 415, 400};
        int npoints = 3;

    g.fillPolygon(xpoints, ypoints, npoints);
	g.drawString(msg+" = " + "" + score,10,10);
	
	
	//BULLET FIRED
  	
	try {
	
	//if(t3>=700&&t3<=780)
	//{
	//	score=score+10;
	//}
	
	
	if(flag1==1&&x1==700)
	{
		flag1=0;
	}
	if(flag1==1)
	{
		x1++;
		t1++;
		t2++;
		t3++;
	}
	if(flag1==0)
	{
		x1=100;
		t1=130;
		t2=130;
		t3=150;
	}
	
	//MOVING BALL
	
	g.fillOval(700,y,80,80);
			
			
			if(flag2==false&&y!=0)
			{
				y--;
			}
			if(flag2==true&&y<720)
			{
				y++;
			}
			if(y==720)
			{
				flag2=false;
			}
			if (flag2==false&&y==0)
			{
				
				flag2=true;
			}
	Thread.sleep(5);
	}
	catch(Exception e)
	{
		
	}
	
		
	repaint();
	}
	
}