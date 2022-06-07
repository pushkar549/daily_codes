public class Day6_5{
	public static void main(String[] args){
		for(int i = 0; i < 4; i++){
			for(int j = 0; j <= i; j++){
				System.out.print("0");
				if(j < i){
					System.out.print("\t");
				}else if(i != 3){
					System.out.print("\n");
				}
			}
			
		}
	}
}