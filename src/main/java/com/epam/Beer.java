package com.epam;

public class Beer extends Drink {

	private String name = "beer";
	private int price;
	private int alcVol;

	public Beer(int price, int alcVol, String name) {
		this.price = price;
		this.alcVol = alcVol;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
