import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class Week12b {
    JFrame f;
    Week12b()
    {
        f=new JFrame();
        DefaultMutableTreeNode style=new DefaultMutableTreeNode("Style");
        DefaultMutableTreeNode color=new DefaultMutableTreeNode("Color");
        DefaultMutableTreeNode font=new DefaultMutableTreeNode("Font");
        style.add(color);
        style.add(font);
        DefaultMutableTreeNode red=new DefaultMutableTreeNode("red");
        DefaultMutableTreeNode blue=new DefaultMutableTreeNode("blue");
        DefaultMutableTreeNode green= new DefaultMutableTreeNode("green");
        color.add(red);
        color.add(blue);
        color.add(green);
        JTree jt=new JTree(style);
        f.add(jt);
        f.setSize(250,250);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public static void main(String[] args) {
        
            new Week12b();
        }
        
    }
    