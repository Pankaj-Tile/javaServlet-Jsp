
import javax.servlet.*;
public class MyTagSupport extends TagSupport{

    public int doStarting() throws JspException{
        try{
            jspWriter out=pageContext.getOut();
            out.println("<h2>This is costom tag</h2>");

        }
        catch (Exception e){
            e.printStackTrace();
        }
        return SKIP_BODY;
    }
}
