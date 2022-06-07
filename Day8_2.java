public class Day8_2{
public static void main(String[] arggs){
	int counter = 0;
	for(int i = 0; i < 4; i++){
		for(int j = 0; j <=i; j++){
			System.out.print(++counter);
			if(j != i){
				System.out.print(" ");
			}else if(i != 3){
				System.out.print("\n");
			}
		}
	}
}
}