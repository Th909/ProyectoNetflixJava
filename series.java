package net;

public class series {
	
	public int nTemporadas;
	public int nCapitulos;
	
	public series(int nTemporadas, int nCapitulos) {
		this.nTemporadas=nTemporadas;
		this.nCapitulos = nCapitulos;
	}
	
	public int getnTemporadas() {
		return nTemporadas;
	}
	public void setnTemporadas(int nTemporadas) {
		this.nTemporadas = nTemporadas;
	}
	public int getnCapitulos() {
		return nCapitulos;
	}
	public void setnCapitulos(int nCapitulos) {
		this.nCapitulos = nCapitulos;
	}
	
	@Override
	public String toString() {
		return ", NºCapítulos= "+nCapitulos+", NºTemporadas= "+nTemporadas+"]";
	}
	
}
