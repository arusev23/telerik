import java.util.ArrayList;


public class arrayListDemo {
	public static void main(String[] args){
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		list.set(1, 4);
		list.remove(1);
		
//		for (Integer item : list) { 
//		    System.out.println(item);
//		}
		list.forEach(System.out::println);
		
	}
}
