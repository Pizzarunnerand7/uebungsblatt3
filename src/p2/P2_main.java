package p2;

public class P2_main {

	public static void main(String[] args) {
		int a = 100;
		int b = 4;
		int c = 1;
		int d = 2;
		d = 0;
		boolean E1 = a == b;
		boolean E2 = a == b || a == c;
		boolean E3 = a + b >= c;
		boolean E4 = a + b + c >= 100;
		if (E1) {
			d++;
		}
		if (E2) {
			d++;
		}
		if (E3) {
			d++;
		}
		if (E4) {
			d++;
		}
		System.out.println(d);

	}

}
