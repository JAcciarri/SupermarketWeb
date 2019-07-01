package datos;

import java.sql.Connection;
import entidades.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;

public class DBCliente{
	
	private static String driver="com.mysql.jdbc.Driver";
	private static String url="jdbc:mysql://localhost:3306/supermercado?serverTimezone=UTC";
	private static String user="sistema";
	private static String pass="simplesystem";
	
	public ArrayList<Cliente> getUsuarios(){ 
		ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
	
		try
			{
			Class.forName(driver);
			Connection conexion = DriverManager.getConnection(url, user, pass);
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from clientes" );
				while (rs.next()) 
				{
				Cliente cliente = new Cliente();
				cliente.setIdCliente(rs.getInt("idCliente"));
				cliente.setNombre(rs.getString("nombre"));
				cliente.setApellido(rs.getString("apellido"));
				listaClientes.add(cliente);
				}
			if (rs!=null) {rs.close();}
			if (st!=null) {st.close();}
			conexion.close();
			}
			catch (Exception e)
			{
			e.printStackTrace();
			} 
	return listaClientes;
	}
	
	public Cliente getClienteByUsername(String username){ 
		Cliente cliente = null;
		try
			{
			Class.forName(driver);
			Connection conexion = DriverManager.getConnection(url, user, pass);
			PreparedStatement st = conexion.prepareStatement("select * from clientes where username=?");
			st.setString(1, username);
			ResultSet rs = st.executeQuery();
				if (rs!=null && rs.next())
				{
				cliente = new Cliente();
				cliente.setIdCliente(rs.getInt("idCliente"));
				cliente.setUsername(rs.getString("username"));
				cliente.setPassword(rs.getString("password"));
				}
			if (rs!=null) {rs.close();}
			if (st!=null) {st.close();}
			conexion.close();
			}
			catch (Exception e)
			{
			e.printStackTrace();
			} 
	return cliente;
	}
	
	public void addCliente(Cliente c) {
		PreparedStatement stmt= null;
		ResultSet rs=null;
		try
			{
			Class.forName(driver);
			Connection conexion = DriverManager.getConnection(url, user, pass);
			 stmt = conexion.prepareStatement("INSERT INTO clientes(idCliente, nombre, apellido, username, password) values(?,?,?,?,?)");
			stmt.setInt(1, c.getIdCliente());
			stmt.setString(2, c.getNombre());
			stmt.setString(3, c.getApellido());
			stmt.setString(4, c.getUsername());
			stmt.setString(5, c.getPassword());
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