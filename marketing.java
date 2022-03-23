package all;

public class marketing {

	
	private String nombre;
	private long telefono;
	private double precioCampañaPel;
	
	
	public marketing(String nombre, long telefono, double precioCampañaPel) {
		
		this.nombre = nombre;
		this.telefono = telefono;
		this.precioCampañaPel = precioCampañaPel;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public long getTelefono() {
		return telefono;
	}


	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}


	public double getPrecioCampañaPel() {
		return precioCampañaPel;
	}


	public void setPrecioCampañaPel(double precioCampañaPel) {
		this.precioCampañaPel = precioCampañaPel;
	}
	
	@Override
	public String toString() {
		return "Marketing [Nombre=" + nombre + ", Numero de telefono=" + telefono + ", Precio=" + precioCampañaPel
				+ "]";
	}
	
	
}
