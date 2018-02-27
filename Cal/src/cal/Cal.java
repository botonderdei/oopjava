package cal;

import java.util.Scanner;

public class Cal {

	public static void main(String[] args) {
		int number1= 0;
		int number2= 0;
        String op = "";
        Scanner sc = new Scanner(System.in);
        double res= 0;
        
        String array[] = new String[10];
        
    /* System.out.println("Kerem az elso szamot: ");
     number1 = sc.nextInt();
     
     System.out.println("Kerem az operandust: ");
     op = sc.next();
     
     System.out.println("Kerem az masodik szamot: ");
     number2 = sc.nextInt();
     */
        System.out.println("Kerem az elso szamot: ");
        array=sc.nextLine().split(" ");
        
        number1=Integer.parseInt(array[0]);
        op=array[1];
        number2=Integer.parseInt(array[2]);
        
        
		sc.close();
		
	switch (op) {
	case "+" : res = number1 + number2;
	     break;
	     
	case "-" : res = number1 - number2;
         break;
    
	case "*" : res = number1 * number2;
        break;
        
	case "/" : 
		if(number2==0)
			System.out.println("0 val nem lehet osztani");
		else
		    res = number1 / number2;
        break;
	
	
	
	
	}
		
		
		System.out.println(res);
     
	}

}
