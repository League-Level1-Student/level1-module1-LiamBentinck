package _03_harry_potter;

public class harrypotterrunner {
public static void main(String[] args) {
	HarryPotter potter = new HarryPotter();
	potter.makeInvisible(true);
	potter.spyOnSnape();
	potter.makeInvisible(false);
	String spell = "pew pewpewpewpew";
	potter.castSpell(spell);
}
}
