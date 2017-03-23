package Try;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("Candy")
public class CandyServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Milk = request.getParameter("milk");
		HttpSession session = request.getSession();
		session.getAttribute(Milk);
		
		response.setContentType("text/htm;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>빵</title></head>");
		out.println("<body>");
		out.println("<h3>좋아하는 사탕은? <h3>");
		out.println("<form action = Result>");
		out.println("<input type=text name='candy'><p>");
		out.println("<input type=submit value='확인'>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}

}
