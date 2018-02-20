package masodfoku;

public class Masodfoku {

	
	public static void main(String[] args)
	{

int a=1;
int b=8;
int c=3;
double x1;
double x2;
	
	double gyokalatt=0;
	
	gyokalatt=Math.sqrt((b * b) - 4 * a * c);
	
	if(Double.isNaN(gyokalatt)) {
		
		
	System.out.println("Nincs valos megoldas");
		
	}else
	{
	x1=(b*(-1)+gyokalatt)/2*a;
	x2=(b*(-1)-gyokalatt)/2*a;
	System.out.println("x1: " + x1 + "  x2 "+x2);	
	}
	
	
	
	
	}
	
}
