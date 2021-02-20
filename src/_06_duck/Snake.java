package _06_duck;

import javax.swing.JOptionPane;

public class Snake {
	int numberOfFingers;
	String favoriteFood;
	
	Snake(String favoriteFood, int numberOfFingers) {
        this.favoriteFood = favoriteFood;
        this.numberOfFingers = numberOfFingers;
 }
	void slither() {
		JOptionPane.showMessageDialog(null, "The snake slithers.");
	}
	void hiss() {
		JOptionPane.showMessageDialog(null, "The snake hisses.");
	}


}
