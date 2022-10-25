//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.web.fragment;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class WebFragmentServlet extends HttpServlet {



    protected void  doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            System.out.println("WebFragmentServlet ......");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet方法执行");
        this.doGet(req, resp);
    }

}



