import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
   protected void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
    ProcessRequest(request,response);
    }
    protected void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
        ProcessRequest(request,response);
        }
    public void ProcessRequest(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
          response.setContentType("text/html");
       try(PrintWriter out=response.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html><head><title>Attribute</title></head><body>");
           
            String name=request.getParameter("user_name");  
            // hear we created name as a hidden form field that is going to be input of another servlet
            
            out.println("<h1>working</h1>");
          
            out.println("<h1>hellow "+name+"</h1>");
            // out.println("<h1><a href='servlet2?user="+name+"' method='post'>Go to s2</a></h1>");
            //hidden form field
            out.println(""+" <form action=\"servlet2\">\r\n" + //
                                "        <input type=\"text\" name=\"user_name\" value='"+name+"'>"+"<button> go to s2</button>"
                                +"</form>");
           
            out.println("</body></html>");
       }
    }
}
