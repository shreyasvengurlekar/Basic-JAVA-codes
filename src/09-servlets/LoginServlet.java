import java.io.*;
import javax.servlet.*;
public class LoginServlet extends GenericServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        
   PrintWriter pw=response.getWriter();
   response.setContentType("text/html");
   String id=request.getParameter("id");
   String password=request.getParameter("password");
   if(id.equals("admin") && password.equals("admin1234"))
   {
       
 RequestDispatcher rd=request.getRequestDispatcher("SuccessServlet");
 rd.forward(request, response);
   }
   else{
 pw.println("Error in either ID or Password...PLZ try again");
 RequestDispatcher rd=request.getRequestDispatcher("login.html");
 rd.include(request, response);
  
   }
   
    }   
}
