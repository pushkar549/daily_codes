import java.util.*;
public class Day3_5{
	public static void main(String[] args){
     		Scanner sc = new Scanner(System.in);
		int physics = sc.nextInt();
		int chemistry = sc.nextInt();
		int biology = sc.nextInt();
		int maths = sc.nextInt();
		int computer = sc.nextInt();

		float percentage = (physics + chemistry + biology + maths + computer) / 5;
		
		if(percentage >= 90){
			System.out.println(percentage+" : Grade A");
		}else if(percentage >= 80){
			System.out.println(percentage+" : Grade B");
		}else if(percentage >= 70){
			System.out.println(percentage+" : Grade C");
		}else if(percentage >= 60){
			System.out.println(percentage+" : Grade D");
		}else if(percentage >= 40){
			System.out.println(percentage+" : Grade E");
		}else if(percentage < 40){
			System.out.println(percentage+" : Grade F");
		}
		
  	}
}