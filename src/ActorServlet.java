import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ptest/actor")
public class ActorServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String language = request.getParameter("Language");
		HttpSession session = request.getSession();
		session.setAttribute("Language", language);
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>성격테스트</title></head>");
		out.println("<body>");
		out.println("<h3>좋아하는 배우는? <h3>");
		out.println("<form action = result>");
		out.println("<input type=text name='Actor'><p>");
		out.println("<input type=submit value='확인'>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}

}
