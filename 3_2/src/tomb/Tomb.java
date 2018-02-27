package tomb;
import java.util.Random;
public class Tomb {

	public static void main(String[] args) {
		int array[]= new int[10];
		int evenarray[]= new int [10];
		Random rnd= new Random();
		
		
		for(int i=0; i<array.length;i++){
			array[i]=rnd.nextInt(50) + 1;
			//array[i]= (int)(Math.random()*50) + 1;
			//System.out.println(array[i]);
			}
		for(int e : array){
			
			System.out.println(e);
			
		}
		int max=evenarray[0];
		for(int i=0; i<array.length;i++){
			if(array[i]%2 ==0)
				evenarray[i]=array[i];
			
		int max2=array[0];
		for(int i=0; i<array.length;i++){
			if(array[i]%2 ==0)
				evenarray[i]=array[i];
		
			}
		System.out.println("A legnagyobb elem: " + max);
		
	}

}
