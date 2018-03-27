package alkalmazott;

public class Alkalmazott {

	private String name;
	private int age;
	private int payment;
	private static int ageLimit = 65;

	public Alkalmazott(String name, int age, int payment) {
		this.name = name;
		this.age = age;
		this.payment = payment;

	}

	public Alkalmazott(String name, int age) {
		this.name = name;
		this.age = age;
		this.payment = 10000 * age;

	}

	public int getEvekNyugdijig() {
		return ageLimit - this.age;
	}

	public String toString() {
		return "Név: " + this.name + "Kor: " + this.age + " Fizetés: "
				+ this.payment + "Évek száma nyugdíjig: " + getEvekNyugdijig();
	}

	public void setNyugdijkorhatar(int ageLimitIn) {
		ageLimit = ageLimitIn;
	}

	public Alkalmazott getAlkEvekNyugdijig(Alkalmazott a1, Alkalmazott a2) {
		if (a1.getEvekNyugdijig() > a2.getEvekNyugdijig())
			return a1;
		else
			return a2;

	}

}
