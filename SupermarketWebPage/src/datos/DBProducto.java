package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import entidades.Cliente;
import entidades.Producto;

public class DBProducto {
	private static String driver="com.mysql.jdbc.Driver";
	private static String url="jdbc:mysql://localhost:3306/supermercado?serverTimezone=UTC";
	private static String user="sistema";
	private static String pass="simplesystem";
	
	public static ArrayList<Producto> getAllProducts(){ 
		ArrayList<Producto> listaProductos = new ArrayList<Producto>();
	
		try
			{
			Class.forName(driver);
			Connection conexion = DriverManager.getConnection(url, user, pass);
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from productos" );
				while (rs.next()) 
				{
				Producto p = new Producto();
				p.setIdProducto(rs.getInt("idProducto"));
				p.setDescProducto(rs.getString("descProducto"));
				p.setPrecio(rs.getDouble("precio"));
				listaProductos.add(p);
				}
			if (rs!=null) {rs.close();}
			if (st!=null) {st.close();}
			conexion.close();
			}
			catch (Exception e)
			{
			e.printStackTrace();
			} 
	return listaProductos;
	}
	
	public static void addProducto(Producto p) {
		PreparedStatement stmt= null;
		ResultSet rs=null;
		try
			{
			Class.forName(driver);
			Connection conexion = DriverManager.getConnection(url, user, pass);
			 stmt = conexion.prepareStatement("INSERT INTO productos(descProducto, precio) values(?,?)");
			stmt.setString(1, p.getDescProducto());
			stmt.setDouble(2, p.getPrecio());
			stmt.executeUpdate();
			 rs = stmt.executeQuery();
				if (rs!=null && rs.next())
				{

				}
			if (rs!=null) {rs.close();}
			if (stmt!=null) {stmt.close();}
			conexion.close();
			}
			catch (Exception e)
			{
			e.printStackTrace();
			} 
	}
	
}
