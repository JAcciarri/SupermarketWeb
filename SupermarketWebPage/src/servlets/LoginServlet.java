package servlets;

import java.io.IOException;
import entidades.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import datos.*;
/**
 * Servlet implementation class LoginCheck
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//ClienteDB cliDB = new ClienteDB();
		DBCliente consult = new DBCliente();
		Cliente cli = consult.getClienteByUsername(username);
		
		if (cli!=null && username.equals(cli.getUsername()) && password.equals(cli.getPassword())) 
		{
			response.sendRedirect("bienvenido.jsp");
		}
		else 
		{
			response.sendRedirect("error.jsp");
		}
		
	}

}
