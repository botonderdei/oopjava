package myproducts;

public class Bread extends Product {
	private double amount;
	

	public Bread(String name, int netPrice, int percentage, double amount) {
		super(name, netPrice, percentage);
		this.amount=amount;
	}
	
	public double getBreadPrice(){
		return this.getGrossPrice()/this.amount;
	}

	
	public String toString(){
		return super.toString() + " egységár:" +(int)this.getGrossPrice()/this.amount;
	}
	
	public double getAmount(){
		return this.amount;
	}
	
	public boolean BreadPriceCompare(Bread b1, Bread b2){
		if(b1.getBreadPrice()>b2.getBreadPrice())
			return true;
		return false;
	}
	
}
