package chatper6_2;

import java.util.function.IntBinaryOperator;
import java.util.function.IntToDoubleFunction;

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

		long[] array = new long[] { 2110, 10, 50, 3403, 560 };

		for (long l : array) {
			System.out.println(l);
		}

		SortArray func4 = (long[] ar) -> {
			long[] array2 = java.util.Arrays.copyOf(ar, ar.length);
			java.util.Arrays.sort(array2);
			return array2;
		};
		
		System.out.println("配列の並び替えを行なって出力します。");

		for (long l : func4.sortArray(array)) {
			System.out.println(l);
		}

		double b = 1.24;
		IntToDoubleFunction func12 = (int x) -> { return x * x * b; };

		double i = func12.applyAsDouble(10);
		System.out.println(i);



	}

}
