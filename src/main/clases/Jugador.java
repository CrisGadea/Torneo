package main.clases;

public class Jugador {
	
	private int id, nroCamiseta;
	private String nombreCompleto, posicion;

	public Jugador(int id, String nombreCompleto, String posicion, int nroCamiseta) {
		this.id = id;
		this.nombreCompleto = nombreCompleto;
		this.posicion = posicion;
		this.nroCamiseta = nroCamiseta;
	}

	public Jugador() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNroCamiseta() {
		return nroCamiseta;
	}

	public void setNroCamiseta(int nroCamiseta) {
		this.nroCamiseta = nroCamiseta;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	

	
}
