import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class mywindow extends JFrame implements ActionListener{
JTextField t1;
JButton hide,show;

mywindow()
{
Container cp=getContentPane();
cp.setBackground(Color.CYAN);
cp.setLayout(new FlowLayout());

 t1=new JTextField(20);
 hide=new JButton("HIDE");
 show=newJButton("SHOW");
hide.addActionListener(this);
show.addActionListener(this);

cp.add(t1);
cp.add(hide);
cp.add(show);

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==hide)
{
t1.setVisible(false);
}
else{
t1.setVisible(true);
}
}
}

class mywindowdemo{
public static void main(String args[])
{
mywindow w=new mywindow();
w.setSize(600,400);
w.setVisible(true);
}
}