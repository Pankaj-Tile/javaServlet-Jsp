import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Attribute extends HttpServlet {
    
    protected void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
        response.setContentType("text/html");
       PrintWriter out=response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html><head><title>Attribute</title></head><body>");
           
            String n1=request.getParameter("n1");
            String n2=request.getParameter("n2");
            out.println("<h1>working</h1>");
            int nn1=Integer.parseInt(n1);
            int nn2=Integer.parseInt(n2);
            int s=nn1+nn2;
            request.setAttribute("sum", s);
            RequestDispatcher rd=request.getRequestDispatcher("Opp");
            rd.forward(request, response);
            out.println("</body></html>");
       
        
    }
}
