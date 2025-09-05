package curriculum_B;

public class Question2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// int型の変数scoreに75を代入
		int score;
		score = 75;
		// scoreが60以上なら"合格です！"と表示
		if (score >= 60 );
		System.out.println("合格です！");
		System.out.println("\n");
		
		// int型の変数ageに25を代入
		int age;
		age = 25;
		//ageが20以上30以下なら"適正年齢です"と表示、それ以外の場合は"対象外です"と表示
		if (age >= 20 && age <=30 ) {System.out.println("適正年齢です") ;}
		else if ( age <=20 && age>=30 ) { System.out.println("対象外です");}
		System.out.println("\n");
		
		// 定数ageに18を代入
		age = 18;
		/*ageが20以上なら成人ですと表示
		 * ageが13以上19以下なら"ティーンエイジャーです"と表示
		 *ageが12以下なら"子供です"と表示
		*/
		if (age <= 20) { System.out.println("成人です");}
		else if (age >=13 && age <=19 ) { System.out.println("ティーンエイジャーです");}
		else if (age <12 ) { System.out.println("子供です");}
		System.out.println("\n");
		
		// int型の変数x,y,zに30,15,50を代入
		int x = 30;
		int y = 15;
		int z = 50;
		// 一番大きい数値を判定して表示
		if ( x > y && x > z ) { System.out.println(x);}
		else if ( y > x && y > z ) { System.out.println(y);}
		else if ( z > x && z > y ) { System.out.println(z);}
		System.out.println("\n");
	
		// int型の変数numを用意
		int num;
		/*numの値が0より大きければ"正の数ですと表示
		 * numの値が0なら"0です"と表示
		 * numの値が0より小さければ"負の数です"と表示
		 */
		num = 11;
		if ( num > 0 ) { System.out.println("正の数です");}
		else if ( num == 0 ) { System.out.println("0です");}
		else if ( num < 0 ) { System.out.println("負の数です");}
		System.out.println("\n");
		
		// int型の変数valueを用意　valueが偶数なら"偶数です"と表示　valueが奇数なら"奇数です"と表示
		int value = 1;
		if ( value % 2 == 0 ) { System.out.println("偶数です");}
		else { System.out.println("奇数です");}
		System.out.println("\n");
		
		// int型の変数scoreに0から100の数値を代入
		score = 50;
		// 90以上なら"優"、70以上なら"良"、50点以上なら"可"、50点未満なら"不可"を表示
		if ( score >= 90 ) { System.out.println("優");}
		else if ( score >= 70 ) {System.out.println("良");}
		else if ( score >= 50 ) { System.out.println("可");}
		else if (score < 50) { System.out.println("不可");}
		System.out.println("\n");
		
		// 入力がnullまたは空文字("")のときに「入力が無効です」と表示する処理
		String str = null;
		if (str != null && str.equals(""));
			{System.out.println("入力が無効です");}
		System.out.println("\n");
		
		// int型の変数dayを用意、1〜7の数値を代入　dayの値に応じて曜日を表示、それ以外の値なら"無効な入力です"と表示
		int day = 2;
			switch (day) {
				case 1:
					System.out.println("月曜日");
					break;
				case 2:
					System.out.println("火曜日");
					break;
				case 3:
					System.out.println("水曜日");
					break;
				case 4:
					System.out.println("木曜日");
					break;
				case 5:
					System.out.println("金曜日");
					break;
				case 6:
					System.out.println("土曜日");
					break;
				case 7:
					System.out.println("日曜日");
					break;
				default:
					System.out.println("無効な入力です");
			}
			System.out.println("\n");
			
			// int型の変数monthを用意、1〜12の数値を代入
			int month = 11;
			switch (month) {
				case 12,1,2:
					System.out.println("冬");
					break;
				case 3,4,5:
					System.out.println("春");
					break;
				case 6,7,8:
					System.out.println("秋");
					break;
				case 9,10,11:
					System.out.println("冬");
					break;
				default:
					System.out.println("無効な月です");
					break;
				
			}
				
		}
	}

