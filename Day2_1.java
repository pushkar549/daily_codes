import java.util.*;
public class Day2_1{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	char c = sc.nextLine().charAt(0);
	
	if(!Character.isLetter(c)){
		System.out.println("Invalid Input");
	}else if(Character.isUpperCase(c)){
		System.out.println(c+" is in upper case");
	}else{
		System.out.println(c+" is in lower case");
	}
}
}