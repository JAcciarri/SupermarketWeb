package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import datos.DBCliente;
import entidades.Cliente;

/**
 * Servlet implementation class EditarCliente
 */
@WebServlet("/ClienteEdit")
public class ClienteEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClienteEdit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int ID = Integer.parseInt(request.getParameter("id"));
		Cliente cliente = (DBCliente.getClienteByID(ID));
		HttpSession Sesion;
		Sesion = request.getSession(false);
		Sesion.setAttribute("cliente", cliente);
		response.sendRedirect("clienteEdit.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int ID = Integer.parseInt(request.getParameter("id"));
		String nombre = request.getParameter("nombre");
		String apellido =request.getParameter("apellido");
		String telefono = request.getParameter("telefono");
		Cliente c = new Cliente(nombre, apellido, telefono);
		c.setIdCliente(ID);
		DBCliente.updateCliente(c);
		response.sendRedirect("bienvenido.jsp");
	
	}

}
