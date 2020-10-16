package _04_popcorn;

public class popcornRunner {
public static void main(String[] args) {
	Popcorn pop = new Popcorn("salt");
	Microwave micro = new Microwave();
	micro.putInMicrowave(pop);
	micro.setTime(10);
	micro.startMicrowave();
	
	
}
}
