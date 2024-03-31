import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException ,ServletException{
        response.setContentType("text/html");
        PrintWriter out= response.getWriter();
        out.println("<h2>Welcome  </h2>");
        String name=request.getParameter("user_name");
        String password=request.getParameter("user_password");
        String email=request.getParameter("user_email");
        String gender=request.getParameter("user_gender");
        String course=request.getParameter("user_course");
        String cond= request.getParameter("condition");
        if(cond!=null){
        if(cond.equals("checked")){
            out.println("<h1>Name:"+name+"</h1>");
            out.println("<h1>Password:"+password+"</h1>");
            out.println("<h1>course:"+course+"</h1>");

            out.println("<h1>gender:"+gender+"</h1>");
            out.println("<h1>email:"+email+"</h1>");
            
            RequestDispatcher rd=request.getRequestDispatcher("success");
            rd.forward(request, response);

        }

        else{
            out.println("<h1>You have not accepted the term and conditions </h1>");
           
        }
    }
    else{
        out.println("<h2>you have not expected the term and conditions</h2>");
        RequestDispatcher rd=request.getRequestDispatcher("index.html");
        rd.include(request, response);
    }
}
}
