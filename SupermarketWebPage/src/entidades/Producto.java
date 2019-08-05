package entidades;

public class Producto {
	 
	private int idProducto;
	private String descProducto;
	private double precio;
	private CategoriaProd categoria;
	
	public Producto() {}
	public Producto(String desc, double precio){
		this.descProducto = desc;
		this.precio = precio;
	}
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getDescProducto() {
		return descProducto;
	}
	public void setDescProducto(String descProducto) {
		this.descProducto = descProducto;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public CategoriaProd getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaProd categoria) {
		this.categoria = categoria;
	}
	
}
