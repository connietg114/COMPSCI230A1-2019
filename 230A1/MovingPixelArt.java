//UPI: 676219530
import java.awt.*;
public class MovingPixelArt extends MovingSquare{
    private String[] values= {"1111111111", "1111551111", "1111551111", "1115555111", "1115555111", "1155555511", "1555555551", "1111881111", "1111881111", "1111111111"};
    private Color[] colours= {Color.black, Color.white, Color.red, Color.orange, Color.yellow,Color.green, Color.cyan, Color.blue, Color.gray, Color.DARK_GRAY};
    

    public MovingPixelArt(){
        x=0;
        y=0;
        width = 50;
        height = 50;
        borderColor=Color.pink; 
        fillColor=Color.blue;
        path=new BouncingPath(1, 2);
    }
    public MovingPixelArt(int x, int y, int w, int mw, int mh, Color boader, Color fill, int num){
        
        this.x = x;
        this.y = y;
        width = w;
        height = w;
        marginWidth = mw;
		marginHeight = mh;
        borderColor = boader;
        fillColor = fill;
        super.setPath(num);
    }
    
    public void draw(Graphics g){
        int width2 = (int)(width/10);
        int height2 = (int)(height/10);
        int indexValues = 0;
        int row = y;
        while(indexValues<values.length){
            String s = values[indexValues];
            int column = x;
            int indexS = 0;
            while(indexS<s.length()){
                char c = s.charAt(indexS);
                int numOfColor = Character.getNumericValue(c);
                g.setColor(colours[numOfColor]);
                g.fillRect(column, row, width2, height2);
                
                column=column + width2;
                indexS++;    
            }
            row=row+height2;
            indexValues++;   
        }    
    }
}