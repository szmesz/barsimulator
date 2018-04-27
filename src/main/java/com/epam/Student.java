package com.epam;

public class Student extends Person {

	private int scholarship;
	private int hoursOfStudy;

	public Student(String name, int age, boolean sex, int money, int drunkness, boolean isInTheBar, int scholarship) {
		super(name, age, sex, money, drunkness, isInTheBar);
		this.scholarship = scholarship;
		this.money = money;
	}

	public Student() {

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

	public void fallenAsleep() {
		super.fallenAsleep();
	}

	public void goneHome() {
		super.goneHome();
	}

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
	public String drinksSomething(Bartender bartender, Drink drink) {
		return super.drinksSomething(bartender, drink);
	}

	@Override
	public void makeingTrouble(Bouncer bouncer, Person p1, Person p2, int numberOfBouncersInTheBar) {
		super.makeingTrouble(bouncer, p1, p2, numberOfBouncersInTheBar);
	}

	@Override
	boolean seeIfDrunknessIsOverFourty() {
		return super.seeIfDrunknessIsOverFourty();
	}

	private int addScholarship() {
		return this.money = this.scholarship + this.money;
	}
	public int studied(int hoursOfStudy) {
		this.scholarship = 0;
		this.scholarship += hoursOfStudy;
		addScholarship();
		System.out.println(getName() + " studied " + hoursOfStudy + " hours. Student's scholarship is: " + scholarship
				+ " Student's money is: " + this.money);
		return this.scholarship;
	}

}
