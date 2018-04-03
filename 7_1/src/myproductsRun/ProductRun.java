package myproductsRun;

import myproducts.Product;
import myproducts.Bread;

public class ProductRun {

	
	public static void main(String[] args) {
		Product p1= new Product("Product1", 100, 27);
		Bread b1 = new Bread("Bread1", 200, 27, 2);
		
		System.out.println("A p1 adatai "+ p1.toString());
		System.out.println("A b1 adatai "+ b1.toString());
   
		int priceCompare=p1.productCompare(b1);
		if(priceCompare==1)
			System.out.println("A p1 ára a nagyobb");
		else if(priceCompare==-1)
			System.out.println("A b1 ára a nagyobb");
		else
			System.out.println("Egyenlő");
		
	}

}
