import java.awt.*;
import javax.swing.*;

class buttondemo extends JFrame{

buttondemo()
{
Container cp=getContentPane();
FlowLayout f=new FlowLayout();
//cp.setLayout(new FlowLayout());
cp.setLayout(f);

ImageIcon ic1=new ImageIcon("D:\\SY\\images\\barchart.gif");
ImageIcon ic2=new ImageIcon("D:\\SY\\images\\Find.gif");
ImageIcon ic3=new ImageIcon("D:\\SY\\images\\Open.gif");
ImageIcon ic4=new ImageIcon("D:\\SY\\images\\Save.gif");
ImageIcon ic5=new ImageIcon("D:\\SY\\images\\trash.gif");

JButton b1=new JButton("CLICK ME");

JButton b2=new JButton(ic1);
b2.setRolloverIcon(ic2);
b2.setSelectedIcon(ic3);
b2.setPressedIcon(ic4);
b2.setDisabledIcon(ic5);

b2.setEnabled(false);

cp.add(b1);
cp.add(b2);

JLabel l1=new JLabel("This is Label",ic3,JLabel.RIGHT);
cp.add(l1);

JTextField t=new JTextField("This is TextField",20);
cp.add(t);

String str="This is frst line"+"\nThis is second line"+"\nThis is Third line";
JTextArea ta=new JTextArea(str,10,20);


int vsb=JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED;
int hsb=JScrollPane.HORIZONTAL_SCROLLBAR_NEVER;

JScrollPane jsp=new JScrollPane(ta,vsb,hsb);
cp.add(jsp);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public static void main(String args[])
{
buttondemo w=new buttondemo();
w.setSize(600,400);
w.setVisible(true);
w.setTitle("Swing Components Demo");
}
}

