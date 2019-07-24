package entidades;

public class Cliente {
	int idCliente;
	String nombre;
	String apellido;
	String telefono;
	String username;
	String password;
	
	public Cliente(){}
	public Cliente( String nombre, String apellido, String username, String password) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setUsername(username);
		this.setPassword(password);
	}
	public Cliente (String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}
	public Cliente(String nombre, String apellido, String telefono){
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setTelefono(telefono);
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

		

}
