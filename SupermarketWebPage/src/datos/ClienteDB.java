package datos;
import entidades.*;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.*;

public class ClienteDB {

	public ArrayList <Cliente> getAllClients() {
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		try {
			stmt = FactoryConnection.getInstancia().getConn().createStatement();
			rs = stmt.executeQuery("select * from clientes");
			if(rs != null) {
				while(rs.next()) {
					Cliente cli = new Cliente();
					cli.setIdCliente(rs.getInt("idCliente"));
					cli.setNombre(rs.getString("nombre"));
					cli.setApellido(rs.getString("apellido"));
					cli.setTelefono(rs.getString("telefono"));
					clientes.add(cli);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if(rs!=null) {rs.close();}
				if(stmt!=null) {stmt.close();}
			//	FactoryConnection.getInstancia().releaseConn();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return clientes;
	}
	
	public Cliente getClientByID(Cliente cli) {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		 Cliente c = null;
		
		try {
			stmt = FactoryConnection.getInstancia().getConn().prepareStatement(
					"select * from clientes where idCliente=?");
			stmt.setInt(1, cli.getIdCliente());
			rs = stmt.executeQuery();
			if(rs != null && rs.next()) {
					 c = new Cliente();
					c.setIdCliente(rs.getInt("idCliente"));
					c.setNombre(rs.getString("nombre"));
					c.setApellido(rs.getString("apellido"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if(rs!=null) {rs.close();}
				if(stmt!=null) {stmt.close();}
				FactoryConnection.getInstancia().releaseConn();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return c;
	}
	
	public Cliente getClientByUsername(Cliente cli) {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		 Cliente c = null;
		
		try {
			stmt = FactoryConnection.getInstancia().getConn().prepareStatement(
					"select * from clientes where username=?");
			stmt.setString(1, cli.getUsername());
			rs = stmt.executeQuery();
			if(rs != null && rs.next()) {
					 c = new Cliente();
					c.setIdCliente(rs.getInt("idCliente"));
					c.setUsername(rs.getString("username"));
					c.setPassword(rs.getString("password"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if(rs!=null) {rs.close();}
				if(stmt!=null) {stmt.close();}
			//	FactoryConnection.getInstancia().releaseConn();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return c;
	}
}
