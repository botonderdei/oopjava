package alkalmazott;

import java.util.Scanner;

public class AlkalmazottFut {
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       
       
       System.out.println("Kérem az alkalmazott számát:");
       int numberOfEmp=sc.nextInt();
       
       Alkalmazott[] alkArray = new Alkalmazott[numberOfEmp];
       
       for(int i=0;i<alkArray.length;i++)
       {
    	   System.out.println("Kérem az " + (i+1) +". alkalmazott nevét: ");
           String name=sc.next();
    	   
    	   System.out.println("Kérem az " + (i+1) +". alkalmazott korát: ");
           int age=sc.nextInt();  
    	   
    	   System.out.println("Kérem az " + (i+1) +". alkalmazott fizetését: ");
           int payment=sc.nextInt();  
           
           alkArray[i]=new Alkalmazott(name, age, payment);
       }
       
       for(Alkalmazott a : alkArray)
    	   System.out.println(a.toString());
       
       for(Alkalmazott a : alkArray){
    	   if(a.getEvekNyugdijig()<5)
    		   System.out.println(a.toString());
       }
       
       int sum=0;
       double average=0.0;
       
       for(int i=0; i<alkArray.length;i++){
    	   sum= sum+alkArray[i].getEvekNyugdijig();
       }
       average=(double)sum/(double) numberOfEmp;
       
       
       
       sc.close();
				
	}

}
