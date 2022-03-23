package net;

public class contenido {
	
	private String Titulo;
	private String Informacion;
	private int A�o_estreno;
	private long Duracion;
	private boolean Trending;
	
	public contenido(String Titulo, String Informacion, int A�o_estreno, long Duracion, boolean Trending) {
		this.Titulo = Titulo;
		this.Informacion = Informacion;
		this.A�o_estreno = A�o_estreno;
		this.Duracion = Duracion;
		this.Trending = Trending;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getInformacion() {
		return Informacion;
	}

	public void setInformacion(String informacion) {
		Informacion = informacion;
	}

	public int getA�o_estreno() {
		return A�o_estreno;
	}

	public void setA�o_estreno(int a�o_estreno) {
		A�o_estreno = a�o_estreno;
	}

	public long getDuracion() {
		return Duracion;
	}

	public void setDuracion(long duracion) {
		Duracion = duracion;
	}

	public boolean isTrending() {
		return Trending;
	}

	public void setTrending(boolean trending) {
		Trending = trending;
	}
	
	@Override
	public String toString() {
		return "Contenido [Titulo=" + Titulo + ", Informacion=" + Informacion + ", A�o_estreno=" + A�o_estreno
				+ ", Duracion=" + Duracion + ", Trending=" + Trending;
	}
	
}