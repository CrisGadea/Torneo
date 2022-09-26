package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import main.clases.Equipo;
import main.clases.Jugador;

class JugadorTest {

	@Test
	void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	void testCrearUnJugadorEsPosible() {
		Jugador jugador1 = new Jugador();
		Assert.assertNotNull(jugador1);
	}
	
	@Test
	void testCrearUnJugadorConDatosDefaultEsPosible() {
		Jugador jugador1 = new Jugador(1, "Cristian Gadea", "Defensor", 2);
		Assert.assertNotNull(jugador1);
	}
	
	
}
