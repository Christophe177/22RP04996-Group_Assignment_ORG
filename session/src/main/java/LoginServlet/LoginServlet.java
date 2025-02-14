package LoginServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Simple validation (replace with actual validation logic)
        if ("user".equals(username) && "pass".equals(password)) {
            // Create a session for the user
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            // Redirect to welcome page
            response.sendRedirect("welcome.html");
        } else {
            // Redirect to error page
            response.sendRedirect("error.html");
        }
    }
}