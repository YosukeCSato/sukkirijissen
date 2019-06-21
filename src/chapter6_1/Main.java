package chapter6_1;

import java.util.function.IntBinaryOperator;

public class Main implements MyFunction {

	public static int twice(int x) {
		return x * 2;
	}

	public static int sub(int a, int b) {
		return a - b;
	}

	public static void main(String[] args) {
		IntBinaryOperator func = Main::sub;

		int a = func.applyAsInt(5, 3);
		System.out.println("5-3は" + a);


		MyFunction mf = Main::twice;
		int b = mf.call(2);
		System.out.println(b);
	}

	@Override
	public int call(int x) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}



}
