import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Operation extends HttpServlet {
    
    protected void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
        response.setContentType("text/html");
       PrintWriter out=response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html><head><title>operation</title></head><body>");
           
            String n1=request.getParameter("n1");
            String n2=request.getParameter("n2");
            int nn1=Integer.parseInt(n1);
            int nn2=Integer.parseInt(n2);
            int mul=nn1*nn2;
            request.setAttribute("mul", mul);
            int sum=(int)request.getAttribute("sum");
            out.println("<h1>sum:"+sum+"<br>");
            out.println("multiplication:"+mul+"</h1>");
            out.println("</body></html>");
        
    }
}
