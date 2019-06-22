package chapter6_3;

public class Character {

	private String name;
	private int hp = 5;

	public Character(String name) {
		this.name = name;
	}

	public void sleep() {
		System.out.println(this.name + "は眠った。");
	}

}
