package _06_duck;

public class snakeRunner {
public static void main(String[] args) {
	Snake joe = new Snake("crackers", 0);
	joe.slither();
	joe.hiss();
	Duck daffy = new Duck("donuts",5);
	daffy.quack();
}
}
