import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class calci extends JFrame implements ActionListener{
JTextField t1,t2,t3;
JButton add,multi,sub,div,exit,clear;

calci()
{
Container cp=getContentPane();
cp.setLayout(new FlowLayout());
JLabel l1=new JLabel("Enter First Number");
t1=new JTextField(10);

JLabel l2=new JLabel("Enter Second Number");
t2=new JTextField(10);

JLabel l3=new JLabel("Result");
t3=new JTextField(10);

add=new JButton("ADD");
sub=new JButton("SUBTRACTION");
multi=new JButton("MULTIPLICATION");
div=new JButton("DIVISION");
clear=new JButton("CLEAR");
exit=new JButton("EXIT");

add.addActionListener(this);
sub.addActionListener(this);
multi.addActionListener(this);
div.addActionListener(this);
clear.addActionListener(this);
exit.addActionListener(this);
Font f=new Font("Times New Roman",Font.BOLD,25);
l1.setFont(f);
l2.setFont(f);
l3.setFont(f);
t1.setFont(f);
t2.setFont(f);
t3.setFont(f);


JPanel jp=new JPanel();
jp.setLayout(new GridLayout(6,2));
jp.add(l1);jp.add(t1);jp.add(l2);jp.add(t2);
jp.add(l3);jp.add(t3);jp.add(add);jp.add(sub);
jp.add(multi);jp.add(div);jp.add(clear);jp.add(exit);

cp.add(jp);

}
public void actionPerformed(ActionEvent ae)
{
int x=Integer.parseInt(t1.getText());
int y=Integer.parseInt(t2.getText());
if(ae.getSource()==add)
{
t3.setText(""+(x+y));
}
else if(ae.getSource()==multi)
{
t3.setText(""+(x*y));
}

}
}

class calculator{
public static void main(String args[])
{
calci c=new calci();
c.setSize(600,400);
c.setVisible(true);
}
}
