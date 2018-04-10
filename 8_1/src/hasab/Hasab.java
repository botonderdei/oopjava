package hasab;

public abstract class Hasab {

	private int height;
	
	public Hasab(int height){
		this.height=height;
	}
	
	public int getHeight(){
		return this.height;
	}
	public abstract double baseArea();
	
	public double getVolume(){
		return baseArea()*this.height;
	}
	public boolean hasabCompare(Hasab other){
		if(this.getVolume()>other.getVolume())
			return true;
					return false;
	}
}
