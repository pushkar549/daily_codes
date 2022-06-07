import java.util.*;
public class Day4_3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the sex");
		char sex = sc.nextLine().charAt(0);
		System.out.println("Enter the merital status");
		char merital_status = sc.nextLine().charAt(0);

		if(sex == 'F'){
			System.out.println("Will work in urban areas");
		}else if(sex == 'M' && (age >=20 && age <=40)){
			System.out.println("Can work any where");

		}else if(sex == 'M' && (age >=40 && age <=60)){
			System.out.println("Work in urban areas");

		}else{
			System.out.println("Error");
		}

	}
}