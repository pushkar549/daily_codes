import java.util.*;
public class Day3_2{
	public static void main(String[] args){
     		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int r = sc.nextInt();
		int t = sc.nextInt();

		System.out.println("Simple Interest for "+t+" years on principal amount "+p+" is "+((p*r*t)/100));
		
  	}
}