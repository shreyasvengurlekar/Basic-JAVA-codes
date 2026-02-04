import java.sql.*;
import java.io.*;


class jdbcdemo2{
public static void main(String args[])
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int rollno;
String name,sclass;


try{
//Install suitable JDBC driver using Class loader
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("Driver loaded successfully...");

//Make connection to Database using DriverManager.getConnection()
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",
"system","manager");

System.out.println("Connection made successfully...");
//Now execute SQL commands
Statement stmt=con.createStatement();

System.out.println("Enter Rollno");
rollno=Integer.parseInt(br.readLine());
System.out.println("Enter Name");
name=br.readLine();
System.out.println("Enter student class");
sclass=br.readLine();


//stmt.executeUpdate("insert into student values(3,'Dinkar','SYCS')");
stmt.executeUpdate("insert into student values("+rollno+",'"+name+"','"+sclass+"')");
System.out.println("Record added successfully...");


}catch(Exception e)
{
System.out.println("Exception found..."+e);
}
}
}