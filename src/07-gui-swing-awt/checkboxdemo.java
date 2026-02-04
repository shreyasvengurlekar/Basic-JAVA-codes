  import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class checkboxdemo extends JFrame implements ItemListener{

JCheckBox c1,c2,c3;
checkboxdemo()
{
Container cp=getContentPane();
cp.setLayout(new FlowLayout());

c1=new JCheckBox("SWIMMING");
c2=new JCheckBox("READING",true);
c3=new JCheckBox("SINGING");

c1.addItemListener(this);
c2.addItemListener(this);
c3.addItemListener(this);

cp.add(c1);cp.add(c2);cp.add(c3);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void itemStateChanged(ItemEvent ie)
{
repaint();
}

public void paint(Graphics g)
{
super.paint(g);
g.drawString("Checkbox1 is  "+c1.isSelected(),100,200);
g.drawString("Checkbox2 is  "+c2.isSelected(),100,250);
g.drawString("Checkbox3 is  "+c3.isSelected(),100,300);
}
public static void main(String args[])
{
checkboxdemo w=new checkboxdemo();
w.setSize(800,600);
w.setVisible(true);
}
}