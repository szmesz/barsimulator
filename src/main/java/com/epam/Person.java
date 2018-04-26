package com.epam;

public class Person {

	private String name;
	private int age;
	private boolean sex;
	protected int money;
	private int drunkness;
	private boolean inTheBar;
	private String male = "male";
	private String female = "female";

	public Person() {
	}

	public Person(String name, int age, boolean sex, int money, int drunkness, boolean inTheBar) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.money = money;
		this.drunkness = 0;
		this.inTheBar = true;
		sayHello(name, age, sex);
	}

	public Person(String name, int age, boolean sex, int drunkness, boolean inTheBar) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.drunkness = 0;
		this.inTheBar = true;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getDrunkness() {
		return drunkness;
	}

	public void setDrunkness(int drunkness) {
		this.drunkness = drunkness;
	}

	public boolean isInTheBar() {
		return inTheBar;
	}

	public boolean setInTheBar(boolean inTheBar) {
		return this.inTheBar = inTheBar;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean getSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		while (sex == true) {
			male = Boolean.toString(sex);
		}
		female = Boolean.toString(sex);
		this.sex = sex;
	}

	public String sayHello(String name, int age, boolean sex) {

		String greeting;
		if (sex) {
			greeting = "Hi! My name is " + name + ". I am a(n) " + age + " years old " + male;
		} else {
			greeting = "Hi! My name is " + name + ". I am a(n) " + age + " years old " + female;
		}
		System.out.println(greeting);

		return greeting;
	}

	public void drinksOne(Bartender bartender) {
		if (inTheBar && hasEnoughmoneyToDrinkOne() != 0) {
			money--;
			drunkness++;
			giveMoneyToBartender(bartender);
			generateDirtyGlass(bartender);
			seeIfDrunknessIsOverFourty();
			drinking();
			moneyAndDrunkness();
		} else if (!inTheBar) {
			notInTheBar();
		} else {
			noSufficientMoney();
		}
	}

	private String notInTheBar() {
		String notPresent = getName() + " is not in the bar.";
		System.out.println(notPresent);
		return notPresent;
	}

	private String drinking() {
		String drinks = getName() + " is drinking.";
		System.out.println(drinks);
		return drinks;
	}

	private String moneyAndDrunkness() {
		String moneyDrunkness = getName() + "'s money is: " + money + "; " + getName() + "'s drunkness is: "
				+ drunkness;
		System.out.println(moneyDrunkness);
		return moneyDrunkness;
	}

	private int hasEnoughmoneyToDrinkOne() {
		if (money > 0) {
			return money;
		} else {
			noSufficientMoney();
		}
		return money;
	}

	private String noSufficientMoney() {
		String notEnoughMoney = "You have no sufficient amount of money to buy a drink";
		System.out.println(notEnoughMoney);
		return notEnoughMoney;
	}

	private void generateDirtyGlass(Bartender bartender) {
		bartender.setDirtyGlass(bartender.getDirtyGlass() + 1);
	}

	private void giveMoneyToBartender(Bartender bartender) {
		bartender.setMoney(bartender.getMoney() + 1);
	}

	protected void fallenAsleep() {
		System.out.println("My drunkness is: " + drunkness + " Good night!");
		drunkness = 0;
	}

	protected void goneHome() {
		inTheBar = false;
		System.out.println(name + " went home.");
		drunkness = 0;
	}

	public String drinksSomething(Bartender bartender, Drink drink) {
		String response;
		if (inTheBar && hasEnoughMoneyToDrinkSomething(drink) != 0) {
			money -= drink.getPrice();
			drunkness += drink.getAlcVol();
			giveMoneyToBartender(bartender, drink);
			generateDirtyGlass(bartender);
			seeIfDrunknessIsOverFourty();

			response = getName() + " is drinking: " + drink.getName() + " " + getName() + "'s money is: " + money + "; "
					+ getName() + "'s drunkness is: " + drunkness;

		} else {

			response = "you have no sufficient amount of money to buy anything";
		}
		System.out.println(response);
		return response;
	}

	private int hasEnoughMoneyToDrinkSomething(Drink drink) {
		if (drink.getPrice() < money && money > 0) {
			return money;
		} else {
			noSufficientMoney();
		}
		return money;
	}

	private void giveMoneyToBartender(Bartender bartender, Drink drink) {
		bartender.setMoney(bartender.getMoney() + drink.getPrice());

	}

	boolean seeIfDrunknessIsOverFourty() {
		boolean res;
		if (drunkness >= 40) {
			res = true;
			fallenAsleep();
		} else {
			res = false;
		}
		return res;
	}

	protected void isDrinkingNonAlcoholic(Bartender bartender, Drink drink, double getAlcVol) {
		drink.setAlcVol(0);
	}

	public void makeingTrouble(Bouncer bouncer, Person p1, Person p2, int numberOfBouncersInTheBar) {
		if (bouncer.isWorking()) {
			System.out.println(p1.name + " Started a fight with " + p2.name);
			System.out.println(p1.name + " made some trouble, so " + bouncer.getName() + " the bouncer helped him out");
			p1.goneHome();
		} else {
			System.out.println(p1.name + " Started a fight with " + p2.name);
			System.out.println(p1.name + " had some fun fighting with " + p2.name);
		}
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + ", money=" + money + ", drunkness="
				+ drunkness + ", inTheBar=" + inTheBar + ", male=" + male + ", female=" + female + "]";
	}

}
