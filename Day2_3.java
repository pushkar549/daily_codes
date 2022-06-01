import java.util.*;
public class Day2_3{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();

	String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
	
	if(n <= 12 && n >= 1){
		if(n % 2 == ((n >= 8)? 1 : 0)){
			if(n == 2){
				System.out.println(months[n-1]+" has 28 or 29 days");
			}else{
				System.out.println(months[n-1]+" has 30 days");
			}
		}else{
			System.out.println(months[n-1]+" has 31 days");
		}
	}else{
		System.out.println("Invalid Number");
	}
	
	
}
}