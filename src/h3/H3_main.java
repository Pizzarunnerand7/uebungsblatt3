package h3;

public class H3_main {

	public static void main(String[] args) {
		int max = 500;
		int fix = 23;
		int wartend = 400;
		boolean istVoll = false;
		if (fix == max) {
			istVoll = true;
		} else {
			if (max - fix <= wartend) {
				wartend = wartend - max + fix;
				fix = max;
				istVoll = true;
			} else {
				fix = fix + wartend;
				wartend = 0;
				istVoll = false;
			}
		}
	}

}
