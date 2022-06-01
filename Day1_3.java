import java.util.*;
public class Day1_3{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	char c = sc.nextLine().charAt(0);
	
	if(Character.isLetter(c)){
	System.out.println("Its an alphabate");
	}else if(Character.isDigit(c)){
	System.out.println("Its a digit");
	}else{
	System.out.println("Its a character");
	}
}
}