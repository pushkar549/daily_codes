import java.util.*;
public class Day3_1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		int side3 = sc.nextInt();

		if((side1*side1) == ((side2*side2)+(side3*side3))){
			System.out.println("Triangle is satisfying the pythagoras therom");
		}else if((side2*side2) == ((side1*side1)+(side3*side3))){
			System.out.println("Triangle is satisfying the pythagoras therom");
		}else if((side3*side3) == ((side2*side2)+(side1*side1))){
			System.out.println("Triangle is satisfying the pythagoras therom");
		}else{
			System.out.println("Triangle is not satisfying the pythagoras therom");
		}

	}

}