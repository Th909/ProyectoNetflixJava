package net;

public class peliculas {
	
	public String productora;
	public String pais;
	
	public String getProductora() {
		return productora;
	}

	public void setProductora(String productora) {
		this.productora = productora;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public peliculas(String productora, String pais) {
		super();
		this.productora = productora;
		this.pais = pais;
	}

	@Override
	public String toString() {
		return ", País de origen= "+pais+", Productora= "+productora+"]";
	}
}
