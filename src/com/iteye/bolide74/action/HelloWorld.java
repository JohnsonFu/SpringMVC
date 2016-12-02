package com.iteye.bolide74.action;
import java.util.HashMap;  
import java.util.Map;  
  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
import org.springframework.web.servlet.ModelAndView;  
import org.springframework.web.servlet.mvc.Controller;  
  
public class HelloWorld implements Controller {  
    private String viewPage;  
  
    public String getViewPage() {  
        return viewPage;  
    }  
  
    public void setViewPage(String viewPage) {  
        this.viewPage = viewPage;  
    }  
  
  
    @Override  
    public ModelAndView handleRequest(HttpServletRequest arg0,  
            HttpServletResponse arg1) throws Exception {  
        String msg=arg0.getParameter("msgValue");  
        msg="你输入的值为"+msg;  
        Map model = new HashMap();  
        model.put("msg", msg);  
        return new ModelAndView(getViewPage(), model);  
    }  
}
