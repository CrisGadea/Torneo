package main.clases;

import java.util.List;
import java.util.Map;

public class Torneo {
	private List<Equipo> equipos;
	private Equipo ganador;
	private Map<Equipo, Integer> posiciones;
	private Map<Jugador, Integer> goleadores;
	private List<Partido> partidos;
	private String copa;
	
	public Torneo(List<Equipo> equipos, Map<Equipo, Integer> posiciones, Map<Jugador, Integer> goleadores,
			String copa) {
		this.equipos = equipos;
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
