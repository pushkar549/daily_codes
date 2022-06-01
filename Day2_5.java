import java.util.*;
public class Day2_5{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();

	if((a+b+c) == 180 && (a != 0) && (b != 0) && (c != 0)){
		System.out.println("The triangle with angles "+a+" "+b+" & "+c+" is valid traiangle");
	}else{
				System.out.println("The triangle with angles "+a+" "+b+" & "+c+" is invalid traiangle");
	}
	
	
}
}