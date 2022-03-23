package all;
public class Ayuntamiento {

	
	private String nombreContacto;
	private long telefono;
	private double subencionMinimaCartel;
	private double subencionMaximaCartel;
	
	
	public Ayuntamiento(String nombreContacto, long telefono, double subencionMinimaCartel,
			double subencionMaximaCartel) {
		
		this.nombreContacto = nombreContacto;
		this.telefono = telefono;
		this.subencionMinimaCartel = subencionMinimaCartel;
		this.subencionMaximaCartel = subencionMaximaCartel;
	}


	public String getNombreContacto() {
		return nombreContacto;
	}


	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}


	public long getTelefono() {
		return telefono;
	}


	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}


	public double getSubencionMinimaCartel() {
		return subencionMinimaCartel;
	}


	public void setSubencionMinimaCartel(double subencionMinimaCartel) {
		this.subencionMinimaCartel = subencionMinimaCartel;
	}


	public double getSubencionMaximaCartel() {
		return subencionMaximaCartel;
	}


	public void setSubencionMaximaCartel(double subencionMaximaCartel) {
		this.subencionMaximaCartel = subencionMaximaCartel;
	}
	
	
	@Override
	public String toString() {
		return "Ayuntamiento [Nombre de Contacto=" + nombreContacto + ", Numero de telefono=" + telefono + ", Subencion =" + subencionMinimaCartel
				+ "]";
	}
	
	
	
}
