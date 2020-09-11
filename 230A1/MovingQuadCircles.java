//UPI: 676219530
import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;

public class MovingQuadCircles extends MovingCircle{
    
    public MovingQuadCircles(){
        x=0;
        y=0;
        width=50;
        height=50;
        borderColor=Color.pink; 
        fillColor=Color.blue;
        path=new BouncingPath(1, 2);
    }
    
    public MovingQuadCircles(int x, int y, int w, int mw, int mh, Color boader, Color fill, int num){
        this.x = x;
        this.y = y;
        width =w;
        height = w;
        marginWidth = mw;
		marginHeight = mh;
        borderColor = boader;
        fillColor = fill;
        super.setPath(num);
    }
    
    public void draw(Graphics g){
        int width2 = (int)(width/2);
        int height2 = (int)(height/2);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(borderColor);
        g2d.drawOval(x, y, width2, height2);
        g2d.drawOval(x+width2/2, y-height2/2, width2, height2);
        g2d.drawOval(x+width2, y, width2,height2);
        g2d.drawOval(x+width2/2, y+height2/2, width2, height2);

        Ellipse2D.Double e1 = new Ellipse2D.Double(x, y, width2, height2);//left
        Ellipse2D.Double e2 = new Ellipse2D.Double(x+width2/2, y-height2/2, width2, height2);//top
        Ellipse2D.Double e3 = new Ellipse2D.Double(x+width2, y, width2,height2);//right
        Ellipse2D.Double e4 = new Ellipse2D.Double(x+width2/2, y+height2/2, width2, height2); //bottom

        g2d.setColor(fillColor);
        Area a1 = new Area(e1);
        Area a2 = new Area(e2);
        Area a3 = new Area(e3);
        Area a4 = new Area(e4);
        a1.intersect(new Area(e2));
        g2d.fill(a1);

        a4.intersect(new Area(e1));
        g2d.fill(a4);

        a2.intersect(new Area(e3));
        g2d.fill(a2);

        a3.intersect(new Area(e4));
        g2d.fill(a3);
        

    }
    
}