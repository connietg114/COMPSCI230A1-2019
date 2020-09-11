//UPI: 676219530
import java.awt.*;
public class MovingSquare extends MovingRectangle{
    
    public MovingSquare(){
        x=0;
        y=0;
        width=50;
        height=50;
        borderColor=Color.pink; 
        fillColor=Color.blue;
        path=new BouncingPath(1, 2);
    }
    public MovingSquare(int x, int y, int w, int mw, int mh, Color boader, Color fill, int num){
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
    
    public void setHeight(int height){
        this.height = height;
        width = height;
    }
    public void setWidth(int width){
        height=width;
        this.width = width;
    }
    
    
}