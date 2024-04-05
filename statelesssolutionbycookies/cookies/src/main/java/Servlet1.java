import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
          response.setContentType("text/html");
       PrintWriter out=response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html><head><title>Attribute</title></head><body>");
           
            String name=request.getParameter("name");
            
            out.println("<h1>working</h1>");
          
            out.println("<h1>hellow"+name+"</h1>");
            out.println("<h1><a href='servlet2' method='post'>Go to s2</a></h1>");

            Cookie c=new Cookie("name", name);
            response.addCookie(c);
            out.println("</body></html>");
       
        
    }
}

