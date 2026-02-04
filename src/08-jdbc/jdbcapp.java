import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


class jdbcapp extends JFrame implements ActionListener{
JTextField t1,t2,t3,t4;
JButton add,clear;

static Connection con;
static Statement stmt;

jdbcapp()
{
Container cp=getContentPane();
cp.setLayout(new FlowLayout());

JLabel l1=new JLabel("Enter Roll No");
t1=new JTextField(20);

JLabel l2=new JLabel("Enter Name");
t2=new JTextField(20);

JLabel l3=new JLabel("Enter Address");
t3=new JTextField(20);

JLabel l4=new JLabel("Enter Class");
t4=new JTextField(20);

add=new JButton("ADD");
clear=new JButton("CLEAR");
JPanel jp=new JPanel();
jp.setLayout(new GridLayout(5,2));

Font f=new Font("Times New Roman",Font.BOLD,25);
l1.setFont(f);l2.setFont(f);l3.setFont(f);l4.setFont(f);
t1.setFont(f);t2.setFont(f);t3.setFont(f);t4.setFont(f);
add.setFont(f);clear.setFont(f);

jp.add(l1);jp.add(t1);jp.add(l2);jp.add(t2);jp.add(l3);jp.add(t3);
jp.add(l4);jp.add(t4);jp.add(add);jp.add(clear);
cp.add(jp);

add.addActionListener(this);
clear.addActionListener(this);

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==clear)
{
t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
}
else if(ae.getSource()==add)
{
int rollno=Integer.parseInt(t1.getText());
String name=t2.getText();
String address=t3.getText();
String sclass=t4.getText();

try{

stmt.executeUpdate("insert into studdata values("+rollno+",'"+name+"','"+address+"','"+sclass+"')");
JOptionPane.showMessageDialog(this,"Record added successfully....");

}catch(Exception e)
{
JOptionPane.showMessageDialog(this,"Exception found is..."+e);
}
}

}



public static void main(String args[])
{
jdbcapp w=new jdbcapp();
w.setSize(600,400);
w.setVisible(true);

try{
Class.forName("oracle.jdbc.driver.OracleDriver");
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
stmt=con.createStatement();

}catch(Exception e)
{
System.out.println("Exception found is "+e);

}

}
}


