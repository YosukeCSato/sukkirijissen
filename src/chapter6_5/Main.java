package chapter6_5;

public class Main {

	public static void main(String[] args) {

		Func1 func1 = FuncList::isOdd;

		boolean bool = func1.call(53);
		System.out.println(bool);


		FuncList f = new FuncList();
		Func2 func2 = f::addNamePrefix;

		String s = func2.call(false, "田中");
		System.out.println(s);



	}

}
