package com.epam;

public class Student extends Person {

	private int scholarship;
	private int hoursOfStudy;

	public Student(String name, int age, boolean sex, int money, int drunkness, boolean isInTheBar, int scholarship) {
		super(name, age, sex, money, drunkness, isInTheBar);
		this.scholarship = scholarship;
		this.money = money;
	}

	public int getScholarship() {
		return scholarship;
	}

	public void setScholarship(int scholarship) {
		this.scholarship = scholarship;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getHoursOfStudy() {
		return hoursOfStudy;
	}

	public void setHoursOfStudy(int hoursOfStudy) {
		this.hoursOfStudy = hoursOfStudy;
	}

	@Override
	public boolean isInTheBar() {
		return super.isInTheBar();
	}

	@Override
	public void fallenAsleep() {
		super.fallenAsleep();
	}

	@Override
	public void goneHome() {
		super.goneHome();
	}

	@Override
	public void arrivedToTheBar() {
		super.arrivedToTheBar();
	}

	@Override
	public boolean setInTheBar(boolean isInTheBar) {
		return super.setInTheBar(isInTheBar);
	}

	@Override
	public String sayHello(String name, int age, boolean sex) {
		return super.sayHello(name, age, sex);
	}

	@Override
	public void drinksOne(Bartender bartender) {
		super.drinksOne(bartender);
	}

	@Override
	public void drinksSomething(Bartender bartender, Drink drink) {
		super.drinksSomething(bartender, drink);
	}

	@Override
	public void makeingTrouble(Bouncer bouncer, Person p1, Person p2, int numberOfBouncersInTheBar) {
		super.makeingTrouble(bouncer, p1, p2, numberOfBouncersInTheBar);
	}

	public void addScholarship() {
		this.money = this.scholarship + this.money;
	}

	public void isStudied(int hoursOfStudy) {
		this.scholarship = hoursOfStudy;
		addScholarship();

		System.out.println(getName() + " studied " + hoursOfStudy + " hours. Student's scholarship is: " + scholarship
				+ " Student's money is: " + this.money);
		this.scholarship = 0;
	}

}
