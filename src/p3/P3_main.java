package p3;

public class P3_main {
	public static void abs(int i) {
		if (i < 0) {
			i = i * -1;
		}
		System.out.println(i);
	}

	public static void sqr(int j) {
		j = j * j;
		System.out.println(j);
	}

	public static void evn(int k) {
		if (k % 2 == 0) {
			System.out.println("gerade");
		}
		if (k % 2 == 1) {
			System.out.println("ungerade");
		}
	}

	public static void main(String[] args) {

	}

}
