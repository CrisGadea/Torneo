package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import main.clases.Equipo;
import main.clases.Jugador;

class EquipoTest {

	@Test
	void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	void testQuePruebaQuePuedoAgregarUnJugadorAUnEquipo() {
		Jugador jugador1 = new Jugador(1, "Cristian Gadea", "Defensor", 2);
		Equipo equipo1 = new Equipo();
		equipo1.agregarJugador(jugador1);
		Assert.assertTrue(equipo1.buscarJugadorPorId(jugador1.getId()));
	}
	
	@Test
	void testQuePruebaQuePuedoAgregarMasDeUnJugadorAUnEquipo() {
		Jugador jugador1 = new Jugador(1, "Cristian Gadea", "Defensor", 2);
		Jugador jugador2 = new Jugador(2, "John Doe", "Defensor", 4);
		Equipo equipo1 = new Equipo();
		equipo1.agregarJugador(jugador1);
		equipo1.agregarJugador(jugador2);
		Assert.assertTrue(equipo1.buscarJugadorPorId(jugador1.getId()));
		Assert.assertTrue(equipo1.buscarJugadorPorId(jugador2.getId()));
	}

}
