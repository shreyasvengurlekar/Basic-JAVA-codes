import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class menudemo extends JFrame implements ActionListener
{
JMenuItem open,save,print,exit,cut,copy,paste,selectall,font,color;
JEditorPane ep;
menudemo()
{
ep=new JEditorPane();
setContentPane(ep);
//step1
JMenuBar mb=new JMenuBar();

//step2
JMenu file=new JMenu("FILE");
JMenu edit=new JMenu("EDIT");
JMenu format=new JMenu("FORMAT");

//step3
 open=new JMenuItem("Open");
 save=new JMenuItem("Save");
 print=new JMenuItem("Print");
 exit=new JMenuItem("Exit");

 cut=new JMenuItem("Cut");
 copy=new JMenuItem("Copy");
 paste=new JMenuItem("Paste");
 selectall=new JCheckBoxMenuItem("Select All");

 font=new JMenuItem("Font");
 color=new JMenuItem("Color");

//Register menu items with ActionListener as they generate ActionEvent when you click them

open.addActionListener(this);
save.addActionListener(this);
print.addActionListener(this);
exit.addActionListener(this);

cut.addActionListener(this);
copy.addActionListener(this);
paste.addActionListener(this);
selectall.addActionListener(this);

font.addActionListener(this);
color.addActionListener(this);

//step4
file.add(open);file.add(save);file.add(print);file.add(exit);
edit.add(cut);edit.add(copy);edit.add(paste);edit.add(selectall);
format.add(font);format.add(color);

//step5
mb.add(file);mb.add(edit);mb.add(format);

//step6
setJMenuBar(mb);

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent ae)
{

if(ae.getSource()==exit)
{
System.exit(0);
}
else if (ae.getSource()==cut)
{

ep.cut();
}

else if (ae.getSource()==copy)
{
ep.copy();
}
else if (ae.getSource()==paste)
{
ep.paste();
}
else if (ae.getSource()==selectall)
{
ep.selectAll();
}
}
}

class menuexample{
public static void main(String args[])
{
menudemo m=new menudemo();
m.setSize(600,400);
m.setVisible(true);
m.setTitle("Notepad");
}
}


