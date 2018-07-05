import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CourseChoiceServlet", urlPatterns = { "/course" })
public class CourseChoiceServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		RequestDispatcher dispatcher = null;
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");

		if (request.getParameter("easy") != null) {
			dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/easy.jsp");
		} else if (request.getParameter("normal") != null)  {
			dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/normal.jsp");
		}else if (request.getParameter("hard") != null)  {
			dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/hard.jsp");
		}

	     dispatcher.forward(request, response);


	}
}