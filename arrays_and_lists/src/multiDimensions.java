import java.util.Scanner;


public class multiDimensions {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		
		int startCol = 0;
		long sum = 0;
		
		long[][] matrix = new long[n][n]; //multi array
		for(int i = 0; i < n; i++){
			
			for(int j = 0; j < n; j++){
				matrix[i][j] =  (long) Math.pow(2, i + j);
				if(j >= startCol){ // change this to include or not the main diagonal
					sum += matrix[i][j];
				}
			}
			
			startCol++;
		}
		System.out.println(sum);
	}
}
