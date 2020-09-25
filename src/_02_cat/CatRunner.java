package _02_cat;

public class CatRunner {
public static void main(String[] args) {
	Cat kitty = new Cat("bob");
	kitty.meow();
	kitty.printName();
	for (int i = 0; i < 9; i++) {
	kitty.kill();
	}
}
}
