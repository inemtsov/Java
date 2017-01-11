
import javax.swing.*;
import java.awt.*;
/**
 *The DrawSquaresProgram class is an applet that draw squares - one square on the corner of each square. 
 * @author nemtsovilya
 */
public class DrawSquaresProgram extends JApplet {

    /**
     * init method.
     */
    public void init() {
        //set background color to white.
        getContentPane().setBackground(Color.white);
        setSize(500, 500);
    }

    /**
     * paint method
     * @param g  the applet's graphics object.
     */
    public void paint(Graphics g)
    {
        //call the superclass paint method.
        super.paint(g);
        
        //set the line color
        g.setColor(Color.blue);
        
        // x and y starting points of squares
        int x = 200, y = 200;
        //max size of square
        int maxSize = 200;
        //radius of square
        int r =maxSize/2;
        //min size of square
        int MinSize = 10;
        
        tryDrawSquare(g, x, y, maxSize, MinSize, r);
    }
       //method that draw squares  
      private void tryDrawSquare(Graphics g, int xCor,int yCor,int MaxSquareSize,int minSquareSize,int rad)
      {
           
          int x = xCor, y = yCor, maxSize = MaxSquareSize, minSize = minSquareSize, r = rad;
 
          if(maxSize>=minSize)
          {
              //drawing rectangle(in our case it's Square)
             g.drawRect(x, y, maxSize, maxSize); 
          
             //calling recursively method tryDrawSquare to draw squares at each corner.
             tryDrawSquare(g, x-r/2, y-r/2, maxSize-r, minSize, r/2);
             tryDrawSquare(g, x+r+r/2, y-r/2, maxSize-r, minSize, r/2);
             tryDrawSquare(g, x+r+r/2, y+r+r/2, maxSize-r, minSize, r/2);
             tryDrawSquare(g, x-r/2, y+r+r/2, maxSize-r, minSize, r/2);
          }
      }
  }

