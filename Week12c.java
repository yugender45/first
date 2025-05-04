import javax.swing.*;
public class Week12c {
    JFrame f;
    Week12c()
    {
        f=new JFrame();
        String data[][]={{"501","ravi","50000"},
                          {"502","raju","70000"},
                          {"503","ramu","90000"}};
        String column[]={"ID","NAME","SALARY"};
        JTable jt=new JTable(data,column);
        JScrollPane sp=new JScrollPane(jt);
        f.add(sp);
        f.setSize(300,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Week12c();
        
    }
        
    }