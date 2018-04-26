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
		person.setMoney(10);

		assertEquals(10, person.getMoney());

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
	public void testIfPersonHasNotEnoughMoneyShouldNotDrink() {
		person.setMoney(0);
		person.setDrunkness(10);
		Bartender bartender = new Bartender();
		person.drinksOne(bartender);

		assertEquals(10, person.getDrunkness());

	}

	@Test
	public void testShouldNotDrinkWhenNotInTheBar() {
		person.setDrunkness(10);
		person.setInTheBar(false);
		Bartender bartender = new Bartender();
		person.drinksOne(bartender);

		assertEquals(10, person.getDrunkness());

	}

	@Test
	public void testShouldNotDrinkWhenNotInTheBarAndHasNoMoney() {
		person.setDrunkness(10);
		person.setMoney(0);
		person.setInTheBar(false);
		Bartender bartender = new Bartender();
		person.drinksOne(bartender);

		assertEquals(10, person.getDrunkness());
		assertEquals(0, person.getMoney());

	}

	@Test
	public void testDrinksSomethingShouldDecreaseMoneyAndIncreaseDrunknessAndIncreaseMoneyOfBartenderAndGenerateDirtyGlassAndCheckLimitOfDrunknessWhenDrinksSomething() {
		person.setMoney(10);
		person.setDrunkness(10);
		person.setInTheBar(true);
		person.setName("Joe");
		Bartender bartender = new Bartender();
		bartender.setMoney(20);
		bartender.setDirtyGlass(5);
		Drink drink = new Drink();
		drink.setAlcVol(3);
		drink.setPrice(5);
		drink.setName("beer");

		assertEquals("Joe is drinking: beer Joe's money is: 5; Joe's drunkness is: 13",
				person.drinksSomething(bartender, drink));
		assertEquals(25, bartender.getMoney());
		assertEquals(6, bartender.getDirtyGlass());
		assertEquals(false, person.seeIfDrunknessIsOverFourty());

	}

	@Test
	public void testIfDrunknessIsOverFourtyShouldFallenAsleep() {
		person.setDrunkness(40);

		assertEquals(true, person.seeIfDrunknessIsOverFourty());

	}

	@Test
	public void testIfPersonHasNotEnoughMoneyShouldNotDrinkSomething() {
		person.setMoney(0);
		person.setDrunkness(10);
		Bartender bartender = new Bartender();
		Drink drink = new Drink();
		drink.setPrice(5);
		person.drinksSomething(bartender, drink);

		assertEquals(0, person.getMoney());

	}
	

}







