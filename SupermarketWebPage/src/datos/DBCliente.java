package datos;

import java.sql.Connection;
import entidades.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;

/// ESTE FUNCIONA 


public class DBCliente{
	
	private static String driver="com.mysql.jdbc.Driver";
	private static String url="jdbc:mysql://localhost:3306/supermercado?serverTimezone=UTC";
	private static String user="sistema";
	private static String pass="simplesystem";
	
	public static ArrayList<Cliente> getAllClientes(){ 
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
				cliente.setTelefono(rs.getString("telefono"));
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
	
	public static Cliente getClienteByUsername(String username){ 
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
	
	public static Cliente getClienteByID(int ID){ 
		Cliente cliente = null;
		try
			{
			Class.forName(driver);
			Connection conexion = DriverManager.getConnection(url, user, pass);
			PreparedStatement st = conexion.prepareStatement("select * from clientes where idCliente=?");
			st.setInt(1, ID);
			ResultSet rs = st.executeQuery();
				if (rs!=null && rs.next())
				{
				cliente = new Cliente();
				cliente.setIdCliente(rs.getInt("idCliente"));
				cliente.setUsername(rs.getString("username"));
				cliente.setPassword(rs.getString("password"));
				cliente.setNombre(rs.getString("nombre"));
				cliente.setApellido(rs.getString("apellido"));
				cliente.setTelefono(rs.getString("telefono"));
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
	
	public static void addPartialCliente(Cliente c) {
		PreparedStatement stmt= null;
		ResultSet rs=null;
		try
			{
			Class.forName(driver);
			Connection conexion = DriverManager.getConnection(url, user, pass);
			 stmt = conexion.prepareStatement("INSERT INTO clientes(nombre, apellido, telefono) values(?,?,?)");
				stmt.setString(1, c.getNombre());
				stmt.setString(2, c.getApellido());
				stmt.setString(3, c.getTelefono());
			stmt.executeUpdate();
			 rs = stmt.executeQuery();
			
			if (rs!=null) {rs.close();}
			if (stmt!=null) {stmt.close();}
			conexion.close();
			}
			catch (Exception e)
			{
			e.printStackTrace();
			} 
	}
	
	
	public static void addCliente(Cliente c) {
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
	
	public static void updateCliente(Cliente c) {
		PreparedStatement stmt= null;
		ResultSet rs=null;
		try
			{
			Class.forName(driver);
			Connection conexion = DriverManager.getConnection(url, user, pass);
			 String SQL = "UPDATE clientes SET nombre=?, apellido=?, telefono=? WHERE idCliente='"+c.getIdCliente()+"'";
			 stmt = conexion.prepareStatement(SQL);
			stmt.setString(1, c.getNombre());
			stmt.setString(2, c.getApellido());
			stmt.setString(3, c.getTelefono());
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
	
	public static void deleteCliente(Cliente c) {
		PreparedStatement stmt= null;
		ResultSet rs=null;
		try
			{
			Class.forName(driver);
			Connection conexion = DriverManager.getConnection(url, user, pass);
			 String SQL = "DELETE FROM clientes WHERE idCliente='"+c.getIdCliente()+"'";
			 stmt = conexion.prepareStatement(SQL);
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
	
	public static ArrayList<Cliente> getClientesByDesc(String desc) {
		PreparedStatement stmt= null;
		ResultSet rs=null;
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		try
			{
			Class.forName(driver);
			Connection conexion = DriverManager.getConnection(url, user, pass);
			 String SQL = "SELECT * FROM clientes WHERE nombre LIKE ('"+desc+"%')";
			 stmt = conexion.prepareStatement(SQL);
			 rs = stmt.executeQuery();
				while (rs!=null && rs.next())
				{
					Cliente cliente = new Cliente();
					cliente.setIdCliente(rs.getInt("idCliente"));
					cliente.setUsername(rs.getString("username"));
					cliente.setPassword(rs.getString("password"));
					cliente.setNombre(rs.getString("nombre"));
					cliente.setApellido(rs.getString("apellido"));
					cliente.setTelefono(rs.getString("telefono"));
					clientes.add(cliente);
				}
			if (rs!=null) {rs.close();}
			if (stmt!=null) {stmt.close();}
			conexion.close();
			}
			catch (Exception e)
			{
			e.printStackTrace();
			}
		return clientes;
	}
	
}