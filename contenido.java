package net;

public class contenido {
	
	private String Titulo;
	private String Informacion;
	private int Año_estreno;
	private long Duracion;
	private boolean Trending;
	
	public contenido(String Titulo, String Informacion, int Año_estreno, long Duracion, boolean Trending) {
		this.Titulo = Titulo;
		this.Informacion = Informacion;
		this.Año_estreno = Año_estreno;
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

	public int getAño_estreno() {
		return Año_estreno;
	}

	public void setAño_estreno(int año_estreno) {
		Año_estreno = año_estreno;
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
		return "Contenido [Titulo=" + Titulo + ", Informacion=" + Informacion + ", Año_estreno=" + Año_estreno
				+ ", Duracion=" + Duracion + ", Trending=" + Trending;
	}
	
}