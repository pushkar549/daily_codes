import java.util.*;
public class Day5_5{
	public static void main(String[] args){	
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				if(i%2 == 0)
					System.out.print("0");
				else
					System.out.print("1");
				if(j !=3)
					System.out.print("\t");	
				else if(i != 3)
					System.out.println("\n");				
			}
		}
	}
}