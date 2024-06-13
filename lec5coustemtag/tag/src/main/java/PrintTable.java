public class PrintTable {
    public int number;
    public String color;
    public void setNumber(int number){
        this.number=number;
    }
    public void setColor(String color){
        this.color=color;
    }
    
    public int doStarting() throws JspException{
        try{
            jspWriter out=pageContext.getOut();
            out.println("<div style='color:"+color+" '>");
            out.print("<br>");
            for(int i=1;i<11;i++){
                out.println((i*number)+"<br>");
            }
            out.println("</div>");

        }
        catch (Exception e){
            e.printStackTrace();
        }
        return SKIP_BODY;
    }
}
