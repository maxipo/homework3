import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
//import jdk.javadoc.internal.doclets.toolkit.taglets.snippet.Style;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

import java.io.IOException;
import java.util.LinkedList;

@WebServlet(name = "lotteryService", urlPatterns = {"/lotteryService", "/Lottery/lotteryService"})
public class lotteryService extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        RequestDispatcher view;
//		LinkedList<String> errorMsgs = new LinkedList<>();
//		request.setAttribute("errors", errorMsgs); // Reqeust-Scope
//
        // 1. Retrieve Form Data
        /*String[] excludes = excludeString.split(" ");
        LinkedList<Integer> excludeNumbers = new LinkedList<>();
        for (String exclude : excludes) {
            excludeNumbers.add(Integer.parseInt(exclude));
        }*/
//		String name      = request.getParameter("name");
//		String email     = request.getParameter("email");
//		String telephone = request.getParameter("telephone");
//		String address   = request.getParameter("address");
//		String birth     = request.getParameter("birth");
//		String gender    = request.getParameter("gender");
//		String[] habits  = request.getParameterValues("habit");
//
//        //int group = Integer.parseInt(args[0]);
        System.out.println("get method called");

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
