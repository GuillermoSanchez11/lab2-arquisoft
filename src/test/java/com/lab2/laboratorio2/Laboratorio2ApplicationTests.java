package com.lab2.laboratorio2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Laboratorio2ApplicationTests {

	@Autowired DataController dataController;

	@Test
	void health(){
		assertEquals("APLICACION FUNCIONANDO OK!", dataController.healthCheck());
	}
	@Test
	void version(){
		assertEquals("La version Actual es 1.0.0", dataController.version());
	}
	@Test
	void nationsLenght(){
		Integer nationsLength= dataController.getRandomCurrencies().size();
		assertEquals(10,nationsLength);
	}
	@Test
	void currenciesLenght(){
		Integer currenciesLength= dataController.getRandomNations().size();
		assertEquals(10,currenciesLength);
	}

	@Test
	void airlinesLenght(){
		Integer airlinesLength= dataController.getRandomAirlines().size();
		assertEquals(20,airlinesLength);
	}

}
