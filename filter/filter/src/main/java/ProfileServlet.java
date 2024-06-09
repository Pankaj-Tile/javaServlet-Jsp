import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
    ProcessRequest(request,response);
    }
    protected void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
        ProcessRequest(request,response);
        }
    public void ProcessRequest(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
          response.setContentType("text/html");
       try(PrintWriter out=response.getWriter()){
            System.out.println("profile servlet exicuted");
            out.println("<!DOCTYPE html>");
            out.println("<html><head><title>filter</title></head><body>");
           
            
            
            out.println("<h1>welcome to profile page</h1>");
          
            out.println("<h1>hellow this is ps</h1>");

           
            out.println("</body></html>");
       }

    }}
