import java.util.*;
public class Day2_4{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();

	for(int i = 0; i < n; i++){
		for(int j = 1; j <= 4; j++){
			System.out.print(j);
			System.out.print((j == 4)? "\n" : " ");
   		}
	}
	
	
}
}