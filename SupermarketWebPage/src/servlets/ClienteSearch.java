package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import datos.DBCliente;
import entidades.Cliente;

/**
 * Servlet implementation class ClienteSearch
 */
@WebServlet("/ClienteSearch")
public class ClienteSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClienteSearch() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String desc = request.getParameter("descripcion");
		ArrayList<Cliente> clientes = DBCliente.getClientesByDesc(desc);
	
		for (int i = 0; i < clientes.size(); i++) {
			//response.getWriter().print("cliente"+i);
			request.setAttribute("cliente"+i, clientes.get(i));
		}
		request.setAttribute("cantClientes", clientes.size());
		request.getRequestDispatcher("bienvenido.jsp").forward(request, response);
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
