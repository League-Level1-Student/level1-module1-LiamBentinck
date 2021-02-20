package _06_duck;

import javax.swing.JOptionPane;

public class Duck {
	int numberOfFriends;
	String favoriteFood;

	Duck(String favoriteFood, int numberOfFriends) {
		this.favoriteFood = favoriteFood;
		this.numberOfFriends = numberOfFriends;
	}

	public static void main(String[] args) {
		Duck bob=new Duck("pizza", 89);
		bob.quack();
		bob.waddle();
	}

	void quack() {
	JOptionPane.showMessageDialog(null, "bob makes noise because he just quacked a lot and it is annoying");	
	}

	void waddle() {
		JOptionPane.showMessageDialog(null, "bob waddles because what else is he supposed to do in his free time?");
	}
}