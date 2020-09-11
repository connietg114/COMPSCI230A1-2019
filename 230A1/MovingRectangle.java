//UPI: 676219530
import javax.swing.*;
import java.awt.*;

public class MovingRectangle extends MovingShape{
    
    
    public MovingRectangle(){
        x=0;
        y=0;
        width=100;
        height=50;
        borderColor=Color.pink; 
        fillColor=Color.blue;
        path=new BouncingPath(1, 2);
    }
    public MovingRectangle(int width){
        this.width = width;
        height = width;
    }
    public MovingRectangle(int x, int y, int w, int h, int mw, int mh, Color boader, Color fill, int num){
        this.x = x;
        this.y = y;
        width =w;
        height = h;
        marginWidth = mw;
		marginHeight = mh;
        borderColor = boader;
        fillColor = fill;
        super.setPath(num);
        
    }

    public void draw(Graphics g){
        g.setColor(borderColor);
        g.drawRect(x, y, width, height);

        g.setColor(fillColor);
        g.fillRect(x, y, width, height);
        
    }
    
    public double getArea(){
        return width*height;
    }
    public boolean contains(Point p){
        return p.getX()>=x && p.getX()<=x+width && p.getY()>=y && p.getY()<=y+height;
    }
}