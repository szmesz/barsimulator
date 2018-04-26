package com.epam;

public class Drink {

	private int price;
	private int alcVol;
	private String name;

	public Drink(int price, int alcVol, String name) {
		this.price = price;
		this.alcVol = alcVol;
		this.name = name;
	}

	public void nonAlcoholicDrink(int alcVol) {
		alcVol = 0;
	}

	public Drink() {
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAlcVol() {
		return alcVol;
	}

	public void setAlcVol(int alcVol) {
		this.alcVol = alcVol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
