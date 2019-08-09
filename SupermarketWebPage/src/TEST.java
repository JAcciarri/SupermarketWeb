import java.util.ArrayList;

import datos.DBCliente;
import entidades.Cliente;

public class TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Cliente> clientes = DBCliente.getClientesByDesc("j");
		for (Cliente c : clientes) {
			System.out.println(c.getNombre());
		}
	}

}
