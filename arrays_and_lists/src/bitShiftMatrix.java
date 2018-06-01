import java.math.BigInteger;
import java.util.Scanner;

// Трябва да се довърши вкъщи

public class bitShiftMatrix {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		int r = in.nextInt(); in.nextLine(); // ред
		int c = in.nextInt(); in.nextLine(); // колона
		int n = in.nextInt(); in.nextLine(); // брой търсени числа
		int[] cells = new int[n];
		for(int i = 0; i < n; i++){
			cells[i] = in.nextInt();
		}
		
		boolean[][] matrix = new boolean[r][c];
		int coef = Math.max(r, c);
		int currentRow = r - 1;
		int currentColumn = 0;
		BigInteger result = BigInteger.ZERO;
		
		for(int cell : cells){
			int targetR = cell / coef;
			int targetC = cell % coef;
			if(!matrix[currentRow][currentColumn]){
//				BigInteger
			}
			
		}
	}
}
