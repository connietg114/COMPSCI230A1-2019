/* UPI: 676219530*/

import java.awt.*;
public class MovingCircle extends MovingEllipse{
    
    public MovingCircle(){
        super();
        setWidth(50);
        /*x=0;
        y=0;
        width=50;
        height=50;
        borderColor=Color.pink; 
        fillColor=Color.blue;
        path=new BouncingPath(1, 2);*/
    }
    
    public MovingCircle(int x, int y, int w, int mw, int mh, Color boader, Color fill, int num){
        super(x, y, w, w, mw, mh, boader, fill, num);
        /*
        this.x = x;
        this.y = y;
        width =w;
        height = w;
        marginWidth = mw;
		marginHeight = mh;
        borderColor = boader;
        fillColor = fill;
        this.setPath(num);
        */
        
    }
    
    public void setHeight(int h){
        height = h;
        width = h;
    }
    
    public void setWidth(int w){
        height=w;
        width = w;
    }
    
}