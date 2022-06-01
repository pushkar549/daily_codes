import java.util.*;
public class Day2_2{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();

	String[] days = {"Monday","Tueday","Wednesday","Thursday","Friday","Saturday","Sunday"};
	
	if(n <= 6 && n >= 0){
		System.out.println(days[n]);
	}else{
		System.out.println("Invalid Number");
	}
	
	
}
}