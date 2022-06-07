import java.util.*;
public class Day4_2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int units = sc.nextInt();
		double bill = 0;

		if(units > 250){
			bill = (units-250) * 1.50;
		}
		if(units > 150){
			bill = (units) * 1.20;
		}
	}
}