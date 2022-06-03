public class Day3_4{
	public static void main(String[] args){
		int counter = 0;
		
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				System.out.print(++counter);
				if(j != 3)
				System.out.print("\t");
				else
				System.out.print("\n");		
			}
		}
  	}
}