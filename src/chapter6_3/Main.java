package chapter6_3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<Integer>();

		list1.add(1450);
		list1.add(2345);
		list1.add(345);


		list1.parallelStream().forEach(i -> System.out.println(i * 2));

		Character c1 = new Character("吉祥寺");
		Character c2 = new Character("高円");
		Character c3 = new Character("国分寺");

		List<Character> list2 = new ArrayList<Character>();

		list2.add(c1);
		list2.add(c2);
		list2.add(c3);

		list2.parallelStream().forEach(c -> c.sleep());

		//int[] data = { 3, 64, 75, 853, 64, 773, 4567 };
		//Stream st = Arrays.stream(data);

	}
}
