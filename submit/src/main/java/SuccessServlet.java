import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
public class SuccessServlet extends HttpServlet  {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException {
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        out.println("This is success servlet");
        out.println("<h2>succesfully registerd</h2>");
    }
}
