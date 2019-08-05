package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datos.DBCliente;
import datos.DBProducto;
import entidades.Cliente;
import entidades.Producto;

/**
 * Servlet implementation class ProductoAdd
 */
@WebServlet("/ProductoAdd")
public class ProductoAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductoAdd() {
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
		// TODO Auto-generated method stub
		String desc = request.getParameter("descripcion");
		String precio = request.getParameter("precio");
		double precioD = Double.parseDouble(precio);
		Producto p = new Producto(desc, precioD);
		DBProducto.addProducto(p);
		response.sendRedirect("productoAdd.jsp");
	}

}
