package ui.controller;

import domain.GuessGame;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Guess")
public class GuessServlet extends HttpServlet {
    private GuessGame game = new GuessGame();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String guessFromParameter = request.getParameter("guess");
        int guessedNumber = Integer.parseInt(guessFromParameter);
        String resultMessage = game.guess(guessedNumber);

        /*
        We kunnen geen extra parameters toevoegen aan request, enkel extra attributen.
        */
        request.setAttribute("result", resultMessage);

        /*
        RequestDispatcher biedt de mogelijkheid om het verzoek naar een andere bron te verzenden.
        Dit kan html, servlet of jsp zijn.
        https://www.javatpoint.com/requestdispatcher-in-servlet
        */
        RequestDispatcher view = request.getRequestDispatcher("/result.jsp");
        view.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}