package _05_vault;

public class Runner {
public static void main(String[] args) {
	Vault v = new Vault();
	JamesBond j = new JamesBond();
	int b = j.findCode(v);
	System.out.println("This is the password "+b);
}
}
