package Try;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ResultServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String Bread = (String)session.getAttribute("bread");
		String Milk = (String)session.getAttribute("milk");
		String Candy = request.getParameter("candy");
		session.invalidate();
		
		response.setContentType("text/htm;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>빵</title></head>");
		out.println("<body>");
		out.println("당신이 좋아하는 빵은 : " + Bread);
		out.println("당신이 좋아하는 우유는 : " + Milk);
		out.println("당신이 좋아하는 사탕은 : " + Candy);
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		
		
	}

}
