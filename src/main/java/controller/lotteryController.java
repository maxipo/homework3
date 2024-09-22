package controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import service.LotteryService;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

@WebServlet(name = "lotteryController", value = "/Lottery/lotteryController")
public class lotteryController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
		RequestDispatcher view;
//        System.out.println("hello servlet");
//        PrintWriter out = response.getWriter();
//        view = request.getRequestDispatcher("result.jsp");
//        view.forward(request, response);
        // 1. Retrieve Form Data
        int group = Integer.parseInt(request.getParameter("group"));
        String excludeString = request.getParameter("exclude");
        // Convert Form Data
        String[] excludes = excludeString.split(" ");
        LinkedList<Integer> excludeNumbers = new LinkedList<>();
        for (String exclude : excludes) {
            excludeNumbers.add(Integer.parseInt(exclude));
        }
        // Invoke Business Logic
        LotteryService lotteryService = new LotteryService();
        ArrayList[] arrayLists = lotteryService.getNumbers(group, excludeNumbers);
        request.setAttribute("numbers", arrayLists); // Request-Scope
        view = request.getRequestDispatcher("result.jsp");
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
