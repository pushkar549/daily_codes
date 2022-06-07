public class Day7_5{
public static void main(String[] arggs){
	for(int i = 0; i < 4; i++){
		for(int j = 0; j <=i; j++){
			System.out.print("*");
			if(j != i){
				System.out.print(" ");
			}else if(i != 3){
				System.out.print("\n");
			}
		}
	}
}
}