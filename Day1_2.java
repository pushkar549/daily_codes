import java.util.*;
public class Day1_2{
public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 char c = sc.nextLine().charAt(0);
 
 String vowels = "aeiou";
 
if(Character.isLetter(c))
 System.out.println(c+" is "+(vowels.contains((""+c).toLowerCase())? "vowel" : "consonant"));
else
System.out.println("Please enter a valid alphabate");
}
}