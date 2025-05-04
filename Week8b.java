import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Week8b extends Applet implements ActionListener
{
   Button b1,b2;
   Label l1,l2;
   TextField tf1,tf2;
   public void init()
   {
   b1=new Button("Compute");
   b2= new Button("Claer");
   b1.addActionListener(this);
   b2.addActionListener(this);
   tf1=new TextField(20);
   tf2=new TextField(20);
   l1=new Label("number");
   l2=new Label("Result");
   add(l1);
   add(tf1);
   add(b1);
   add(l2);
   add(tf2);
   add(b2);
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
        int  n=Integer.valueOf(tf1.getText());
        int fact=1;
        for(int i=1;i<=n;i++)
        fact*=i;
        tf2.setText(" "+fact);
        }
        else
        {
        tf1.setText(" ");
        tf2.setText(" ");
        
        }
        
    }
    
}
