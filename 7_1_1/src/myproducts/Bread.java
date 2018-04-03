package myproducts;

public class Bread extends Product {
	private double amount;

	public Bread(String name, int netprice, int percentage, double amount) {
		super(name, netprice, percentage);
		this.amount = amount;
	}

	public double getBreadPrice() {
		return this.getGrossPrice() / this.amount;
	}

	public String toString() {
		return super.toString() + "egysegar: " + this.getBreadPrice();
	}

	public double getAmount() {
		return this.amount;
	}

	public static boolean BreadPriceCompare(Bread b1, Bread b2) {
		if (b1.getBreadPrice() > b2.getBreadPrice())
			return true;
		else
			return false;
	}

}
