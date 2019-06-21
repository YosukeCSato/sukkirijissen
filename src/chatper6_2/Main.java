package chatper6_2;

import java.util.function.IntBinaryOperator;

public class Main {

	public static void main(String[] args) {

		IntBinaryOperator func = (int a, int b) -> { return a - b; };

		int a = func.applyAsInt(6,  96);
		System.out.println(a);

		Hero h = new Hero();
		h.setHp(100);

		MyFunction func2 = (Hero s) -> { return s.getHp(); };
		System.out.println(func2.call(h));

		Time func3 = () -> { return new java.util.Date(); };
		System.out.println(func3.call());

		long[] array = new long[] { 10, 20, 30, 40, 50 };

		SortArray func4 = (long[] array) -> {
			long[] array2 = java.util.Arrays.copyOf(array, array.length);
			java.util.Arrays.parallelSort(array2);
			return array2;
		};



	}

}
