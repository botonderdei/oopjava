package tomb;

public class Tomb {


	public static void main(String[] args) {
		int[] tomb=new int[10];
		for(int i=0; i<tomb.length; i++){
		tomb[i]=i+1;
		}
		int max=tomb[0];
		
		for(int i=0; i<tomb.length;i++)
		{
		if(max<tomb[i]){
			max=tomb[i];
			
			}
			
		}
		System.out.println(max);
		
	}

}
