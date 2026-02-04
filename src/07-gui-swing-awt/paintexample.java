import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class paintexample extends JFrame{
paintexample()
{
setForeground(Color.RED);
}

public void paint(Graphics g)
{
super.paint(g);
g.drawString("Welcome to SWING Programming",100,100);
g.drawRect(100,150,150,200);
g.fillRect(250,150,300,200);
g.drawLine(400,100,600,200);
}
public static void main(String args[])
{
paintexample p=new paintexample();
p.setSize(600,400);
p.setVisible(true);
}
}
