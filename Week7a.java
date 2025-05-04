import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Week7a extends Applet implements MouseMotionListener,MouseListener
{
String msg="";
    int mousex=0,mouseY=0;
    public void init()
    {
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    public void mouseClicked(MouseEvent me)
    {
      mousex = 0;
      mouseY=10;
      msg="Mouse Clicked";
      repaint();
    }
    public void mouseEntered(MouseEvent me)
    {
      mousex =0;
      mouseY=10;
      msg="Mouse Entered";
      repaint();  
    }
     public void mouseExited(MouseEvent me)
     {
       mousex =0;
      mouseY=10;
      msg="Mouse Exited";
      repaint(); 
     }
     public void mousePressed(MouseEvent me)
     {
         mousex=me.getX();
         mouseY=me.getY();
         msg="Down";
         repaint();
     }
     public void mouseReleased(MouseEvent me)
     {
         mousex=me.getX();
         mouseY=me.getY();
         msg="Up";
         repaint();    
     }
      public void mouseDragged(MouseEvent me)
      {
         mousex=me.getX();
         mouseY=me.getY();
         msg="*";
         showStatus("Dragging mouse at "+mousex +","+mouseY);
         repaint(); 
      }
public void mouseMoved(MouseEvent me)
{
 showStatus("Moving mouse at "+me.getX()+","+me.getY());  
}   
        public void paint(Graphics g)
        {
            g.drawString(msg,mousex, mouseY);
        }        
}