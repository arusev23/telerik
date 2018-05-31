import java.util.Scanner;


public class firstClass {
	public static void main(String[] args){
		
		// Is symmetric
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // брой числа в масива
		in.nextLine();
		
		for(int i = 0; i < n; i++){
			String[] array = in.nextLine().split(" ");
			int length = array.length;
			boolean isSymmetric = true;
			
			for (int j = 0; j < length / 2; j++) {
				if(!array[j].equals(array[length - 1 - j])){
					isSymmetric = false;
					break;
				}
			}
			
			System.out.println(isSymmetric ? "Yes" : "No");
		}

	}
}