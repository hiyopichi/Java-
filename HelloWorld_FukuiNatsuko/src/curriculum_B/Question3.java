package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		// TODO 自動生成されたメソッド・スタブ
		// Q1 for文を使って1から10までの数字を1つずつ表示
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("\n");

		// Q2 for文を使って2から20までの偶数を1つずつ表示
		for (int n = 2; n <= 20; n = n + 2) {
			System.out.println(n);
		}
		System.out.println("\n");

		// Q3 for文を使って10から1までカウントダウンして表示
		for (int a = 10; a >= 1; a--) {
			System.out.println(a);
		}
		System.out.println("\n");

		// Q4 for文を使って1から100までの合計を表示
		int d = 0;
		for (int b = 1; b <= 100; b++) {
			d += b;
		}
		System.out.println(d);
		System.out.println("\n");

		// Q5 for文を使って三角形
		for (int str = 1; str <= 5; str++) {
			for (int str2 = 1; str2 <= str; str2++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n");

		// Q6 while文を使って1から10までを1つずつ表示
		int eNum = 1;
		while (eNum <= 10) {
			System.out.println(eNum);
			++eNum;
		}
		System.out.println("\n");

		// Q7 while文を使って2から20までの偶数を1つずつ表示
		int fNum = 2;
		while (fNum <= 20) {
			System.out.println(fNum);
			fNum += 2;
		}
		System.out.println("\n");

		// Q8 while文を使って10から1までのカウントダウンを表示
		int gNum = 10;
		while (gNum >= 1) {
			System.out.println(gNum);
			gNum--;
		}
		System.out.println("\n");

		// Q9 while文を使って1から100までの合計を表示
		int hNum = 0;
		int sum = 0;
		while (hNum <= 100) {
			sum += hNum;
			hNum++;
		}
		System.out.println(sum);
		System.out.println("\n");

		// Q10 入力が0になるまで何度も入力を受け付ける　0が入力されたら「終了しました」と表示
		Scanner scan = new Scanner(System.in);
		int sca = 0;
		while (true) {
			sca = scan.nextInt();
			scan.nextLine();
			if (sca == 0) {
				System.out.println("終了しました");
				break;
			}
		}
		System.out.println("\n");

		// Q11 for文を使用して画像の通りに出力
		for (int aa = 1; aa <= 9; aa++) {
			for (int bb = 1; bb <= 9; bb++) {
				if (bb <= 8) {
					int ee = aa * bb;
					String cc = String.format("%02d", aa);
					String dd = String.format("%02d", bb);
					String gg = String.format("%02d", ee);
					System.out.print(cc + " * " + dd + " = " + gg + " || ");
				} else {
					int ee = aa * bb;
					String cc = String.format("%02d", aa);
					String dd = String.format("%02d", bb);
					String gg = String.format("%02d", ee);
					System.out.print(cc + " * " + dd + " = " + gg);
				}
			}
			System.out.println();
		}
		System.out.println("\n");

		// Q12　入力された商品の残り台数が出力されるシステムを作成
		Random rand = new Random();
		String input_text = scan.nextLine();
		String[] items = input_text.split("、");
		int tv = rand.nextInt(12);
		int dis = 11 - tv;
		for (String good : items) {
			switch (good) {
			case "パソコン":
				int xP = rand.nextInt(12);
				System.out.println(good + "の残り台数は" + xP + "台です");
				break;
			case "冷蔵庫":
				int xR = rand.nextInt(12);
				System.out.println(good + "の残り台数は" + xR + "台です");
				break;
			case "扇風機":
				int xS = rand.nextInt(12);
				System.out.println(good + "の残り台数は" + xS + "台です");
				break;
			case "洗濯機":
				int xSn = rand.nextInt(12);
				System.out.println(good + "の残り台数は" + xSn + "台です");
				break;
			case "加湿器":
				int xK = rand.nextInt(12);
				System.out.println(good + "の残り台数は" + xK + "台です");
				break;
			case "テレビ", "ディスプレイ":
				int y = good.equals("テレビ") ? tv : dis;
				System.out.println(good + "の残り台数は" + y + "台です");
				break;
			default:
				System.out.println(good + "は指定の商品ではありません");
			}
		}

		scan.close();
	}

}
