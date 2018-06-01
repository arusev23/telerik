import java.util.ArrayList;
import java.util.Scanner;

// Да си прегледам задачата ред по ред вкъщи

public class Indices {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); in.nextLine();
		
		String[] humanInput = in.nextLine().split(" ");
		int[] numbers = new int[n];
		for(int i = 0; i < n; i++){
			numbers[i] = Integer.valueOf(humanInput[i]);
		}
		
		boolean[] used = new boolean[n];
		for(int i = 0; i < n; i++){
			used[i] = false;
		}
		
		ArrayList<Integer> result = new ArrayList<>(); // лист за резултата
		
		int cycleStartIndex = -1;
		int currentIndex = 0;
		while(-1 < currentIndex  && currentIndex < n){
			
			if(used[currentIndex]){
				cycleStartIndex = currentIndex;
				break;
			}
			
			used[currentIndex] = true;
			result.add(currentIndex);
			currentIndex = numbers[currentIndex];
		}
		
		StringBuilder output = new StringBuilder();
		for(int x : result){
			if(cycleStartIndex != -1 && x == cycleStartIndex){
				output.append("(");
			}
			output.append(x);
			output.append(" ");
		}
		
		if(cycleStartIndex != -1){
			output.append(")");
		}
		String outputString = output.toString();
		outputString = outputString.replace(" (", "(");
		outputString = outputString.replace(" )", ")");
		outputString = outputString.trim();
		
		System.out.println(outputString);
	}
}
