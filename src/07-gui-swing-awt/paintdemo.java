
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class paintdemo extends JFrame implements ItemListener{

JCheckBox c1,c2,c3;

paintdemo()
{
Container cp=getContentPane();
cp.setLayout(new FlowLayout());
c1=new JCheckBox("SWIMMING");
c2=new JCheckBox("READING",true);
c3=new JCheckBox("Dancing");


c1.addItemListener(this);
c2.addItemListener(this);
c3.addItemListener(this);

cp.add(c1);
cp.add(c2);
cp.add(c3);

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public void itemStateChanged(ItemEvent ie)
{
repaint();
}
public void paint(Graphics g)
{
super.paint(g);
g.drawString("Welcome....",100,100);
g.drawString("Current State of checkbox 1 is "+c1.isSelected(),100,200);
g.drawString("Current State of checkbox 2 is "+c2.isSelected(),100,300);
g.drawString("Current State of checkbox 3 is "+c3.isSelected(),100,400);

}
public static void main(String args[])
{

paintdemo p=new paintdemo();
p.setSize(600,400);
p.setVisible(true);
}
}


