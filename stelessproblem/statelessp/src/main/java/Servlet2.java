import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet{
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
          response.setContentType("text/html");
       PrintWriter out=response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html><head><title>Attribute</title></head><body>");
           
            String name=request.getParameter("name");
            
            out.println("<h1>working</h1>");
          
            out.println("<h1>Welcome back"+name+"</h1>");
            out.println("<h1>Thank You</h1>");
            out.println("</body></html>");
       
        
    }
    
}

