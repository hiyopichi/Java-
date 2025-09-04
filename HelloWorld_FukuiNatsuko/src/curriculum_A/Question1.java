package curriculum_A;

public class Question1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/* 
		 * 各型の変数を宣言し、初期値を設定する
		 */
		// 変数byteNumの初期値を設定
		byte byteNum;
		// 変数shortNumの初期値を設定
		short shortNum;
		// 変数intNumの初期値を設定
		int intNum;
		// 変数longNumの初期値を設定
		long longNum;
		// 変数floatNumの初期値を設定
		float floatNum;
		// 変数doubleNumの初期値を設定
		double doubleNum;
		// 変数letterの初期値を設定
		char letter;
		// 変数lettersの初期値を設定
		String letters;
		//　変数isBooleanの初期値を設定
		boolean isBoolean;
		
		/*
		 * 宣言した各型の変数に指定された値を代入する
		 */
		// 変数byteNumに10を代入
		byteNum = 10;
		// 変数shortNumに100を代入
		shortNum = 100;
		// 変数intNumに1000を代入
		intNum = 1000;
		// 変数longNumに10000を代入
		longNum = 10000;
		// 変数floatNumに9.5fを代入
		floatNum = 9.5f;
		// 変数doubleNumに10.5を代入
		doubleNum = 10.5;
		// 変数letterに"a"を代入
		letter = 'a';
		// 変数lettersに"ハローを代入"
		letters = "ハロー";
		// 変数isBooleanにtrueを代入
		isBoolean = true;
		/*
		 * 値を代入した変数を用いて出力する
		 */
		// 11110を出力
		System.out.println( byteNum + shortNum + intNum + longNum );
		// 20を出力
		System.out.println( byteNum*2 );
		// aハローtrueを出力
		System.out.println(  letter + letters + isBoolean  );
		// 数字を全て足して出力
		System.out.println( byteNum + shortNum + intNum + longNum + floatNum + doubleNum );
		// 小数点意外の数字を全てかけて出力
		System.out.println ( byteNum * shortNum * intNum * longNum );
		// 10.5割る100を出力
		System.out.println( 10.5/100 );
		// 10引く100をして出力
		System.out.println( byteNum - shortNum );
		System.out.println("\n");
		
		// nameというString型の変数を宣言し、その変数に"山田太郎"という値を代入
		String name = "山田太郎";
		// name変数を使用してコンソールに こんにちは！山田太郎さん と表示
		System.out.println("こんにちは！" + name + "さん");
		System.out.println("\n");
		
		// ageというint型の変数を宣言し25を代入する
		int age = 25;
		// age変数を使用してコンソールに 年齢: 25歳 と表示
		System.out.println( "年齢" + age + "歳");
		System.out.println("\n");
		
		// num1というint型の変数を宣言し、10を代入
		int num1;
		num1 = 10;
		// num2というint型の変数を宣言し、5wを代入
		int num2;
		// num1とnum2を足した結果をsumに代入し、コンソールに表示
		num2 = 5;
		int sum;
		sum = num1 + num2;
		System.out.println(sum);
		System.out.println("\n");
		
		// scoreというint型の変数を宣言し、80を代入
		int score = 80;
		// scoreに20を加えて、更新する
		score = score+20;
		// 最終スコア:100をscoreを使用してコンソールに表示
		System.out.println( "最終スコア:" + score );
		System.out.println("\n");
		
		// priceというdouble型の変数を宣言し、99.99を代入
		double price = 99.99;
		// priceをint型に変換し、整数価格:99とコンソールに表示
		int intPrice = (int) price;
		System.out.println( "整数価格:" + intPrice );
		System.out.println("\n");
		
		// String型の変数numに50を代入
		String numStr = "123";
		int numInt = Integer.parseInt(numStr);
		// 変換後の値:の後ろにnumStr+10した結果をコンソールに表示
		System.out.println(numInt + ":" + numStr +10 );
		System.out.println("\n");
		
		//int型の変変数numに50を代入
		int num = 50;
		// numをString型に変換し、"得点:50点"の形で表示
		String str =String.valueOf(num);
		System.out.println("得点" + str + "点");
		System.out.println("\n");
		
		// int型の変数aに10を代入
		int a = 10;
		// int型の変数bに20を代入
		int b = 20;
		// aがbより小さいかどうかをboolean変数resultに代入
		boolean result = ( a < b);
		System.out.println(result);
		System.out.println("\n");
		
		//int型の変数xに15を代入
		int x = 15;
		// xが10以上なら"OK"、そうでなければ"NG"を表示
		if (x <= 10) {
			System.out.println("OK");
		} else {
			System.out.println("NG");
		}
		System.out.println("\n");
		
		// String text="私はJavaが好きです。Javaは楽しい！";という文章の中にある「Java」を「Python」に置き換えて表示
				String text = "私はJavaが好きです。Javaは楽しい！";
				System.out.println(text.replace("Java","Python"));
	}

		
}