package com.epam;

public class Bar {
	/*
	 * static Person person; static Bartender bartender; static Drink drink; static
	 * Student student;
	 */
	public static void main(String[] args) {

		Person joe = new Person("Joe", 25, true, 200, 0, true);
		Bartender bartender = new Bartender("Jack", 50, true, 0, 0, true, 0);
		Drink drink = new Drink(40, 38, "rum");
		Student student = new Student("Sue", 20, false, 50, 0, true, 0);
		joe.sayHello("Joe", 25, true);
		joe.drinksOne(bartender);
		joe.drinksOne(bartender);
		Drink rum = new Drink(12, 20, "rum");
		joe.drinksSomething(bartender, rum);
		student.sayHello("Sue", 20, false);
		student.setInTheBar(true);
		student.drinksSomething(bartender, rum);
		bartender.washTheDirtyGlasses();
		Beer beer = new Beer(2, 1, drink.getName());
		student.drinksSomething(bartender, beer);
		student.isStudied(3);
		student.drinksOne(bartender);
		student.isStudied(2);
		Person p2 = new Person("Bill", 28, true, 0, 0, true);
		Beer beer1 = new Beer(2, 1, drink.getName());
		Bouncer bouncer = new Bouncer("Robert", 40, true, 20, 0, true, false);
		joe.makeingTrouble(bouncer, joe, p2, 1);
		bouncer.drinksSomething(bartender, beer1);
		Drink wine = new Wine(12, 14, drink.getName(), 2010);
		student.drinksSomething(bartender, wine);
		Drink miscDrink = new MiscDrink(wine, beer1, drink, beer);
		joe.drinksSomething(bartender, miscDrink);
		student.drinksSomething(bartender, miscDrink);
		student.isStudied(3);

	}
}
