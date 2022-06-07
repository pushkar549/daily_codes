import java.util.*;
public class Day7_1{
public static void main(String[] arggs){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();

System.out.println("The addition is : "+(a+b));
System.out.print("The substraction is : "+((a > b) ? (a-b) : (b-a)));
}
}