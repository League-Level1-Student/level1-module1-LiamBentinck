package _05_vault;

public class JamesBond {
public int findCode(Vault v) {
	for (int i = 0; i < 1000000; i++) {
		boolean Open = v.tryCode(i); 
		if (Open==true) {
			return i;
		}
	}
	return -1;
	
}
	
	
}
