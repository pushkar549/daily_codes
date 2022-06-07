import java.util.*;
public class Day7_4{
public static void main(String[] arggs){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
sc.nextLine();
char c = sc.nextLine().charAt(0);

	switch(c){
		case '+' : System.out.println("The addition of "+a+" & "+b+" is"+(a+b));
		break;
	case '-' : System.out.println("The Substraction of "+a+" & "+b+" is"+(a+b));
		break;
	case '*' : System.out.println("The Multiplication of "+a+" & "+b+" is"+(a+b));
		break;
	case '/' : System.out.println("The Division of "+a+" & "+b+" is"+(a+b));
		break;
	default : System.out.println("Please enter valid sign");
	}
}
}