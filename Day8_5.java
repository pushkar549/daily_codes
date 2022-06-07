import java.util.*;
public class Day8_5{

public static int fact(int n){
	if(n == 1 || n == 0){
		return 1;
	}

 return n * fact(n-1);
}
public static void main(String[] arggs){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println("The factorial of "+n+" is: "+fact(n));
}
}