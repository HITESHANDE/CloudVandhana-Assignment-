package ExampleProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//We have Direct shuffle Method In list To Shuffle The Array So I am going With ArrayList
public class ShuffleArrayExample {
	public static void main(String[] args) {
		// Creation Of array Using ArrayList
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);

		// Shuffle the ArrayList
		Collections.shuffle(list);

		// Printing the shuffled array
		System.out.println("Shuffled array: " + list);
	}
}
