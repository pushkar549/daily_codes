import java.util.*;
public class Day5_4{
	public static void main(String[] args){	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= num; i++){
			sum = sum + i;
		}
		System.out.println("The sum is : "+sum);
		System.out.println("The average is : "+((double)sum/num));
	}
}