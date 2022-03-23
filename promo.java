package all;

public class promo {

	
	private int idPromocion;
	private String tituloPromocion;
	
	
	public promo(int idPromocion, String tituloPromocion) {
		
		this.idPromocion = idPromocion;
		this.tituloPromocion = tituloPromocion;
	}


	public int getIdPromocion() {
		return idPromocion;
	}


	public void setIdPromocion(int idPromocion) {
		this.idPromocion = idPromocion;
	}


	public String getTituloPromocion() {
		return tituloPromocion;
	}


	public void setTituloPromocion(String tituloPromocion) {
		this.tituloPromocion = tituloPromocion;
	}
	
	@Override
	public String toString() {
		return "Promoción [idPromocion=" + idPromocion + ", tituloPromocion=" + tituloPromocion +  "]";
	}
	
	
}
