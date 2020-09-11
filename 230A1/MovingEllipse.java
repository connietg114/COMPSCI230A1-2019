//UPI: 676219530

import java.awt.*;
public class MovingEllipse extends MovingShape{
    
    public MovingEllipse(){
        x=0;
        y=0;
        width=100;
        height=50;
        borderColor=Color.pink; 
        fillColor=Color.blue;
        path=new BouncingPath(1, 2);
    }
    public MovingEllipse(int width){
        this.width = width;
        height = width;
    }
    public MovingEllipse(int x, int y, int w, int h, int mw, int mh, Color boader, Color fill, int num){
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
        g.drawOval(x, y, width, height);
        
        g.setColor(fillColor);
        g.fillOval(x, y, width, height);
        
    }
    
    public double getArea(){
        return Math.PI*width/2*height/2;
    }
    public boolean contains(Point p){
        double x = p.getX();
        double y = p.getY();
        double centreX = this.x+width/2;
        double centreY = this.y+height/2;
        double eq1 = Math.pow(x-centreX,2)/Math.pow((width/2),2);
        double eq2 = Math.pow(y-centreY,2)/Math.pow((height/2),2);
        
        return eq1+eq2<=1;
        
    
    }
}