package com.epam;

public class MiscDrink extends Drink {

	public double averageAlcVol;
	private String name = "mixed drinks";
	private int alcVol;
	private int price;

	public MiscDrink(Drink drink1, Drink drink2, Drink drink3, Drink drink4) {
		miscDrink(drink1, drink2, drink3, drink4);
	}
	/*
	 * public MiscDrink(int price, int alcVol, String name, double averageAlcVol) {
	 * super(price, alcVol, name); this.averageAlcVol = averageAlcVol; }
	 */

	public double getAverageAlcVol() {
		return averageAlcVol;
	}

	public void setAverageAlcVol(double averageAlcVol) {
		this.averageAlcVol = averageAlcVol;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void miscDrink(Drink... drinks) {
		int numOfParams = 0;
		int alcTotal = 0;
		int price = 0;
		for (Drink drink : drinks) {
			numOfParams++;
			alcTotal = alcTotal + drink.getAlcVol();
			price += drink.getPrice();
		}
		averageAlcVol = alcTotal / numOfParams;
		this.alcVol = (int) averageAlcVol;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAlcVol() {
		return alcVol;
	}

	public void setAlcVol(int alcVol) {
		this.alcVol = (int) averageAlcVol;
	}

}
