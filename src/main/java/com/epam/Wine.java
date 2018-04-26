package com.epam;

public class Wine extends Drink {

	private int year;
	private int alcVol;
	private String name = "wine";
	private int price;

	public Wine(int price, int alcVol, String name, int year) {
		this.price = price;
		this.alcVol = alcVol;
		this.year = year;
	}

	public Wine() {

	}

	public int getAlcVol() {
		return alcVol;
	}

	public void setAlcVol(int alcVol) {
		this.alcVol = alcVol;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
