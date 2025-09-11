package curriculum_B;

public class Question5 {

	// TODO 自動生成されたメソッド・スタブ

	// Q1 メソッドhelloWorldを作成
	public static void helloWorld() {
		System.out.println("Hello,World!");
	}

	// Q2 メソッドdoubleValueを作成
	public static int doubleValue(int num) {
		return num * 2;
	}

	// Q3 メソッドisEvenを作成
	public static boolean isEven(int num) {
		return num % 2 == 0;
	}

	public static void main(String[] args) {
		// Q1 "Hello,World!"を表示
		helloWorld();
		System.out.println("\n");

		// Q2 戻り値をもとに実行例のように表示
		int input = 10;
		int result = doubleValue(input);
		System.out.println(input + "を2倍すると" + result + "です。");
		System.out.println("\n");

		// Q3 num1に7、num2に10を設定し表示
		int num1 = 7;
		int num2 = 10;
		if (isEven(num1)) {
			System.out.println(num1 + "は偶数です。");
		} else {
			System.out.println(num1 + "は奇数です。");
		}
		if (isEven(num2)) {
			System.out.println(num2 + "は偶数です。");
		} else {
			System.out.println(num2 + "は奇数です。");
		}
		System.out.println("\n");

	}

}

