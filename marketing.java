package all;

public class marketing {

	
	private String nombre;
	private long telefono;
	private double precioCampa�aPel;
	
	
	public marketing(String nombre, long telefono, double precioCampa�aPel) {
		
		this.nombre = nombre;
		this.telefono = telefono;
		this.precioCampa�aPel = precioCampa�aPel;
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


	public double getPrecioCampa�aPel() {
		return precioCampa�aPel;
	}


	public void setPrecioCampa�aPel(double precioCampa�aPel) {
		this.precioCampa�aPel = precioCampa�aPel;
	}
	
	@Override
	public String toString() {
		return "Marketing [Nombre=" + nombre + ", Numero de telefono=" + telefono + ", Precio=" + precioCampa�aPel
				+ "]";
	}
	
	
}
