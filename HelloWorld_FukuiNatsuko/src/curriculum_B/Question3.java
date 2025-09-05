package curriculum_B;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		// TODO 自動生成されたメソッド・スタブ
		// Q1 for文を使って1から10までの数字を1つずつ表示
		for (int i = 1; i <= 10; i++) {
			if (i > 10) {
				break;
			}
			{
				System.out.println(i);
			}
		}
		System.out.println("\n");

		// Q2 for文を使って2から20までの偶数を1つずつ表示
		{
			int[] numbers = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
			for (int num : numbers) {
				System.out.println(num);
			}
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

		// Q5 for文を使って三角形を出力
		String[] str = { "*", "**", "***", "****", "*****" };
		for (String rst : str) {
			System.out.println(rst);
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
		while (true) {
			sum += hNum;
			hNum++;
			if (hNum > 100) {
				System.out.println(sum);
				{
					break;
				}
			}
		}
		System.out.println("\n");

		// Q10 入力が0になるまで何度も入力を受け付ける　0が入力されたら「終了しました」と表示
		Scanner scanner = new Scanner(System.in);
		int sca = 0;
		while (true) {
			sca = scanner.nextInt();
			if (sca == 0) {
				System.out.println("終了しました");
				{
					break;
				}
			}
			System.out.println("\n");

			// Q11 for文を使用して画像の通りに出力
			int aa = 1;
			int bb = 1;
			String cc = String.format("%02d", aa);
			String dd = String.format("%02d", bb);
			int ee = aa * bb;
			for (; aa <= 9; aa++) {
				for (; bb <= 9; bb++) {
					System.out.println(cc + "*" + dd + "=" + ee);
				}
			}

		}
	}

}
