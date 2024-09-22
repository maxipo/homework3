package controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import service.GuessGame;

import java.io.IOException;
import java.util.LinkedList;

@WebServlet(name = "gameController", value = {"/gameController", "/game/gameController"})
public class gameController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
		RequestDispatcher view;
		LinkedList<String> errorMsgs = new LinkedList<>();
		request.setAttribute("errors", errorMsgs); // Reqeust-Scope

        // Retrieve Form Data
        GuessGame guessGame = new GuessGame(10, 3);

        // Invoke Business Logic
//        int number = Integer.parseInt(request.getParameter("number"));
        HttpSession session = request.getSession();
        session.setAttribute("guessTimes", guessGame);
        System.out.println("GuessGame object stored in session: " + guessGame);
        view = request.getRequestDispatcher("guess.jsp");
        view.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Validate Form Data
        HttpSession session = request.getSession();
        GuessGame guessGameGet = (GuessGame) session.getAttribute("guessTimes");
        RequestDispatcher view;
        int number = Integer.parseInt(request.getParameter("number"));
        if (guessGameGet.guess(number)) {
            view = request.getRequestDispatcher("youWin.jsp");
            view.forward(request, response);
            return;
        }
        if (guessGameGet.getRemains() > 0) {
            view = request.getRequestDispatcher("guess.jsp");
            view.forward(request, response);
            return;
        }
        view = request.getRequestDispatcher("youLose.jsp");
        view.forward(request, response);

    }
}
