package com.epam;

public class Bartender extends Person {

	private static int dirtyGlass = 0;
	private int money;

	public Bartender(String name, int age, boolean sex, int money, int drunkness, boolean inTheBar, int dirtyGlass) {
		super(name, age, sex, drunkness, inTheBar);
		this.money = money;
	}

	public Bartender() {
	}

	public int washTheDirtyGlasses() {
		int numberOfDirtyGlasses = 0;
		if (dirtyGlass > 0) {
			dirtyGlass--;
			numberOfDirtyGlasses = dirtyGlass;
			System.out.println("Bartender has washed some dirty glasses. The number of dirty glasses: " + numberOfDirtyGlasses);
			return numberOfDirtyGlasses;
		} else {
			System.out.println("There is no dirty glass in the bar. The number of dirty glasses in the bar: " + numberOfDirtyGlasses);
			return numberOfDirtyGlasses;
		}
	}

	public int getDirtyGlass() {
		return dirtyGlass;
	}

	public void setDirtyGlass(int dirtyGlass) {
		Bartender.dirtyGlass = dirtyGlass;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

}
