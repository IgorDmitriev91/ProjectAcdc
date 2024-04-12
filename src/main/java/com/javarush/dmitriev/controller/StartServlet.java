package com.javarush.dmitriev.controller;

import com.javarush.dmitriev.constants.Utils;
import com.javarush.dmitriev.entity.User;
import com.javarush.dmitriev.service.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(Utils.START)
public class StartServlet extends HttpServlet {
    UserService userService = UserService.getInstance();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher(Utils.START_PAGE).forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String name = req.getParameter("name");
        User user = new User(name);
        userService.create(user);
        session.setAttribute("name", name);
        session.setAttribute("id", user.getId());


        resp.sendRedirect(Utils.FIRST);
    }
}

