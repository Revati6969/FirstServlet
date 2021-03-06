package com.firstservlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        description = "Login servlet testing",
        urlPatterns = {"/loginServlet"},
        initParams = {
                @WebInitParam(name = "user", value = "Rev"),
                @WebInitParam(name = "password", value = "Revati@19")
        }
)

public class LoginServlet extends HttpServlet {
    Validator validator = new Validator();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");
        String pwd = request.getParameter("pwd");
        String password = getServletConfig().getInitParameter("pwd");
        if(validator.userNameValidation(user) && validator.passwordValidation(pwd)) {
            request.setAttribute("user", user);
            request.setAttribute("password", password);
            request.getRequestDispatcher("LoginSuccess.jsp").forward(request, response);
        } else {
            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/login.html");
            PrintWriter out = response.getWriter();
            out.println("<font color=red>Invalid username or password </font>");
            requestDispatcher.include(request, response);
        }
    }
}
