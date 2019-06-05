package com.mantiso;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by kevinj.
 */
public class ControllerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        user.setName("JulieCakes");
        user.setEmail("juliejava@icloud.com");

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
        request.setAttribute("user", user);
        dispatcher.forward(request, response);
    }
}
