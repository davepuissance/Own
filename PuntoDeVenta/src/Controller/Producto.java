/**
 * 
 */
package Controller;

/**
 * @author MECD
 *
 */
public class Producto {
	private int Codigo;
	private String Nombre;
	private int Precio;
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return Codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		Codigo = codigo;
	}
	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return Precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		Precio = precio;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return Nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
}
