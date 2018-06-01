import java.util.Scanner;

// Have to finish at home

public class Bounce {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); in.nextLine();
		int m = in.nextInt(); in.nextLine();
		
		long[][] matrix = new long[n][m]; //multi array
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				matrix[i][j] =  (long) Math.pow(2, i + j);
			}
		}
		
		int currentRow = 0, currentCol = 0;
		long sum = 0;
		boolean rowWall = false, colWall = false;
		while(true){
			sum += matrix[currentRow][currentCol];
			if(currentRow < n-1 && rowWall == false){
				currentRow++;
			}else{
				rowWall = true;
			}
			
			if(currentCol < m -1 && colWall == false){
				currentCol++;
			}else{
				colWall = true;
			}
			
			if(rowWall == true && currentRow != 0){
				currentRow--;
			}else{
				rowWall = false;
			}
			
			if(colWall == true && currentCol != 0){
				
			}
		}
	}
}
