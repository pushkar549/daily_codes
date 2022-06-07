public class Day8_1{
public static void main(String[] arggs){
	for(int i = 0; i < 4; i++){
		for(int j = 0; j <=i; j++){
			System.out.print((i+1));
			if(j != i){
				System.out.print(" ");
			}else if(i != 3){
				System.out.print("\n");
			}
		}
	}
}
}