import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Week10 extends Applet implements ItemListener{
    int colourNum;
    CheckboxGroup cbg;
    Checkbox red,yellow,green;
    String msg="";
    public void init()
    {
        cbg=new CheckboxGroup();
        red=new Checkbox("RED",cbg,true);
        yellow=new Checkbox("YELLOW",cbg,true);
        green=new Checkbox("GREEN",cbg,true);
        add(red);
        add(yellow);
        add(green);
        red.addItemListener(this);
        yellow.addItemListener(this);
        green.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent ie)
    {
        if(ie.getSource()==red)
            colourNum=1;
        else if(ie.getSource()==yellow)
            colourNum=2;
        else
            colourNum=3;
        repaint();
    }
    public void paint (Graphics g)
    {
        g.setColor(Color.BLACK);
        g.fillOval(150,70, 50, 50);
        g.fillOval(150,150, 50, 50);
        g.fillOval(150,230, 50, 50);
        switch (colourNum)
        {
            case 1: g.setColor (Color.RED);
                    g.fillOval(150,70, 50, 50);
                    msg="STOP";
                    g.drawString(msg,210,100);
                    break;
            case 2: g.setColor (Color.YELLOW);
                    g.fillOval(150,150, 50, 50);
                    g.setColor(Color.RED);
                    msg="READY";
                    g.drawString(msg,210,180);
                    break;
            case 3: g.setColor (Color.GREEN);
                    g.fillOval(150,230, 50, 50);
                    g.setColor(Color.RED);
                    msg="GO";
                    g.drawString(msg,210,260);
                    break;
        
        }
    }
}