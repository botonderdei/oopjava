package masodfoku;

import java.util.Scanner;

public class Masodfoku {

	
	public static void main(String[] args)
	{


int egyutt[]=new int[3];		
int a=0;
int b=0;
int c=0;
double x1 = 0;
double x2 = 0;
Scanner sc = new Scanner(System.in);

	System.out.println("Kérem az 1. együtthatót: ");
	egyutt[0]=sc.nextInt();
	
	System.out.println("Kérem az 2. együtthatót: ");
	egyutt[1]=sc.nextInt();
	
	System.out.println("Kérem az 3. együtthatót: ");
	egyutt[2]=sc.nextInt();
	

	a=egyutt[0];
	b=egyutt[1];
	c=egyutt[2];
	
sc.close();	

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
