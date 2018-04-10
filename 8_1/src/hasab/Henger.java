package hasab;

public class Henger extends Hasab {
	private double radius;

	public Henger(int radius, int height) {
		super(height);
		this.radius = radius;

	}

	public double baseArea() {
		return Math.pow(radius, 2) * Math.PI;
	}

	public String toString() {
		return "A henger adatai: sugár: " + this.radius + "magasság: "
				+ super.getHeight();
	}

}
