package main.clases;

import java.util.List;

public class Torneo {
	private List<Equipo> equipos;
	private Equipo ganador;
	// TODO: cambiar a Map
	private List<Equipo> posiciones;
	private List<Jugador> goleadores;
	private List<Partido> partidos;
	private String copa;
	
	public Torneo(List<Equipo> equipos, Equipo ganador, List<Equipo> posiciones, List<Jugador> goleadores,
			String copa) {
		this.equipos = equipos;
		this.ganador = ganador;
		this.posiciones = posiciones;
		this.goleadores = goleadores;
		this.copa = copa;
	}

	public Equipo getGanador() {
		return ganador;
	}

	public void setGanador(Equipo ganador) {
		this.ganador = ganador;
	}

	public String getCopa() {
		return copa;
	}

	public void setCopa(String copa) {
		this.copa = copa;
	}

	@Override
	public String toString() {
		return "Torneo [equipos=" + equipos + ", ganador=" + ganador + ", posiciones=" + posiciones + ", goleadores="
				+ goleadores + ", copa=" + copa + "]";
	}
	
}
