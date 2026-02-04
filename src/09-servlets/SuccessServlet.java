
import java.io.*;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class SuccessServlet extends GenericServlet {

    @Override
public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
PrintWriter pw=response.getWriter();
pw.println("Login Successful.....");
pw.println("Welcome "+request.getParameter("id")+ " on your profile page");
pw.println("You password is "+request.getParameter("password"));
    }   
}
