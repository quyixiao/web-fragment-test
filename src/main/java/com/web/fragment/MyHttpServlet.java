package com.web.fragment;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(asyncSupported = true, name = "MyHttpServlet", description = "name描述", loadOnStartup = 1, urlPatterns = {
        "/myHttpServlet"}, initParams = {
        @WebInitParam(name = "Hello", value = "MyHttpServlet!", description = "init参数1"),
        @WebInitParam(name = "Hi", value = "World!", description = "init参数2")})

public class MyHttpServlet extends HttpServlet {
 
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取Servlet初始化参数
        ServletConfig config = this.getServletConfig();
        String hello = config.getInitParameter("Hello");
        String Hi = config.getInitParameter("Hi");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.write("Hello:" + hello + " Hi:" + Hi);
        writer.close();
    }
 
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
 
    }
}