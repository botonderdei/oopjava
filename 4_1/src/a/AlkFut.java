package a;

public class AlkFut {

	public static void main(String[] args) {
		Alkalmazott alkalmazott1 = new Alkalmazott();

		alkalmazott1.setName("Tomi");
		alkalmazott1.setPayment(8);

		System.out.println(alkalmazott1.szovegVissza());

		alkalmazott1.fizNov(15);
		System.out.println(alkalmazott1.szovegVissza());

		boolean isTrue = alkalmazott1.fizHatar(10, 20);
		if (isTrue)
			System.out.println("Hatarertek koze esik");
		else
			System.out.println("Nem esik hatarertek koze");

	}

}
