import java.util.*;
public class Day4_2{
	public static void main(String[] args){
      	Scanner sc = new Scanner(System.in);
		int units = sc.nextInt();
		double bill = 0;
		if(units > 250){
			bill = (50*0.50) + (100*0.75) + (100*1.20) + ((units - 250) * 1.50);
		}else if(units > 150 && units <= 250){
			bill = (50*0.50) + (100*0.75) + ((units-150)*1.20);
		}else if(units > 50 && units <= 150){
			bill = (50*0.50) + ((units-50)*0.75);
		}else if(units <= 50){
			bill = (units*0.50);
		}
		
		System.out.println("The bill is : "+bill);
		
	}
}