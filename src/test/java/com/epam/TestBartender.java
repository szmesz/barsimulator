package com.epam;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestBartender {

	Bartender bartender;

	@Before

	public void setUp() {
		bartender = new Bartender();
	}

	@Test
	public void testWhenBartenderWashDirtyGlassesShouldReturnNumberOfDirtyGlasses() {
		bartender.setDirtyGlass(5);

		bartender.washTheDirtyGlasses();

		assertEquals(4, bartender.getDirtyGlass());
	}

	@Test
	public void testWhenBartenderWashDirtyGlassesAndThereIsNoDirtyGlassShouldReturnNoDirtyGlassFound() {
		bartender.setDirtyGlass(0);

		assertEquals(0, bartender.washTheDirtyGlasses());
	}

}
