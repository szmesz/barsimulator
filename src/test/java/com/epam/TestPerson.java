package com.epam;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPerson {
	
	Person person;

	@Before
	
	public void setUp() {
		person = new Person();
	}
	
	@Test
	public void testSayHelloShouldReturnPersonName() {
		assertEquals(person.sayHello("Joe", 20, true), "Hi! My name is Joe. I am a(n) 20 years old male");
	}
	
	@Test
	public void testHasEnoughMoneyShouldReturnMoney() {
		
	}
	
	@Test
	public void testDrinksOneShouldDecreaseMoneyAndIncreaseDrunknessAndIncreaseMoneyOfBartenderAndGenerateDirtyGlassAndCheckLimitOfDrunknessWhenDrinksOne() {
		person.setMoney(10);
		person.setDrunkness(10);
		person.setInTheBar(true);
		person.setName("Joe");
		Bartender bartender = new Bartender();
		bartender.setMoney(20);
		bartender.setDirtyGlass(5);
		
		person.drinksOne(bartender);
		
		assertEquals(9, person.getMoney());
		assertEquals(11, person.getDrunkness());
		assertEquals(21, bartender.getMoney());
		assertEquals(6, bartender.getDirtyGlass());
		assertEquals(false, person.seeIfDrunknessIsOverFourty());
		
	}
	
	@Test
	public void testIfPersonHasNotEnoughMoneyShouldReturnNoSufficientMoney() {
		person.setMoney(0);
		Bartender bartender = new Bartender();
		person.drinksOne(bartender);
		person.hasEnoughmoneyToDrinkOne();
		person.noSufficientMoney();
		
		
		//assertEquals(person.money, person.hasEoughmoneyToDrinkOne());
		assertEquals(person.noSufficientMoney(), person.hasEnoughmoneyToDrinkOne());
		
	}
	
	@Test
	public void shouldNotDrinkWhenNotInTheBar() {
		person.setInTheBar(false);
		
		
		
	}
	
}
