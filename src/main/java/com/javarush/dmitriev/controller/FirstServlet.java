package com.javarush.dmitriev.controller;

import com.javarush.dmitriev.constants.Utils;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;

@WebServlet("/" + Utils.FIRST)
public class FirstServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher(Utils.START_JSP).forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String answer = req.getParameter("answer");
//        req.setAttribute("answer", "Ты отклонил вызов. Поражение");

        switch (answer) {
            case "Принять1" -> req.getRequestDispatcher(Utils.SECOND).forward(req, resp);
            case "Принять2" -> req.getRequestDispatcher(Utils.THIRD_SERVLET).forward(req, resp);
            case "Принять3" -> req.getRequestDispatcher(Utils.WIN).forward(req, resp);
            default -> req.getRequestDispatcher(Utils.LOSE).forward(req, resp);
        }


    }

}