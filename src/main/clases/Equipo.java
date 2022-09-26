package main.clases;

public class Equipo {
	
	private Jugador [] jugadores;
	private int cantGolesAFavor;
	private int cantGolesEnContra;
	// TODO: agregar cantidad de partidos jugados, ganados, empatados y perdidos.

	public Equipo() {
		jugadores = new Jugador[20];
	}
	
	public void agregarJugador(Jugador jugador) {
		if (jugador.getId() - 1 <= jugadores.length) {
			jugadores[jugador.getId() - 1] = jugador;
		}
	}
	
	public Boolean buscarJugadorPorId(int id) {
		// Foreach en Java
		for (Jugador jugador : jugadores) {
			if (jugador.getId() == id) {
				return true;
			}
		}
		return false;
	}
	
	
}
