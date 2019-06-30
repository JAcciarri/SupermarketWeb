package datos;

import java.util.ArrayList;

import entidades.Cliente;

public class TestandDelete {

	
	public static void main() {
		ClienteDB cliDB = new ClienteDB();
		ArrayList<Cliente> clientes = cliDB.getAllClients();
		
	for (Cliente c : clientes) {
		System.out.println(c.getIdCliente() + " " + c.getNombre());
	}
	
	}
}
