package com.epam;

public class Bouncer extends Person {

	private boolean working;

	private static int numberOfBouncersInTheBar = 0;

	public Bouncer(String name, int age, boolean sex, int money, int drunkness, boolean inTheBar, boolean working) {
		super(name, age, sex, money, drunkness, inTheBar);
		this.working = working;

	}

	public static int getNumberOfBouncersInTheBar() {
		return numberOfBouncersInTheBar;
	}

	public static void setNumberOfBouncersInTheBar(int numberOfBouncersInTheBar) {
		Bouncer.numberOfBouncersInTheBar = numberOfBouncersInTheBar;
	}

	public void setWorking(boolean working) {
		this.working = working;
	}

	public boolean isWorking() {
		if (isInTheBar() && working) {
			System.out.println(getName() + " the bouncer is working tonight");
		} else {
			notWorking();
		}
		return working;
	}

	private void notWorking() {
		System.out.println("The bouncer is not working now.");

	}

	public int ConutTheBouncers(boolean working, int numberOfBouncersInTheBar) {
		if (working == true) {
			for (int n = 0; n <= numberOfBouncersInTheBar; n++) {
				Bouncer.numberOfBouncersInTheBar = numberOfBouncersInTheBar;
				System.out.println("The number of bouncers in the bar is: " + numberOfBouncersInTheBar);
			}
		}
		return numberOfBouncersInTheBar;

	}

	@Override
	public boolean isInTheBar() {
		return super.isInTheBar();
	}

	@Override
	public String drinksSomething(Bartender bartender, Drink drink) {
		if (working == false && isInTheBar()) {
			super.drinksSomething(bartender, drink);
			System.out.println(getName() + " the bouncer is not working so drinks: " + drink.getName());

		} else {
			isDrinkingNonAlcoholic(bartender, drink, 0);
			System.out.println(getName() + " the bouncer is working so drinks only non alcoholic beverages");
		}
		return null;

	}

	@Override
	public void drinksOne(Bartender bartender) {
		if (isInTheBar() && isWorking() == false) {
			super.drinksOne(bartender);
		} else {
			System.out.println(getName() + " the bouncer is working so drinks only non alcoholic beverages");
		}
	}
}
