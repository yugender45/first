import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Week7b extends Frame implements KeyListener
{
    Label l;
    TextArea a;
    Week7b()
    {   
    l=new Label();
    l.setBounds(20,50,100,20);
    a=new TextArea();
    a.setBounds(20,80,300,300);
    a.addKeyListener(this);
    add(l);
    add(a);
    setSize(400,400);
    setLayout(null);
    setVisible(true);
    }
    @Override
    public void keyTyped(KeyEvent e) {
        l.setText("keyTyped");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        l.setText("keyPressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        l.setText("keyReleased");
    }
public static void main(String[] args){
          new Week7b();
      }
}