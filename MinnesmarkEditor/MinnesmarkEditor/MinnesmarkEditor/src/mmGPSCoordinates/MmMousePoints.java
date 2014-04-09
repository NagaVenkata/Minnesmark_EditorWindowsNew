package mmGPSCoordinates;

import java.awt.Point;
import java.awt.Rectangle;

public class MmMousePoints {
	
	int mousePosx,mousePosy;
	private boolean linedrawn;
    private int clickCount=0;
    private int minx,miny,maxx,maxy;
	public MmMousePoints(int pointx,int pointy)
	{
		this.mousePosx=pointx;
		this.mousePosy = pointy;
	}
	
	public MmMousePoints(Point pnt)
	{
		this.mousePosx=pnt.x;
		this.mousePosy = pnt.y;
	}
	
	public void setPosx(int posx)
	{
		this.mousePosx = posx;
	}
	
	public void setPosy(int posy)
	{
		this.mousePosy = posy;
	}
	
	public void setPoint(Point pnt)
	{
		
		this.mousePosx=pnt.x;
		this.mousePosy = pnt.y;
	}
	
	public int getx()
	{
		return this.mousePosx;
				
	}
	
	public int gety()
	{
		return this.mousePosy;
				
	}
	
	public void setLineDrawn(boolean lineDrawn)
	{
		this.linedrawn = lineDrawn;
	}
	
	public boolean getLineDrawn()
	{
		return this.linedrawn;
	}
	
	public void setClickCount()
	{
		clickCount++;
	}
	
	public int getClickCount()
	{
		return clickCount;
	}
	
	public void drawRegion()
	{
		//draw a bounding box around the point added on the map
		this.minx=mousePosx;
		this.miny=mousePosy;
		
		this.maxx=this.mousePosx+24;
		this.maxy=this.mousePosy+15;
	}
	
		
	public boolean isPointInRegion(MmMousePoints pnt)
	{
		/*boolean isPointPresent=false;
		
				
		//simple algorithm to find a mouse click in region
		
		//System.out.println("Entered data "+pnt.getx()+"  "+pnt.gety());
		//System.out.println("mouse pos "+(mousePosx-24)+" "+(mousePosy-48)+" "+maxx+" "+maxy);
		
		if(pnt.mousePosx==mousePosx && pnt.mousePosy==mousePosy)
		{
			isPointPresent = true;
			return isPointPresent;
		}
		
		if((pnt.mousePosx>=(mousePosx-24) && pnt.mousePosy>=(mousePosy-48)) && (pnt.mousePosx<=maxx && pnt.mousePosy<=maxy))
		{
			isPointPresent = true;
			return isPointPresent;
		}
		else
		{
			return false;
		}*/
		
		int x = this.mousePosx-20;
		int y = this.mousePosy-25;
		
		//double dist = (((x-pnt.mousePosx)*(x-pnt.mousePosx))+((y-pnt.mousePosy)*(y-pnt.mousePosy)));
		
		Rectangle rect = new Rectangle(x,y,40,40);
		
		//System.out.println(" rectangle contains "+ rect.contains(pnt.getPoint()));
		
		if(rect.contains(pnt.getPoint()))
			return true;
		else
			return false;
		
		
		//return isPointPresent;
			
	}
	
	public Point getPoint()
	{
		
		return new Point(mousePosx,mousePosy);
	}

}
