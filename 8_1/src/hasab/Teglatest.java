package hasab;

public class Teglatest extends Hasab {
	private double a;
	private double b;

	public Teglatest(int height, double a, double b) {
		super(height);
		this.a = a;
		this.b = b;

	}

	public double baseArea() {
		return a * b;
	}
	
	public String toString(){
		return "A teglatest adatai: a oldal:" + this.a + "b oldal:" + this.b + "magassag: " + super.getHeight();
	}
}
