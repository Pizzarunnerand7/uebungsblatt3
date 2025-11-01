package h1;

public class H1_main {

	public static void main(String[] args) {
		double guthaben = 100;
		double monEingang = 5;
		int rating = 0;
		boolean negativ = false;
		boolean warnhinweis = false;
		if (guthaben < 0) {
			negativ = true;
			if (Math.abs(monEingang) >= Math.abs(guthaben)) {
				rating = rating + 1;
			} else {
				rating = rating - 1;
				if (rating < 0) {
					warnhinweis = true;
				} else {
					warnhinweis = false;
				}
			}
		} else {
			negativ = false;
		}
		if (guthaben > 0) {
			rating = rating + 3;
		}
		if (guthaben == 0) {
			rating = rating + 2;
		}

	}

}
