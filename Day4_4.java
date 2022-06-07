public class Day4_4{
	public static void main(String[] args){
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				System.out.print((j+1)*2);
				if(j != 3){
				System.out.print("\t");
				}else if(i != 3){
				System.out.print("\n");
				}
			}
		}		

	}
}