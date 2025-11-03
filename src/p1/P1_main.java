package p1;

public class P1_main {

	public static void main(String[] args) {
		int wuerfel = 2;
		if (wuerfel == 1 || wuerfel == 4) {
			System.out.println("Gewonnen!");
		}
		if (wuerfel == 2) {
			System.out.println("verloren");
		}
		if (wuerfel == 5) {
			System.out.println("Unentschieden");
		}

	}

}
