package all;

public class marketing {

	
	private String nombre;
	private long telefono;
	private double precioCampaņaPel;
	
	
	public marketing(String nombre, long telefono, double precioCampaņaPel) {
		
		this.nombre = nombre;
		this.telefono = telefono;
		this.precioCampaņaPel = precioCampaņaPel;
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


	public double getPrecioCampaņaPel() {
		return precioCampaņaPel;
	}


	public void setPrecioCampaņaPel(double precioCampaņaPel) {
		this.precioCampaņaPel = precioCampaņaPel;
	}
	
	@Override
	public String toString() {
		return "Marketing [Nombre=" + nombre + ", Numero de telefono=" + telefono + ", Precio=" + precioCampaņaPel
				+ "]";
	}
	
	
}
