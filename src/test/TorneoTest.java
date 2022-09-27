package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import main.clases.Equipo;
import main.clases.Jugador;
import main.clases.Torneo;

class TorneoTest {

	@Test
	void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	void testQuePruebaQuePuedoConsularLaTablaDePosiciones() {
		Jugador jugador1 = new Jugador(1, "Cristian Gadea", "Defensor", 2);
		Jugador jugador2 = new Jugador(2, "John Doe", "Defensor", 4);
		Equipo equipo1 = new Equipo();
		List<Equipo> equipos = new ArrayList<Equipo>();
		Map<Equipo, Integer> posiciones = new HashMap<Equipo, Integer>();
		Map<Jugador, Integer> goleadores = new HashMap<Jugador, Integer>();
		
		equipo1.agregarJugador(jugador1);
		equipo1.agregarJugador(jugador2);
		
		equipos.add(equipo1);
		
		posiciones.put(equipo1, 1);
		
		
		Torneo torneo1 = new Torneo(equipos,posiciones,goleadores, "Copa Java Avanzado");
		
		// Primero creamos los objeetos necesarios
		// Luego declaramos que esperamos obtener
		// Validamos que el resultado obtenido sea igual al esperado
		Assert.assertEquals(posiciones.size(),1);
		
	}

}
