import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet{
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
          response.setContentType("text/html");
       PrintWriter out=response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html><head><title>Attribute</title></head><body>");
           
            Cookie [] cookies=request.getCookies();
            boolean f=false;
            String name1="";
            if(cookies==null){
                out.println("<h1>new user name not found go to home page</h1>");
                return;
            }
            else{
                for(Cookie c:cookies){
                    String tname=c.getName();
                    if(tname.equals("name")){
                        f=true;
                        name1=c.getValue();
                    }

                }
            }
            //String name=request.getParameter("name");
            
            out.println("<h1>working</h1>");
          if(f){
            out.println("<h1>Welcome back"+name1+"</h1>");
            out.println("<h1>Thank You</h1>");
            out.println("</body></html>");
       
          }
          else{
            out.println("<h1>new user name not found go to home page</h1>");

          }
    }
    
}

