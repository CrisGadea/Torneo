package main.clases;

import java.util.Arrays;

public class Partido {
	
	private Equipo [] equipos;
	private double tiempo;
	private int golesE1, golesE2;
	private Equipo ganador;
	public Partido(Equipo[] equipos, double tiempo, int golesE1, int golesE2, Equipo ganador) {
		super();
		this.equipos = equipos;
		this.tiempo = tiempo;
		this.golesE1 = golesE1;
		this.golesE2 = golesE2;
		this.ganador = ganador;
	}
	public Equipo[] getEquipos() {
		return equipos;
	}
	public void setEquipos(Equipo[] equipos) {
		this.equipos = equipos;
	}
	public double getTiempo() {
		return tiempo;
	}
	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}
	public int getGolesE1() {
		return golesE1;
	}
	public void setGolesE1(int golesE1) {
		this.golesE1 = golesE1;
	}
	public int getGolesE2() {
		return golesE2;
	}
	public void setGolesE2(int golesE2) {
		this.golesE2 = golesE2;
	}
	public Equipo getGanador() {
		return ganador;
	}
	public void setGanador(Equipo ganador) {
		this.ganador = ganador;
	}
	@Override
	public String toString() {
		return "Partido [equipos=" + Arrays.toString(equipos) + ", tiempo=" + tiempo + ", golesE1=" + golesE1
				+ ", golesE2=" + golesE2 + ", ganador=" + ganador + "]";
	}
	
	

}
