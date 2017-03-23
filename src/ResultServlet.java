import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ptest/result")
public class ResultServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String food = (String) session.getAttribute("Food");
		String animal = (String) session.getAttribute("Animal");
		String language = (String) session.getAttribute("Language");
		String actor = request.getParameter("Actor");
		session.invalidate();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>성격 테스트</title></head>");
		out.println("<body>");
		out.println("당신이 좋아하는 음식은 " + food + "<p>");
		out.println("당신이 좋아하는 동물은 " + animal + "<p>");
		out.println("당신이 좋아하는 언어는 " + language + "<p>");
		out.println("당신이 좋아하는 배우는 " + actor);
		out.println("</body>");
		out.println("</html>");
		
	}
	

}
