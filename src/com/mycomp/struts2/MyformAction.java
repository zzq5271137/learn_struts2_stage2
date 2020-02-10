package com.mycomp.struts2;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.HttpParameters;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

public class MyformAction extends ActionSupport {

    /*
     * 通过完全解耦的方式获取参数
     * (即与原生的ServletAPI解耦, 使用Struts2提供的ActionContext来获取参数).
     *
     * 真正的开放当中并不会使用这种方式.
     */
    public String getReqParams1() {
        System.out.println("通过完全解耦的方式获取参数: ");

        // 接收表单当中的参数
        // 不论是获取参数, 还是往域中写参数, 都是通过ActionContext对象来完成的
        ActionContext context = ActionContext.getContext();
        HttpParameters parameters = context.getParameters();

        // 获取参数
        String username = parameters.get("username").getValue(); // 单个值的参数
        System.out.println(username);
        String nick = parameters.get("nick").getValue();
        System.out.println(nick);
        String[] hobbies = parameters.get("hobby").getMultipleValues(); // 多个值的参数
        System.out.println(Arrays.toString(hobbies));

        // 往request域中写参数
        context.put("reqName", "解耦reqValue");

        // 往session域中写参数
        context.getSession().put("sessionName", "解耦sessionValue");

        // 往application域(ServletContext域)中写参数
        context.getApplication().put("appName", "解耦appValue");

        return SUCCESS;
    }

    /*
     * 通过Servlet原生的方式获取表单参数
     *
     * 真正的开放当中并不会使用这种方式.
     */
    public String getReqParams2() {
        System.out.println("通过Servlet原生的方式获取表单参数");

        // 获取原生api
        // 也可以通过ServletActionContext获取HttpServletResponse对象
        HttpServletRequest request = ServletActionContext.getRequest();

        // 获取参数
        String username = request.getParameter("username");
        System.out.println(username);
        String nick = request.getParameter("nick");
        System.out.println(nick);
        String[] hobbies = request.getParameterValues("hobby");
        System.out.println(Arrays.toString(hobbies));

        // 往request域中写参数
        request.setAttribute("reqName", "原生reqValue");

        // 往session域中写参数
        request.getSession().setAttribute("sessionName", "原生sessionValue");

        // 往application域(ServletContext域)中写参数
        ServletContext servletContext = ServletActionContext.getServletContext();
        servletContext.setAttribute("appName", "原生appValue");

        return LOGIN;
    }

}
